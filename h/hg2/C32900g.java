package hg2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hg2.g */
public enum C32900g implements C38174i<C76190f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89444d;

    public Object get() {
        Object obj = this.f89444d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89444d;
                if (obj == obj2) {
                    obj = new C76190f();
                    this.f89444d = obj;
                }
            }
        }
        return (C76190f) obj;
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
        return Objects.equals(obj, 12399999);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76190f.class.getName();
    }
}
