package p636ot;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ot.b */
public enum C35303b implements C38174i<C35302a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94571d;

    public Object get() {
        Object obj = this.f94571d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94571d;
                if (obj == obj2) {
                    obj = new C35302a();
                    this.f94571d = obj;
                }
            }
        }
        return (C35302a) obj;
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
        return "provider " + C35302a.class.getName();
    }
}
