package ch.post.it.lab.mobile.app.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class AppWidget extends Composite {

	private static AppWidgetUiBinder uiBinder = GWT
			.create(AppWidgetUiBinder.class);

	interface AppWidgetUiBinder extends
			UiBinder<Widget, AppWidget> {
	}

	public AppWidget(String text) {
		initWidget(uiBinder.createAndBindUi(this));
		uuid.setText(text);
	}

	@UiField()
	Label uuid;

}
