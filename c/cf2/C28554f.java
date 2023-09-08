package cf2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cf2.f */
public enum C28554f implements C38174i<C28552e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78409d;

    public Object get() {
        Object obj = this.f78409d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78409d;
                if (obj == obj2) {
                    obj = new C28552e();
                    this.f78409d = obj;
                }
            }
        }
        return (C28552e) obj;
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
        return "provider " + C28552e.class.getName();
    }
}
