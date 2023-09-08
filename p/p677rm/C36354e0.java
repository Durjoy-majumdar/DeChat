package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.e0 */
public enum C36354e0 implements C38174i<C36353d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96754d;

    public Object get() {
        Object obj = this.f96754d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96754d;
                if (obj == obj2) {
                    obj = new C36353d0();
                    this.f96754d = obj;
                }
            }
        }
        return (C36353d0) obj;
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
        return "provider " + C36353d0.class.getName();
    }
}
