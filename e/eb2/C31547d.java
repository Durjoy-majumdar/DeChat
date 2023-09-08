package eb2;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb2.d */
public enum C31547d implements C38174i<C58545c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84327d;

    public Object get() {
        Object obj = this.f84327d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84327d;
                if (obj == obj2) {
                    obj = new C58545c();
                    this.f84327d = obj;
                }
            }
        }
        return (C58545c) obj;
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
        return Objects.equals(obj, 6893) || Objects.equals(obj, 6820) || Objects.equals(obj, 6672);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C58545c.class.getName();
    }
}
