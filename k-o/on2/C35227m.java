package on2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: on2.m */
public enum C35227m implements C38174i<C11585l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94425d;

    public Object get() {
        Object obj = this.f94425d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94425d;
                if (obj == obj2) {
                    obj = new C11585l();
                    this.f94425d = obj;
                }
            }
        }
        return (C11585l) obj;
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
        return "provider " + C11585l.class.getName();
    }
}
