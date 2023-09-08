package h32;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h32.l */
public enum C32712l implements C38174i<C76134k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86769d;

    public Object get() {
        Object obj = this.f86769d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86769d;
                if (obj == obj2) {
                    obj = new C76134k();
                    this.f86769d = obj;
                }
            }
        }
        return (C76134k) obj;
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
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76134k.class.getName();
    }
}
