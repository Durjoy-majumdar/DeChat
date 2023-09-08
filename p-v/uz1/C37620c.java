package uz1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: uz1.c */
public enum C37620c implements C38174i<C37618b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99748d;

    public Object get() {
        Object obj = this.f99748d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99748d;
                if (obj == obj2) {
                    obj = new C37618b();
                    this.f99748d = obj;
                }
            }
        }
        return (C37618b) obj;
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
        return "provider " + C37618b.class.getName();
    }
}
