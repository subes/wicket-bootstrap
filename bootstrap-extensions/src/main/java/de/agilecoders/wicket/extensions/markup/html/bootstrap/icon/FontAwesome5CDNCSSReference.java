package de.agilecoders.wicket.extensions.markup.html.bootstrap.icon;

import org.apache.wicket.request.Url;
import org.apache.wicket.request.resource.UrlResourceReference;

/**
 * <strong>Important</strong>: To use font-awesome 5.x you need to declare the Maven/Gradle dependency
 * in your application pom.xml/build.gradle, for example:
 *
 * <br/>
 *  &lt;dependency&gt;<br/>
 *      &lt;groupId&gt;org.webjars&lt;/groupId&gt;<br/>
 *      &lt;artifactId&gt;font-awesome&lt;/artifactId&gt;<br/>
 *      &lt;version&gt;5.15.1&lt;/version&gt;<br/>
 *  &lt;/dependency&gt;<br/>
 *
 * reference for font awesome 5.x css via CDN
 */
public class FontAwesome5CDNCSSReference extends UrlResourceReference{
    private static final long serialVersionUID = 1L;
    private static final String CDNURL = "https://use.fontawesome.com/releases/v5.13.0/css/all.css";

    /**
     * Singleton instance of this reference
     */
    private static final FontAwesome5CDNCSSReference INSTANCE = new FontAwesome5CDNCSSReference();

    /**
     * @return the single instance of the resource reference
     */
    public static FontAwesome5CDNCSSReference instance() {
        return INSTANCE;
    }

    private FontAwesome5CDNCSSReference() {
        super(Url.parse(CDNURL));
    }

}
