package p546ha;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ha.f */
public enum C32747f implements C38174i<C32745e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89129d;

    public Object get() {
        Object obj = this.f89129d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89129d;
                if (obj == obj2) {
                    obj = new C32745e();
                    this.f89129d = obj;
                }
            }
        }
        return (C32745e) obj;
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
        return "provider " + C32745e.class.getName();
    }
}
