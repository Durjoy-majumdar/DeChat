package p656py;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: py.e */
public enum C35730e implements C38174i<C89443d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95436d;

    public Object get() {
        Object obj = this.f95436d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95436d;
                if (obj == obj2) {
                    obj = new C89443d();
                    this.f95436d = obj;
                }
            }
        }
        return (C89443d) obj;
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
        return "provider " + C89443d.class.getName();
    }
}
