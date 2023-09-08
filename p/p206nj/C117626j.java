package p206nj;

import java.security.PrivilegedAction;

/* renamed from: nj.j */
public class C117626j implements PrivilegedAction {
    public C117626j(String str) {
    }

    public Object run() {
        String property = System.getProperty("file.encoding");
        if (property == null) {
            return null;
        }
        return property;
    }
}
