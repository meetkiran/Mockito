package com.junitdemo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Hellojunit {

	int ch, ch1,ch2;

	public Hellojunit(int k, int j) {
		ch = k;
		ch1 = j;
	}

	@Parameters
	public static Collection<int[]> paramTest() {
		int[][] arr = { { 2, 2 }, { 3, 4 } };
		return Arrays.asList(arr);
	}

	@Test
	public void test() {
		assertEquals(ch, 2);
	}

}
