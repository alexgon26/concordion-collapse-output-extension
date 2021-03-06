package spec.concordion.ext.collapse.config.linktext;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import spec.concordion.ext.collapse.AbstractCollapseFixture;
import test.concordion.ext.collapse.DummyCollapseExtensionFactory;

@RunWith(ConcordionRunner.class)
public class LinktextFixture extends AbstractCollapseFixture {

	@Before
	public void installExtension() {
		System.setProperty("concordion.extensions",
				DummyCollapseExtensionFactory.class.getName());
		
		DummyCollapseExtensionFactory.setLinkText("Custom Linktext");
	}
	
	@After
	public void resetExtensionFactory() {
		DummyCollapseExtensionFactory.setLinkText(null);
	}

}
