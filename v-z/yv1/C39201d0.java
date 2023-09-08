package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.d0 */
public enum C39201d0 implements C38174i<C23370c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105464d;

    public Object get() {
        Object obj = this.f105464d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105464d;
                if (obj == obj2) {
                    obj = new C23370c0();
                    this.f105464d = obj;
                }
            }
        }
        return (C23370c0) obj;
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
        return Objects.equals(obj, 4176);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23370c0.class.getName();
    }
}
