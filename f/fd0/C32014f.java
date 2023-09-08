package fd0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fd0.f */
public enum C32014f implements C38174i<C75741e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85235d;

    public Object get() {
        Object obj = this.f85235d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85235d;
                if (obj == obj2) {
                    obj = new C75741e();
                    this.f85235d = obj;
                }
            }
        }
        return (C75741e) obj;
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
        return Objects.equals(obj, 40);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75741e.class.getName();
    }
}
