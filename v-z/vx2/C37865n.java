package vx2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vx2.n */
public enum C37865n implements C38174i<C37864m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100243d;

    public Object get() {
        Object obj = this.f100243d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100243d;
                if (obj == obj2) {
                    obj = new C37864m();
                    this.f100243d = obj;
                }
            }
        }
        return (C37864m) obj;
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
        return "provider " + C37864m.class.getName();
    }
}
