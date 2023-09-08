package k62;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: k62.e */
public enum C33842e implements C38174i<C33839d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91472d;

    public Object get() {
        Object obj = this.f91472d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91472d;
                if (obj == obj2) {
                    obj = new C33839d();
                    this.f91472d = obj;
                }
            }
        }
        return (C33839d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 522);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33839d.class.getName();
    }
}
