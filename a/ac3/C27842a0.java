package ac3;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ac3.a0 */
public enum C27842a0 implements C38174i<C27874z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76965d;

    public Object get() {
        Object obj = this.f76965d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76965d;
                if (obj == obj2) {
                    obj = new C27874z();
                    this.f76965d = obj;
                }
            }
        }
        return (C27874z) obj;
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
        return Objects.equals(obj, "mmcvswitch");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27874z.class.getName();
    }
}
