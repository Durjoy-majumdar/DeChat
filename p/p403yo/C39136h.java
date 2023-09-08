package p403yo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yo.h */
public enum C39136h implements C38174i<C39135g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105339d;

    public Object get() {
        Object obj = this.f105339d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105339d;
                if (obj == obj2) {
                    obj = new C39135g();
                    this.f105339d = obj;
                }
            }
        }
        return (C39135g) obj;
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
        return "provider " + C39135g.class.getName();
    }
}
