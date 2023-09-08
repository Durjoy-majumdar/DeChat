package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.t */
public enum C38757t implements C38174i<C53374s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104557d;

    public Object get() {
        Object obj = this.f104557d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104557d;
                if (obj == obj2) {
                    obj = new C53374s();
                    this.f104557d = obj;
                }
            }
        }
        return (C53374s) obj;
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
        return "provider " + C53374s.class.getName();
    }
}
