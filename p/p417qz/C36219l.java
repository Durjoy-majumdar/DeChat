package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.l */
public enum C36219l implements C38174i<C101319k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96470d;

    public Object get() {
        Object obj = this.f96470d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96470d;
                if (obj == obj2) {
                    obj = new C101319k();
                    this.f96470d = obj;
                }
            }
        }
        return (C101319k) obj;
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
        return "provider " + C101319k.class.getName();
    }
}
