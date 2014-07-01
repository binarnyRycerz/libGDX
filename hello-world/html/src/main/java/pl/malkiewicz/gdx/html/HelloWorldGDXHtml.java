package pl.malkiewicz.gdx.html;

import pl.malkiewicz.gdx.core.HelloWorldGDX;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class HelloWorldGDXHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new HelloWorldGDX();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
