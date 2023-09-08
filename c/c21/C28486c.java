package c21;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c21.c */
public enum C28486c implements C38174i<C113236b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78295d;

    public Object get() {
        Object obj = this.f78295d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78295d;
                if (obj == obj2) {
                    obj = new C113236b();
                    this.f78295d = obj;
                }
            }
        }
        return (C113236b) obj;
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
        return "provider " + C113236b.class.getName();
    }
}
