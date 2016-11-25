package core;

import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * starts the tomcat server which runs on port 9999
 */
public class Launcher {

    private static final Logger logger = LoggerFactory.getLogger(Launcher.class);


    public static void main(String[] args) throws Exception {

        String webAppDirLocation = "src/main/webapp/";
        String newWebAppDirLocation = "home/webapp/";

        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8888);

        //Write webapp folder into deployment-monitor-home folder for distribution
        FileUtils.copyDirectory(new File(webAppDirLocation), new File(newWebAppDirLocation));

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/predetors",
                new File(newWebAppDirLocation).getAbsolutePath());

        logger.info("configuring app with basedir: " + new File(newWebAppDirLocation).getAbsolutePath());

        // Declare an alternative location for "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);

        tomcat.start();
        tomcat.getServer().await();
    }

}
