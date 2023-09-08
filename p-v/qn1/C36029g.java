package qn1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qn1.g */
public enum C36029g implements C38174i<C12890f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96060d;

    public Object get() {
        Object obj = this.f96060d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96060d;
                if (obj == obj2) {
                    obj = new C12890f();
                    this.f96060d = obj;
                }
            }
        }
        return (C12890f) obj;
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
        return Objects.equals(obj, 80001L);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C12890f.class.getName();
    }
}
