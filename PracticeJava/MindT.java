package mySeleniumPkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class MindT {

	public static void main(String[] args) {
		HashMap<String,String> mp= new HashMap<String,String>();
		mp.put("jko","1");
		mp.put("abs","2");
		System.out.println(mp);
		Iterator<Map.Entry<String, String>> itr=mp.entrySet().iterator();

		while(itr.hasNext()){

		Map.Entry<String, String> mpstore = itr.next();

		System.out.println(mpstore.getKey() +"  "+ mpstore.getValue());


		}}
}
