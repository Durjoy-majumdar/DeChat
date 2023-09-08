package p746wz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wz.i */
public enum C38418i implements C38174i<C78739h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101338d;

    public Object get() {
        Object obj = this.f101338d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101338d;
                if (obj == obj2) {
                    obj = new C78739h();
                    this.f101338d = obj;
                }
            }
        }
        return (C78739h) obj;
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
        return "provider " + C78739h.class.getName();
    }
}
