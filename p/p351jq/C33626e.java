package p351jq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jq.e */
public enum C33626e implements C38174i<C21270d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91011d;

    public Object get() {
        Object obj = this.f91011d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91011d;
                if (obj == obj2) {
                    obj = new C21270d();
                    this.f91011d = obj;
                }
            }
        }
        return (C21270d) obj;
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
        return "provider " + C21270d.class.getName();
    }
}
