package ay1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ay1.g */
public enum C28166g implements C38174i<C28164f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77652d;

    public Object get() {
        Object obj = this.f77652d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77652d;
                if (obj == obj2) {
                    obj = new C28164f();
                    this.f77652d = obj;
                }
            }
        }
        return (C28164f) obj;
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
        return "provider " + C28164f.class.getName();
    }
}
