import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by alexander on 12.08.16.
 */
public class ClassLoaderPlag extends URLClassLoader {

    public ClassLoaderPlag(URL[] url) {

        super(url);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.equals("ru.pickkrab.classloader.Plugin") || name.startsWith("java")) {
            return super.loadClass(name);
        }
        return findClass(name);
    }
}
