package com.myspace.test;

import org.drools.core.spi.ProcessContext;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.internal.runtime.StatefulKnowledgeSession;

public class MySignalWorkItemHandler implements org.kie.api.runtime.process.WorkItemHandler {
	KieSession ksession;
	public MySignalWorkItemHandler(StatefulKnowledgeSession ksession) {
		this.ksession = ksession;
	}

	@Override
	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		ProcessContext kcontext = new ProcessContext(ksession);
//			kcontext.setVariable("movetoNext", false);
			for (int i = 0; i < 100; ++i) {
				ksession.signalEvent("LINE_SIGNAL", false, workItem.getProcessInstanceId());
			}
		

	}

	@Override
	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

	}

}
