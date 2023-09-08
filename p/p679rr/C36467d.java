package p679rr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rr.d */
public enum C36467d implements C38174i<C63510c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97037d;

    public Object get() {
        Object obj = this.f97037d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97037d;
                if (obj == obj2) {
                    obj = new C63510c();
                    this.f97037d = obj;
                }
            }
        }
        return (C63510c) obj;
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
        return "provider " + C63510c.class.getName();
    }
}
