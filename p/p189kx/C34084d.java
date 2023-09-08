package p189kx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kx.d */
public enum C34084d implements C38174i<C34082c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91964d;

    public Object get() {
        Object obj = this.f91964d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91964d;
                if (obj == obj2) {
                    obj = new C34082c();
                    this.f91964d = obj;
                }
            }
        }
        return (C34082c) obj;
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
        return "provider " + C34082c.class.getName();
    }
}
