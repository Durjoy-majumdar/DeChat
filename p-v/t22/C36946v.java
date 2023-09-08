package t22;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: t22.v */
public enum C36946v implements C38174i<C101716u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98011d;

    public Object get() {
        Object obj = this.f98011d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98011d;
                if (obj == obj2) {
                    obj = new C101716u();
                    this.f98011d = obj;
                }
            }
        }
        return (C101716u) obj;
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
        return "provider " + C101716u.class.getName();
    }
}
