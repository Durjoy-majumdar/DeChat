package p420ur;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ur.i */
public enum C37569i implements C38174i<C78276h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99645d;

    public Object get() {
        Object obj = this.f99645d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99645d;
                if (obj == obj2) {
                    obj = new C78276h();
                    this.f99645d = obj;
                }
            }
        }
        return (C78276h) obj;
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
        return "provider " + C78276h.class.getName();
    }
}
