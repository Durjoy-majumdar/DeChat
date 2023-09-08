package p279yl;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yl.v */
public enum C39050v implements C38174i<C39049u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105134d;

    public Object get() {
        Object obj = this.f105134d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105134d;
                if (obj == obj2) {
                    obj = new C39049u();
                    this.f105134d = obj;
                }
            }
        }
        return (C39049u) obj;
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
        return "provider " + C39049u.class.getName();
    }
}
