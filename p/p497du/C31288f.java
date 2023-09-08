package p497du;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: du.f */
public enum C31288f implements C38174i<C31287e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83780d;

    public Object get() {
        Object obj = this.f83780d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83780d;
                if (obj == obj2) {
                    obj = new C31287e();
                    this.f83780d = obj;
                }
            }
        }
        return (C31287e) obj;
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
        return "provider " + C31287e.class.getName();
    }
}
