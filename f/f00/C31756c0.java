package f00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f00.c0 */
public enum C31756c0 implements C38174i<C7958b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84785d;

    public Object get() {
        Object obj = this.f84785d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84785d;
                if (obj == obj2) {
                    obj = new C7958b0();
                    this.f84785d = obj;
                }
            }
        }
        return (C7958b0) obj;
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
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C7958b0.class.getName();
    }
}
