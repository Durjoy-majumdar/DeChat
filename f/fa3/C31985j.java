package fa3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fa3.j */
public enum C31985j implements C38174i<C75738i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85171d;

    public Object get() {
        Object obj = this.f85171d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85171d;
                if (obj == obj2) {
                    obj = new C75738i();
                    this.f85171d = obj;
                }
            }
        }
        return (C75738i) obj;
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
        return Objects.equals(obj, 51);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75738i.class.getName();
    }
}
