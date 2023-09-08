package eb3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb3.f */
public enum C31550f implements C38174i<C97640e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84336d;

    public Object get() {
        Object obj = this.f84336d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84336d;
                if (obj == obj2) {
                    obj = new C97640e();
                    this.f84336d = obj;
                }
            }
        }
        return (C97640e) obj;
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
        return Objects.equals(obj, 3);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C97640e.class.getName();
    }
}
