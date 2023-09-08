package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.a0 */
public enum C34080a0 implements C38174i<C34113z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91955d;

    public Object get() {
        Object obj = this.f91955d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91955d;
                if (obj == obj2) {
                    obj = new C34113z();
                    this.f91955d = obj;
                }
            }
        }
        return (C34113z) obj;
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
        return "provider " + C34113z.class.getName();
    }
}
