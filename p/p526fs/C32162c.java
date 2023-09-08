package p526fs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fs.c */
public enum C32162c implements C38174i<C45806b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85494d;

    public Object get() {
        Object obj = this.f85494d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85494d;
                if (obj == obj2) {
                    obj = new C45806b();
                    this.f85494d = obj;
                }
            }
        }
        return (C45806b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C45806b.class.getName();
    }
}
