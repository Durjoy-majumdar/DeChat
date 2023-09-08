package d11;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: d11.b */
public enum C31042b implements C38174i<C97400a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83277d;

    public Object get() {
        Object obj = this.f83277d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83277d;
                if (obj == obj2) {
                    obj = new C97400a();
                    this.f83277d = obj;
                }
            }
        }
        return (C97400a) obj;
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
        return "provider " + C97400a.class.getName();
    }
}
