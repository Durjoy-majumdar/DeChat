package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.v */
public enum C39218v implements C38174i<C23378u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105513d;

    public Object get() {
        Object obj = this.f105513d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105513d;
                if (obj == obj2) {
                    obj = new C23378u();
                    this.f105513d = obj;
                }
            }
        }
        return (C23378u) obj;
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
        return Objects.equals(obj, 32);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23378u.class.getName();
    }
}
