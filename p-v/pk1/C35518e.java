package pk1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pk1.e */
public enum C35518e implements C38174i<C11948d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94982d;

    public Object get() {
        Object obj = this.f94982d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94982d;
                if (obj == obj2) {
                    obj = new C11948d();
                    this.f94982d = obj;
                }
            }
        }
        return (C11948d) obj;
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
        return "provider " + C11948d.class.getName();
    }
}
