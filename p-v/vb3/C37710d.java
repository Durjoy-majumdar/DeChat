package vb3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vb3.d */
public enum C37710d implements C38174i<C37708c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99906d;

    public Object get() {
        Object obj = this.f99906d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99906d;
                if (obj == obj2) {
                    obj = new C37708c();
                    this.f99906d = obj;
                }
            }
        }
        return (C37708c) obj;
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
        return "provider " + C37708c.class.getName();
    }
}
