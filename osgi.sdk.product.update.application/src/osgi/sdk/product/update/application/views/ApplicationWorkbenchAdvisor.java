package osgi.sdk.product.update.application.views;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/** 
 * <p>Title: ApplicationActionBarAdvisor   </p>
 * <p>Description: This workbench advisor creates the window advisor, and specifies the perspective id for the initial window. </p>
 * <p>Create Time: 2016年8月28日           </p>
 * @author lianggz
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return Perspective.ID;
	} 
	
}
