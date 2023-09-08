package xz2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.d0 */
public enum C38931d0 implements C38174i<C66460c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104916d;

    public Object get() {
        Object obj = this.f104916d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104916d;
                if (obj == obj2) {
                    obj = new C66460c0();
                    this.f104916d = obj;
                }
            }
        }
        return (C66460c0) obj;
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
        return Objects.equals(obj, "9");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66460c0.class.getName();
    }
}
