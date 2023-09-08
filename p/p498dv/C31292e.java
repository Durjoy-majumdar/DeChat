package p498dv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dv.e */
public enum C31292e implements C38174i<C75458d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83790d;

    public Object get() {
        Object obj = this.f83790d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83790d;
                if (obj == obj2) {
                    obj = new C75458d();
                    this.f83790d = obj;
                }
            }
        }
        return (C75458d) obj;
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
        return "provider " + C75458d.class.getName();
    }
}
