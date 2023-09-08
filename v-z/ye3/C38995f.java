package ye3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ye3.f */
public enum C38995f implements C38174i<C15990e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105046d;

    public Object get() {
        Object obj = this.f105046d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105046d;
                if (obj == obj2) {
                    obj = new C15990e();
                    this.f105046d = obj;
                }
            }
        }
        return (C15990e) obj;
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
        return Objects.equals(obj, "ChangeQQLoginTypeGuidance");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C15990e.class.getName();
    }
}
