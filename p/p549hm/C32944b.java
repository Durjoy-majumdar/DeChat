package p549hm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hm.b */
public enum C32944b implements C38174i<C98491a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89531d;

    public Object get() {
        Object obj = this.f89531d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89531d;
                if (obj == obj2) {
                    obj = new C98491a();
                    this.f89531d = obj;
                }
            }
        }
        return (C98491a) obj;
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
        return "provider " + C98491a.class.getName();
    }
}
