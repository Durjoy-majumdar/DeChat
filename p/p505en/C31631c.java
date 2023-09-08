package p505en;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: en.c */
public enum C31631c implements C38174i<C31628b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84508d;

    public Object get() {
        Object obj = this.f84508d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84508d;
                if (obj == obj2) {
                    obj = new C31628b();
                    this.f84508d = obj;
                }
            }
        }
        return (C31628b) obj;
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
        return "provider " + C31628b.class.getName();
    }
}
