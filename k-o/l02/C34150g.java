package l02;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: l02.g */
public enum C34150g implements C38174i<C34149f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92122d;

    public Object get() {
        Object obj = this.f92122d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92122d;
                if (obj == obj2) {
                    obj = new C34149f();
                    this.f92122d = obj;
                }
            }
        }
        return (C34149f) obj;
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
        return Objects.equals(obj, 302);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34149f.class.getName();
    }
}
