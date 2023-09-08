package p483cv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cv.d */
public enum C30920d implements C38174i<C30919c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82997d;

    public Object get() {
        Object obj = this.f82997d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82997d;
                if (obj == obj2) {
                    obj = new C30919c();
                    this.f82997d = obj;
                }
            }
        }
        return (C30919c) obj;
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
        return "provider " + C30919c.class.getName();
    }
}
