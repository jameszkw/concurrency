package com.zkw.priorityqueue;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String x, String y) {
		if(x.length() - y.length() < 0)
			return -1;
		if(x.length() - y.length() > 0)
			return 1;
		return 0;
	}
}
