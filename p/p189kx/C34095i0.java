package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.i0 */
public enum C34095i0 implements C38174i<C46751h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91989d;

    public Object get() {
        Object obj = this.f91989d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91989d;
                if (obj == obj2) {
                    obj = new C46751h0();
                    this.f91989d = obj;
                }
            }
        }
        return (C46751h0) obj;
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
        return "provider " + C46751h0.class.getName();
    }
}
