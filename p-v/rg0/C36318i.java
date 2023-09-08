package rg0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rg0.i */
public enum C36318i implements C38174i<C13003h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96677d;

    public Object get() {
        Object obj = this.f96677d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96677d;
                if (obj == obj2) {
                    obj = new C13003h();
                    this.f96677d = obj;
                }
            }
        }
        return (C13003h) obj;
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
        return "provider " + C13003h.class.getName();
    }
}
