package p656py;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: py.g */
public enum C35731g implements C38174i<C89444f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95439d;

    public Object get() {
        Object obj = this.f95439d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95439d;
                if (obj == obj2) {
                    obj = new C89444f();
                    this.f95439d = obj;
                }
            }
        }
        return (C89444f) obj;
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
        return "provider " + C89444f.class.getName();
    }
}
