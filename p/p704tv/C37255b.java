package p704tv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tv.b */
public enum C37255b implements C38174i<C37254a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98585d;

    public Object get() {
        Object obj = this.f98585d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98585d;
                if (obj == obj2) {
                    obj = new C37254a();
                    this.f98585d = obj;
                }
            }
        }
        return (C37254a) obj;
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
        return "provider " + C37254a.class.getName();
    }
}
