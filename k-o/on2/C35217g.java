package on2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: on2.g */
public enum C35217g implements C38174i<C35215f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94413d;

    public Object get() {
        Object obj = this.f94413d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94413d;
                if (obj == obj2) {
                    obj = new C35215f();
                    this.f94413d = obj;
                }
            }
        }
        return (C35215f) obj;
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
        return Objects.equals(obj, "ShakeCardEntrance");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35215f.class.getName();
    }
}
