package p71;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: p71.g */
public enum C35408g implements C38174i<C47436f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94766d;

    public Object get() {
        Object obj = this.f94766d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94766d;
                if (obj == obj2) {
                    obj = new C47436f();
                    this.f94766d = obj;
                }
            }
        }
        return (C47436f) obj;
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
        return Objects.equals(obj, 539) || Objects.equals(obj, 6693);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C47436f.class.getName();
    }
}