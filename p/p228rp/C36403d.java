package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.d */
public enum C36403d implements C38174i<C36401c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96866d;

    public Object get() {
        Object obj = this.f96866d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96866d;
                if (obj == obj2) {
                    obj = new C36401c();
                    this.f96866d = obj;
                }
            }
        }
        return (C36401c) obj;
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
        return "provider " + C36401c.class.getName();
    }
}
