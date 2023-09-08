package p279yl;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yl.j */
public enum C39039j implements C38174i<C112476i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105107d;

    public Object get() {
        Object obj = this.f105107d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105107d;
                if (obj == obj2) {
                    obj = new C112476i();
                    this.f105107d = obj;
                }
            }
        }
        return (C112476i) obj;
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
        return "provider " + C112476i.class.getName();
    }
}
