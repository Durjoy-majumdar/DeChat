package xx1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xx1.j */
public enum C38884j implements C38174i<C15910i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104805d;

    public Object get() {
        Object obj = this.f104805d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104805d;
                if (obj == obj2) {
                    obj = new C15910i();
                    this.f104805d = obj;
                }
            }
        }
        return (C15910i) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C15910i.class.getName();
    }
}
