package yv1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.h0 */
public enum C39207h0 implements C38174i<C23372g0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105482d;

    public Object get() {
        Object obj = this.f105482d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105482d;
                if (obj == obj2) {
                    obj = new C23372g0();
                    this.f105482d = obj;
                }
            }
        }
        return (C23372g0) obj;
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
        return Objects.equals(obj, 256);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23372g0.class.getName();
    }
}
