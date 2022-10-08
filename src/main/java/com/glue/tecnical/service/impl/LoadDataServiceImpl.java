package com.glue.tecnical.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.glue.tecnical.model.Product;
import com.glue.tecnical.service.LoadDataService;

public class LoadDataServiceImpl implements LoadDataService {

	private static final String DELIMITER = ";";

	public List<Product> readFile(File file) {
		List<Product> listProducts = new ArrayList<Product>();

		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				records.add(getRecordFromLine(scanner.nextLine()));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Iterator<List<String>> iterator = records.iterator();
		while (iterator.hasNext()) {
			List<String> productString = iterator.next();

			Map<String, Integer> stocks = new HashMap<String, Integer>();

			String[] splitBySlash = productString.get(3).split(" / ");
			for (String stock : splitBySlash) {
				String[] stockSplited = stock.split(":");
				stocks.put(stockSplited[0], Integer.parseInt(stockSplited[1]));
			}

			Product product1 = new Product(Long.parseLong(productString.get(0)), productString.get(1),
					Integer.parseInt(productString.get(2)), stocks, null);
			listProducts.add(product1);
		}

		return listProducts;
	}

	private List<String> getRecordFromLine(String line) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(DELIMITER);
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	}

}
