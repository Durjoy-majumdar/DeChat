package p660qi;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qi.b */
public enum C35876b implements C38174i<C35874a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95738d;

    public Object get() {
        Object obj = this.f95738d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95738d;
                if (obj == obj2) {
                    obj = new C35874a();
                    this.f95738d = obj;
                }
            }
        }
        return (C35874a) obj;
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
        return "provider " + C35874a.class.getName();
    }
}
