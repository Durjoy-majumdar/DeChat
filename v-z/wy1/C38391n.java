package wy1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wy1.n */
public enum C38391n implements C38174i<C53224d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101284d;

    public Object get() {
        Object obj = this.f101284d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101284d;
                if (obj == obj2) {
                    obj = new C53224d();
                    this.f101284d = obj;
                }
            }
        }
        return (C53224d) obj;
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
        return "provider " + C53224d.class.getName();
    }
}
