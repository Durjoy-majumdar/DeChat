package l02;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: l02.e */
public enum C34148e implements C38174i<C34147d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92119d;

    public Object get() {
        Object obj = this.f92119d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92119d;
                if (obj == obj2) {
                    obj = new C34147d();
                    this.f92119d = obj;
                }
            }
        }
        return (C34147d) obj;
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
        return "provider " + C34147d.class.getName();
    }
}
