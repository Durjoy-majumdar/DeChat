package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.d */
public enum C38745d implements C38174i<C53373c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104521d;

    public Object get() {
        Object obj = this.f104521d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104521d;
                if (obj == obj2) {
                    obj = new C53373c();
                    this.f104521d = obj;
                }
            }
        }
        return (C53373c) obj;
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
        return "provider " + C53373c.class.getName();
    }
}
