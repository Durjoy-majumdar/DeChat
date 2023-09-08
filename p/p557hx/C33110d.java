package p557hx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hx.d */
public enum C33110d implements C38174i<C33109c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89902d;

    public Object get() {
        Object obj = this.f89902d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89902d;
                if (obj == obj2) {
                    obj = new C33109c();
                    this.f89902d = obj;
                }
            }
        }
        return (C33109c) obj;
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
        return "provider " + C33109c.class.getName();
    }
}
