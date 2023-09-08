package p536gp;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gp.b */
public enum C32489b implements C38174i<C32488a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86310d;

    public Object get() {
        Object obj = this.f86310d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86310d;
                if (obj == obj2) {
                    obj = new C32488a();
                    this.f86310d = obj;
                }
            }
        }
        return (C32488a) obj;
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
        return Objects.equals(obj, "resourcemgr");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32488a.class.getName();
    }
}
