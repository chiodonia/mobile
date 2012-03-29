package ch.post.it.lab.mobile.app.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.handlers.CommandHandler;
import com.xedge.jquery.mobile.client.JQueryMobile;
import com.xedge.jquery.mobile.client.JQueryMobile.Transition;
import com.xedge.jquery.mobile.client.handlers.PageHideEventHandler;
import com.xedge.jquery.mobile.client.model.PageHideEventValues;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void onUncaughtException(Throwable e) {
				Window.alert("Genetal error: " + e.getMessage());
			}
		});

		final PhoneGap phoneGap = GWT.create(PhoneGap.class);

		phoneGap.addHandler(new PhoneGapAvailableHandler() {
			public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
				startApp(phoneGap);
			}
		});

		phoneGap.addHandler(new PhoneGapTimeoutHandler() {
			public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
				Window.alert("PhoneGap timeout event received");
			}
		});

		phoneGap.initializePhoneGap();

		JQueryMobile.init(new CommandHandler() {
			@Override
			public void execute() {
				System.out.println("Loading jQuery Mobile"); // JQuery Mobile
																// has been
																// loaded

				JQueryMobile.setDefaultPageTransition(Transition.pop); // change
																		// default
																		// PageTransition
																		// to
																		// pop

				// add hide page handler
				JQueryMobile jqueryMobileItem = JQueryMobile
						.getJQueryMobile(JQuery.select("div"));
				jqueryMobileItem.addPagehideHandler(new PageHideEventHandler() {
					@Override
					public void eventComplete(JQEvent event,
							JQuery currentJQuery,
							PageHideEventValues eventValues) {
						System.out.println(event.getType()); // event type
						System.out.println(currentJQuery.get(0).getId()); // id
																			// of
																			// the
																			// page
																			// being
																			// hidden
						System.out.println(eventValues.getNextPage().get(0)
								.getId()); // id of the page to be loaded next
						System.out.println(JQueryMobile.getOrientation()); // orientation
																			// of
																			// the
																			// device
					}
				});
			}
		});
	}

	private void startApp(PhoneGap phoneGap) {
		String uuid = "unknown";
		if (phoneGap != null) {
			if (phoneGap.getDevice() != null) {
				uuid = phoneGap.getDevice().getUuid();
			}
		}
		RootPanel.get().add(new AppWidget(uuid));
	}

}
