package com.myspace.test;

import org.jbpm.bpmn2.BPMN2ProcessProviderImpl;

public class Test {
public static void main(String[] args) {
	System.out.println(BPMN2ProcessProviderImpl.class.getResource("/org/jbpm/bpmn2/BPMN2ProcessProviderImpl.class").getFile());
	BPMN2ProcessProviderImpl a=new BPMN2ProcessProviderImpl();
}
}
