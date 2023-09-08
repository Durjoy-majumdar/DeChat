package p756xt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xt.f */
public enum C38823f implements C38174i<C66442e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104683d;

    public Object get() {
        Object obj = this.f104683d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104683d;
                if (obj == obj2) {
                    obj = new C66442e();
                    this.f104683d = obj;
                }
            }
        }
        return (C66442e) obj;
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
        return "provider " + C66442e.class.getName();
    }
}
