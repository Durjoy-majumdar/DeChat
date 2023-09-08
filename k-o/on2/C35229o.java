package on2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on2.o */
public enum C35229o implements C38174i<C35228n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94428d;

    public Object get() {
        Object obj = this.f94428d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94428d;
                if (obj == obj2) {
                    obj = new C35228n();
                    this.f94428d = obj;
                }
            }
        }
        return (C35228n) obj;
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
        return Objects.equals(obj, "shake");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35228n.class.getName();
    }
}
