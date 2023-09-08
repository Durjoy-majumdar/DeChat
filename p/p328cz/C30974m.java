package p328cz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cz.m */
public enum C30974m implements C38174i<C58007l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83122d;

    public Object get() {
        Object obj = this.f83122d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83122d;
                if (obj == obj2) {
                    obj = new C58007l();
                    this.f83122d = obj;
                }
            }
        }
        return (C58007l) obj;
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
        return "provider " + C58007l.class.getName();
    }
}
