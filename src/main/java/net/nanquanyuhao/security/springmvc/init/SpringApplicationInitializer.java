package net.nanquanyuhao.security.springmvc.init;

import net.nanquanyuhao.security.springmvc.config.ApplicationConfig;
import net.nanquanyuhao.security.springmvc.config.WebConfig;
import net.nanquanyuhao.security.springmvc.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Administrator
 * @version 1.0
 **/
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * spring容器，相当于加载 applicationContext.xml
     *
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    /**
     * servletContext，相当于加载springmvc.xml
     *
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * url-mapping
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
