package p481cs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cs.h */
public enum C30900h implements C38174i<C97364g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82958d;

    public Object get() {
        Object obj = this.f82958d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82958d;
                if (obj == obj2) {
                    obj = new C97364g();
                    this.f82958d = obj;
                }
            }
        }
        return (C97364g) obj;
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
        return "provider " + C97364g.class.getName();
    }
}
