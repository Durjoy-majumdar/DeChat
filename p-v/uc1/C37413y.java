package uc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uc1.y */
public enum C37413y implements C38174i<C37412x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98903d;

    public Object get() {
        Object obj = this.f98903d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98903d;
                if (obj == obj2) {
                    obj = new C37412x();
                    this.f98903d = obj;
                }
            }
        }
        return (C37412x) obj;
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
        return "provider " + C37412x.class.getName();
    }
}
