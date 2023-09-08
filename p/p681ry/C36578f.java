package p681ry;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ry.f */
public enum C36578f implements C38174i<C77592e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97277d;

    public Object get() {
        Object obj = this.f97277d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97277d;
                if (obj == obj2) {
                    obj = new C77592e();
                    this.f97277d = obj;
                }
            }
        }
        return (C77592e) obj;
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
        return "provider " + C77592e.class.getName();
    }
}
