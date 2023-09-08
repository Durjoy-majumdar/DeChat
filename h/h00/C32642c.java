package h00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: h00.c */
public enum C32642c implements C38174i<C32641b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86643d;

    public Object get() {
        Object obj = this.f86643d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86643d;
                if (obj == obj2) {
                    obj = new C32641b();
                    this.f86643d = obj;
                }
            }
        }
        return (C32641b) obj;
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
        return "provider " + C32641b.class.getName();
    }
}
