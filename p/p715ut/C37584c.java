package p715ut;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ut.c */
public enum C37584c implements C38174i<C37580b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99672d;

    public Object get() {
        Object obj = this.f99672d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99672d;
                if (obj == obj2) {
                    obj = new C37580b();
                    this.f99672d = obj;
                }
            }
        }
        return (C37580b) obj;
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
        return "provider " + C37580b.class.getName();
    }
}
