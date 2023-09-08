package p768ys;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ys.d */
public enum C39155d implements C38174i<C79151c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105384d;

    public Object get() {
        Object obj = this.f105384d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105384d;
                if (obj == obj2) {
                    obj = new C79151c();
                    this.f105384d = obj;
                }
            }
        }
        return (C79151c) obj;
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
        return "provider " + C79151c.class.getName();
    }
}
