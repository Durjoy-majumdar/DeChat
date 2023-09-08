package ga3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ga3.h */
public enum C32367h implements C38174i<C32366g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85892d;

    public Object get() {
        Object obj = this.f85892d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85892d;
                if (obj == obj2) {
                    obj = new C32366g();
                    this.f85892d = obj;
                }
            }
        }
        return (C32366g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C32366g.class.getName();
    }
}
