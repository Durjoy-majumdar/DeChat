package pl1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pl1.i0 */
public enum C35524i0 implements C38174i<C62350h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94998d;

    public Object get() {
        Object obj = this.f94998d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94998d;
                if (obj == obj2) {
                    obj = new C62350h0();
                    this.f94998d = obj;
                }
            }
        }
        return (C62350h0) obj;
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
        return "provider " + C62350h0.class.getName();
    }
}
