package p587kn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kn.b */
public enum C33943b implements C38174i<C76600a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91661d;

    public Object get() {
        Object obj = this.f91661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91661d;
                if (obj == obj2) {
                    obj = new C76600a();
                    this.f91661d = obj;
                }
            }
        }
        return (C76600a) obj;
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
        return "provider " + C76600a.class.getName();
    }
}
