package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.m0 */
public enum C34101m0 implements C38174i<C10426l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92007d;

    public Object get() {
        Object obj = this.f92007d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92007d;
                if (obj == obj2) {
                    obj = new C10426l0();
                    this.f92007d = obj;
                }
            }
        }
        return (C10426l0) obj;
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
        return "provider " + C10426l0.class.getName();
    }
}
