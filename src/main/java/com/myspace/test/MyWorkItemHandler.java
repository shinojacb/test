package com.myspace.test;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.internal.runtime.Cacheable;

public class MyWorkItemHandler implements org.kie.api.runtime.process.WorkItemHandler , Cacheable{
	
	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		
		manager.completeWorkItem(workItem.getId(), null);
		
		
	}

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		
	}

}
