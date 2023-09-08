package r02;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: r02.d */
public enum C36239d implements C38174i<C36237c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96519d;

    public Object get() {
        Object obj = this.f96519d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96519d;
                if (obj == obj2) {
                    obj = new C36237c();
                    this.f96519d = obj;
                }
            }
        }
        return (C36237c) obj;
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
        return "provider " + C36237c.class.getName();
    }
}
