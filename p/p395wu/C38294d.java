package p395wu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wu.d */
public enum C38294d implements C38174i<C22928b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101095d;

    public Object get() {
        Object obj = this.f101095d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101095d;
                if (obj == obj2) {
                    obj = new C22928b();
                    this.f101095d = obj;
                }
            }
        }
        return (C22928b) obj;
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
        return "provider " + C22928b.class.getName();
    }
}
