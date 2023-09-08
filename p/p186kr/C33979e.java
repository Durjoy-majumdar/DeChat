package p186kr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kr.e */
public enum C33979e implements C38174i<C10400d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91753d;

    public Object get() {
        Object obj = this.f91753d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91753d;
                if (obj == obj2) {
                    obj = new C10400d();
                    this.f91753d = obj;
                }
            }
        }
        return (C10400d) obj;
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
        return "provider " + C10400d.class.getName();
    }
}
