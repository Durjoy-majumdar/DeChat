package p701tr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tr.d */
public enum C37236d implements C38174i<C37234c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98546d;

    public Object get() {
        Object obj = this.f98546d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98546d;
                if (obj == obj2) {
                    obj = new C37234c();
                    this.f98546d = obj;
                }
            }
        }
        return (C37234c) obj;
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
        return "provider " + C37234c.class.getName();
    }
}
