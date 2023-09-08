package p497du;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: du.d */
public enum C31286d implements C38174i<C86405c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83777d;

    public Object get() {
        Object obj = this.f83777d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83777d;
                if (obj == obj2) {
                    obj = new C86405c();
                    this.f83777d = obj;
                }
            }
        }
        return (C86405c) obj;
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
        return "provider " + C86405c.class.getName();
    }
}
