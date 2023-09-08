package p706ty;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ty.c */
public enum C37301c implements C38174i<C37300b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98671d;

    public Object get() {
        Object obj = this.f98671d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98671d;
                if (obj == obj2) {
                    obj = new C37300b();
                    this.f98671d = obj;
                }
            }
        }
        return (C37300b) obj;
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
        return "provider " + C37300b.class.getName();
    }
}
