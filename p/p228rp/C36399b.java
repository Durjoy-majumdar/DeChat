package p228rp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rp.b */
public enum C36399b implements C38174i<C36397a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96860d;

    public Object get() {
        Object obj = this.f96860d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96860d;
                if (obj == obj2) {
                    obj = new C36397a();
                    this.f96860d = obj;
                }
            }
        }
        return (C36397a) obj;
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
        return "provider " + C36397a.class.getName();
    }
}
