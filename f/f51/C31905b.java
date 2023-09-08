package f51;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: f51.b */
public enum C31905b implements C38174i<C45749a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84994d;

    public Object get() {
        Object obj = this.f84994d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84994d;
                if (obj == obj2) {
                    obj = new C45749a();
                    this.f84994d = obj;
                }
            }
        }
        return (C45749a) obj;
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
        return "provider " + C45749a.class.getName();
    }
}
