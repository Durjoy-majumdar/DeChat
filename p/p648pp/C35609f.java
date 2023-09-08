package p648pp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pp.f */
public enum C35609f implements C38174i<C35608e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95189d;

    public Object get() {
        Object obj = this.f95189d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95189d;
                if (obj == obj2) {
                    obj = new C35608e();
                    this.f95189d = obj;
                }
            }
        }
        return (C35608e) obj;
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
        return "provider " + C35608e.class.getName();
    }
}
