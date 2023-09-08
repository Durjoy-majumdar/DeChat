package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.y */
public enum C36130y implements C38174i<C63338x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96283d;

    public Object get() {
        Object obj = this.f96283d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96283d;
                if (obj == obj2) {
                    obj = new C63338x();
                    this.f96283d = obj;
                }
            }
        }
        return (C63338x) obj;
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
        return "provider " + C63338x.class.getName();
    }
}
