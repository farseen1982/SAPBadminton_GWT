package com.farseen.sapbadminton.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class EntrySapBadminton implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new Label("This is the app from Google"));

	}

}
