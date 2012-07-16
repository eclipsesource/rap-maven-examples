package com.eclipsesource.rap.examples.maven;

import org.eclipse.rwt.lifecycle.IEntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DemoApplication implements IEntryPoint {

	private String buttonText = "Hello Maven World";

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public int createUI() {
		Display display = new Display();
		Shell mainShell = new Shell(display, SWT.TITLE);
		mainShell.setText("RAP Maven Demo");
		mainShell.setMaximized(true);
		mainShell.setLayout(new GridLayout());

		Button button = new Button(mainShell, SWT.PUSH);
		button.setText(buttonText);

		mainShell.layout();
		mainShell.open();
		return 0;
	}
}
