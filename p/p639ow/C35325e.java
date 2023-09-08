package p639ow;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ow.e */
public enum C35325e implements C38174i<C35324d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94623d;

    public Object get() {
        Object obj = this.f94623d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94623d;
                if (obj == obj2) {
                    obj = new C35324d();
                    this.f94623d = obj;
                }
            }
        }
        return (C35324d) obj;
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
        return "provider " + C35324d.class.getName();
    }
}
