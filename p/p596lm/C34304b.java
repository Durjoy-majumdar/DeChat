package p596lm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: lm.b */
public enum C34304b implements C38174i<C34302a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92441d;

    public Object get() {
        Object obj = this.f92441d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92441d;
                if (obj == obj2) {
                    obj = new C34302a();
                    this.f92441d = obj;
                }
            }
        }
        return (C34302a) obj;
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
        return "provider " + C34302a.class.getName();
    }
}
