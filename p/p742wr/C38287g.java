package p742wr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wr.g */
public enum C38287g implements C38174i<C38286f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101074d;

    public Object get() {
        Object obj = this.f101074d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101074d;
                if (obj == obj2) {
                    obj = new C38286f();
                    this.f101074d = obj;
                }
            }
        }
        return (C38286f) obj;
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
        return "provider " + C38286f.class.getName();
    }
}
