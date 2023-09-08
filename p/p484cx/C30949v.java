package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.v */
public enum C30949v implements C38174i<C57999u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83070d;

    public Object get() {
        Object obj = this.f83070d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83070d;
                if (obj == obj2) {
                    obj = new C57999u();
                    this.f83070d = obj;
                }
            }
        }
        return (C57999u) obj;
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
        return "provider " + C57999u.class.getName();
    }
}
