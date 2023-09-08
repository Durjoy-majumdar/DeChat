package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.y */
public enum C36430y implements C38174i<C48071x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96933d;

    public Object get() {
        Object obj = this.f96933d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96933d;
                if (obj == obj2) {
                    obj = new C48071x();
                    this.f96933d = obj;
                }
            }
        }
        return (C48071x) obj;
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
        return "provider " + C48071x.class.getName();
    }
}
