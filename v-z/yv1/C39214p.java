package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.p */
public enum C39214p implements C38174i<C23375o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105503d;

    public Object get() {
        Object obj = this.f105503d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105503d;
                if (obj == obj2) {
                    obj = new C23375o();
                    this.f105503d = obj;
                }
            }
        }
        return (C23375o) obj;
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
        return Objects.equals(obj, 4128);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23375o.class.getName();
    }
}
