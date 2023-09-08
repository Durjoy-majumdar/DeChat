package p406zn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zn.k */
public enum C39404k implements C38174i<C23522j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105869d;

    public Object get() {
        Object obj = this.f105869d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105869d;
                if (obj == obj2) {
                    obj = new C23522j();
                    this.f105869d = obj;
                }
            }
        }
        return (C23522j) obj;
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
        return "provider " + C23522j.class.getName();
    }
}
