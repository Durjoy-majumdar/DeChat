package ga3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ga3.l */
public enum C32371l implements C38174i<C32370k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85898d;

    public Object get() {
        Object obj = this.f85898d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85898d;
                if (obj == obj2) {
                    obj = new C32370k();
                    this.f85898d = obj;
                }
            }
        }
        return (C32370k) obj;
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
        return Objects.equals(obj, "pushloginurl");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32370k.class.getName();
    }
}
