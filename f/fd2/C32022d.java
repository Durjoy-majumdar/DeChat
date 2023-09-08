package fd2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fd2.d */
public enum C32022d implements C38174i<C32020c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85251d;

    public Object get() {
        Object obj = this.f85251d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85251d;
                if (obj == obj2) {
                    obj = new C32020c();
                    this.f85251d = obj;
                }
            }
        }
        return (C32020c) obj;
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
        return "provider " + C32020c.class.getName();
    }
}
