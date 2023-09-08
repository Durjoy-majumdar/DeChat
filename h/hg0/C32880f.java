package hg0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hg0.f */
public enum C32880f implements C38174i<C46053e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89402d;

    public Object get() {
        Object obj = this.f89402d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89402d;
                if (obj == obj2) {
                    obj = new C46053e();
                    this.f89402d = obj;
                }
            }
        }
        return (C46053e) obj;
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
        return Objects.equals(obj, 42) || Objects.equals(obj, 66);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C46053e.class.getName();
    }
}
