package p679rr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rr.f */
public enum C36468f implements C38174i<C63511e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97040d;

    public Object get() {
        Object obj = this.f97040d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97040d;
                if (obj == obj2) {
                    obj = new C63511e();
                    this.f97040d = obj;
                }
            }
        }
        return (C63511e) obj;
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
        return "provider " + C63511e.class.getName();
    }
}
