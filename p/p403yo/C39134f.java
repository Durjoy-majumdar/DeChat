package p403yo;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yo.f */
public enum C39134f implements C38174i<C23314e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105336d;

    public Object get() {
        Object obj = this.f105336d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105336d;
                if (obj == obj2) {
                    obj = new C23314e();
                    this.f105336d = obj;
                }
            }
        }
        return (C23314e) obj;
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
        return "provider " + C23314e.class.getName();
    }
}
