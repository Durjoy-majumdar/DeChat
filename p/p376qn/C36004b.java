package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.b */
public enum C36004b implements C38174i<C101207a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95997d;

    public Object get() {
        Object obj = this.f95997d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95997d;
                if (obj == obj2) {
                    obj = new C101207a();
                    this.f95997d = obj;
                }
            }
        }
        return (C101207a) obj;
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
        return "provider " + C101207a.class.getName();
    }
}
