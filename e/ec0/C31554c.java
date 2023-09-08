package ec0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ec0.c */
public enum C31554c implements C38174i<C31552b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84343d;

    public Object get() {
        Object obj = this.f84343d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84343d;
                if (obj == obj2) {
                    obj = new C31552b();
                    this.f84343d = obj;
                }
            }
        }
        return (C31552b) obj;
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
        return "provider " + C31552b.class.getName();
    }
}
