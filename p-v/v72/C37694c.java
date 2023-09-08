package v72;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: v72.c */
public enum C37694c implements C38174i<C37692b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99884d;

    public Object get() {
        Object obj = this.f99884d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99884d;
                if (obj == obj2) {
                    obj = new C37692b();
                    this.f99884d = obj;
                }
            }
        }
        return (C37692b) obj;
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
        return "provider " + C37692b.class.getName();
    }
}
