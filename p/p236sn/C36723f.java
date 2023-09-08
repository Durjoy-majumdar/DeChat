package p236sn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sn.f */
public enum C36723f implements C38174i<C48422e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97563d;

    public Object get() {
        Object obj = this.f97563d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97563d;
                if (obj == obj2) {
                    obj = new C48422e();
                    this.f97563d = obj;
                }
            }
        }
        return (C48422e) obj;
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
        return "provider " + C48422e.class.getName();
    }
}
