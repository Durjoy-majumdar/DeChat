package dc2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dc2.f */
public enum C31125f implements C38174i<C7263e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83462d;

    public Object get() {
        Object obj = this.f83462d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83462d;
                if (obj == obj2) {
                    obj = new C7263e();
                    this.f83462d = obj;
                }
            }
        }
        return (C7263e) obj;
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
        return "provider " + C7263e.class.getName();
    }
}
