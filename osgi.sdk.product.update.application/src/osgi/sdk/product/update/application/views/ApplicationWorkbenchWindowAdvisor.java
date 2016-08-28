package osgi.sdk.product.update.application.views;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/** 
 * <p>Title: ApplicationWorkbenchWindowAdvisor   </p>
 * <p>Description: ApplicationWorkbenchWindowAdvisor </p>
 * <p>Create Time: 2016年8月28日           </p>
 * @author lianggz
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
        return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        configurer.setInitialSize(new Point(600, 400));
        configurer.setShowCoolBar(true);
        configurer.setShowStatusLine(false);
        // ״̬��
        configurer.setShowStatusLine(true);
        // ����ָʾ��
        configurer.setShowProgressIndicator(true);
    }  
}
