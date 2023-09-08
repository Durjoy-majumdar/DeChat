package p648pp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pp.d */
public enum C35607d implements C38174i<C35604c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95186d;

    public Object get() {
        Object obj = this.f95186d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95186d;
                if (obj == obj2) {
                    obj = new C35604c();
                    this.f95186d = obj;
                }
            }
        }
        return (C35604c) obj;
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
        return "provider " + C35604c.class.getName();
    }
}
