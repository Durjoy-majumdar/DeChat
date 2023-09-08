package qg1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qg1.f0 */
public enum C35852f0 implements C38174i<C62613e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95690d;

    public Object get() {
        Object obj = this.f95690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95690d;
                if (obj == obj2) {
                    obj = new C62613e0();
                    this.f95690d = obj;
                }
            }
        }
        return (C62613e0) obj;
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
        return "provider " + C62613e0.class.getName();
    }
}
