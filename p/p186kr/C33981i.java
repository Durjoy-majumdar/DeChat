package p186kr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kr.i */
public enum C33981i implements C38174i<C10402h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91759d;

    public Object get() {
        Object obj = this.f91759d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91759d;
                if (obj == obj2) {
                    obj = new C10402h();
                    this.f91759d = obj;
                }
            }
        }
        return (C10402h) obj;
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
        return "provider " + C10402h.class.getName();
    }
}
