package com.epam.svirski;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

	public StringUtils() {
	}

	public static boolean isPositiveNumber(String str) {
		return NumberUtils.isParsable(str) && NumberUtils.createNumber(str).doubleValue() > 0;
	}
	
}
