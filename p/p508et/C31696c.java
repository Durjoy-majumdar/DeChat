package p508et;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: et.c */
public enum C31696c implements C38174i<C31694b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84647d;

    public Object get() {
        Object obj = this.f84647d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84647d;
                if (obj == obj2) {
                    obj = new C31694b();
                    this.f84647d = obj;
                }
            }
        }
        return (C31694b) obj;
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
        return "provider " + C31694b.class.getName();
    }
}
