package io.github.ihexon.logutils;

import io.github.ihexon.common.Appender;

import java.util.Enumeration;

public interface AppenderAttachable {

	public void addAppender(Appender newAppender);

	public Enumeration getAllAppenders();

	public Appender getAppender(String name);

	public boolean isAttached(Appender appender);

	void removeAllAppenders();

	void removeAppender(Appender appender);

	void removeAppender(String name);
}
