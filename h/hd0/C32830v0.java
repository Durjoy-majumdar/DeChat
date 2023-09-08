package hd0;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd0.v0 */
public enum C32830v0 implements C38174i<C76157u0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89294d;

    public Object get() {
        Object obj = this.f89294d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89294d;
                if (obj == obj2) {
                    obj = new C76157u0();
                    this.f89294d = obj;
                }
            }
        }
        return (C76157u0) obj;
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
        return Objects.equals(obj, 43) || Objects.equals(obj, 44) || Objects.equals(obj, 62) || Objects.equals(obj, 486539313);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76157u0.class.getName();
    }
}
