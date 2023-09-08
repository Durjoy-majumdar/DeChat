package p630nz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nz.f */
public enum C35060f implements C38174i<C35059e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94073d;

    public Object get() {
        Object obj = this.f94073d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94073d;
                if (obj == obj2) {
                    obj = new C35059e();
                    this.f94073d = obj;
                }
            }
        }
        return (C35059e) obj;
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
        return "provider " + C35059e.class.getName();
    }
}
