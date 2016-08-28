package osgi.sdk.product.update.application.views;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/** 
 * <p>Title: ApplicationWorkbenchWindowAdvisor   </p>
 * <p>Description: ApplicationWorkbenchWindowAdvisor </p>
 * <p>Create Time: 2016年8月28日           </p>
 * @author lianggz
 */
public class Perspective implements IPerspectiveFactory {

	public static final String ID = "osgi.sdk.product.update.application.views.perspective";

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
	}
}
