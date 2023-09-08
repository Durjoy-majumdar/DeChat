package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.v */
public enum C34111v implements C38174i<C76640u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92034d;

    public Object get() {
        Object obj = this.f92034d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92034d;
                if (obj == obj2) {
                    obj = new C76640u();
                    this.f92034d = obj;
                }
            }
        }
        return (C76640u) obj;
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
        return "provider " + C76640u.class.getName();
    }
}
