package kc3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kc3.f */
public enum C33882f implements C38174i<C33880e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91545d;

    public Object get() {
        Object obj = this.f91545d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91545d;
                if (obj == obj2) {
                    obj = new C33880e();
                    this.f91545d = obj;
                }
            }
        }
        return (C33880e) obj;
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
        return "provider " + C33880e.class.getName();
    }
}
