package kg0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kg0.b */
public enum C33906b implements C38174i<C76565a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91596d;

    public Object get() {
        Object obj = this.f91596d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91596d;
                if (obj == obj2) {
                    obj = new C76565a();
                    this.f91596d = obj;
                }
            }
        }
        return (C76565a) obj;
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
        return "provider " + C76565a.class.getName();
    }
}
