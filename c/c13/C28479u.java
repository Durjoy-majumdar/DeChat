package c13;

import ei3.C31607a;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c13.u */
public enum C28479u implements C38174i<C28478s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78283d;

    public Object get() {
        Object obj = this.f78283d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78283d;
                if (obj == obj2) {
                    obj = new C28478s();
                    this.f78283d = obj;
                }
            }
        }
        return (C28478s) obj;
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
        return Objects.equals(obj, C31607a.f84459e);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28478s.class.getName();
    }
}
