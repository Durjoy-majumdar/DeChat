package p417qz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qz.t */
public enum C36223t implements C38174i<C101322s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96482d;

    public Object get() {
        Object obj = this.f96482d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96482d;
                if (obj == obj2) {
                    obj = new C101322s();
                    this.f96482d = obj;
                }
            }
        }
        return (C101322s) obj;
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
        return "provider " + C101322s.class.getName();
    }
}
