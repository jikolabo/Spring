package service;

import java.util.ArrayList;

import entity.Member;

public interface MemberService {
	
	String greet(int i);
	
	int sumof(int x, int y);
	
	ArrayList<Member> getAll();
	

}
