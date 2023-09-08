package j32;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: j32.e */
public enum C33508e implements C38174i<C33507d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90726d;

    public Object get() {
        Object obj = this.f90726d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90726d;
                if (obj == obj2) {
                    obj = new C33507d();
                    this.f90726d = obj;
                }
            }
        }
        return (C33507d) obj;
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
        return "provider " + C33507d.class.getName();
    }
}
