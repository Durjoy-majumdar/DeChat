package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.x */
public enum C30950x implements C38174i<C58000w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83073d;

    public Object get() {
        Object obj = this.f83073d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83073d;
                if (obj == obj2) {
                    obj = new C58000w();
                    this.f83073d = obj;
                }
            }
        }
        return (C58000w) obj;
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
        return "provider " + C58000w.class.getName();
    }
}
