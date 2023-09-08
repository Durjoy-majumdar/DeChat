package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.b0 */
public enum C39198b0 implements C38174i<C23369a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105455d;

    public Object get() {
        Object obj = this.f105455d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105455d;
                if (obj == obj2) {
                    obj = new C23369a0();
                    this.f105455d = obj;
                }
            }
        }
        return (C23369a0) obj;
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
        return Objects.equals(obj, 64);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23369a0.class.getName();
    }
}
