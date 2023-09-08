package p699tp;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tp.d */
public enum C37228d implements C38174i<C37227c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98526d;

    public Object get() {
        Object obj = this.f98526d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98526d;
                if (obj == obj2) {
                    obj = new C37227c();
                    this.f98526d = obj;
                }
            }
        }
        return (C37227c) obj;
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
        return "provider " + C37227c.class.getName();
    }
}
