package p746wz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wz.e */
public enum C38415e implements C38174i<C91116d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101332d;

    public Object get() {
        Object obj = this.f101332d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101332d;
                if (obj == obj2) {
                    obj = new C91116d();
                    this.f101332d = obj;
                }
            }
        }
        return (C91116d) obj;
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
        return "provider " + C91116d.class.getName();
    }
}
