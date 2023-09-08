package xz2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xz2.b0 */
public enum C38928b0 implements C38174i<C66457a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104907d;

    public Object get() {
        Object obj = this.f104907d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104907d;
                if (obj == obj2) {
                    obj = new C66457a0();
                    this.f104907d = obj;
                }
            }
        }
        return (C66457a0) obj;
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
        return Objects.equals(obj, "7");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66457a0.class.getName();
    }
}
