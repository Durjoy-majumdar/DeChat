package p517fa;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fa.h */
public enum C31973h implements C38174i<C75732g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85151d;

    public Object get() {
        Object obj = this.f85151d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85151d;
                if (obj == obj2) {
                    obj = new C75732g();
                    this.f85151d = obj;
                }
            }
        }
        return (C75732g) obj;
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
        return "provider " + C75732g.class.getName();
    }
}
