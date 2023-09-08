package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.x */
public enum C39219x implements C38174i<C23379w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105516d;

    public Object get() {
        Object obj = this.f105516d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105516d;
                if (obj == obj2) {
                    obj = new C23379w();
                    this.f105516d = obj;
                }
            }
        }
        return (C23379w) obj;
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
        return Objects.equals(obj, 160);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23379w.class.getName();
    }
}
