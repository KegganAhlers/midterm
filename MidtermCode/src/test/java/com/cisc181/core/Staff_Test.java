package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}
	
	@Test
	public void StaffTest0() throws PersonException {
		ArrayList<Staff> staff = new ArrayList<Staff>();
		Date birthday = new Date(98, 11, 15);
		Staff staff0 = new Staff("First", "Middle", "Last", birthday, "222 Super Street", "(302)-423-9001", "email@email.com", "Never", 4, 500, birthday, null);
		Staff staff1 = new Staff("First", "Middle", "Last", birthday, "123 Upland Ave", "(302)-662-4534", "let1@gmail.com", "Sometimes", 6, 10, birthday, null);
		Staff staff2 = new Staff("First", "Middle", "Last", birthday, "321 Biggums Road", "(302)-698-7090", "buck@hotmail.com", "Always", 5, 4000, birthday, null);
		Staff staff3 = new Staff("First", "Middle", "Last", birthday, "765 Times Square", "(302)-111-1111", "tj@udel.edu", "Once", 10, 20000, birthday, null);
		Staff staff4 = new Staff("First", "Middle", "Last", birthday, "480 Penn Way", "(302)-359-1261", "google@gmail.com", "Wednesday", 7, 9000, birthday, null);
		staff.add(staff0);
		staff.add(staff1);
		staff.add(staff2);
		staff.add(staff3);
		staff.add(staff4);
		double i = 0;
		for (Staff emp : staff){
			i = i + emp.getSalary(); }
		double actual = i/5;
		double expect = 6702;
		assertEquals(actual, expect, 1);
		}
	@Test(expected = PersonException.class)
	public void InvalidPhoneTest() throws PersonException {
		Date birthday = new Date(98, 10, 5);
		Staff newMember = new Staff("First", "Middle", "Last", birthday, "222 Super Street", "3024239001", "email@email.com", "Never", 4, 500, birthday, null);	
	}
	@Test(expected = PersonException.class)
	public void InvalidDOBTest() throws PersonException {
		Date birthday = new Date(1900, 10, 5);
		Staff newMember = new Staff("First", "Middle", "Last", birthday, "222 Super Street", "(302)-423-9001", "email@email.com", "Never", 4, 500, birthday, null);
		}
}



