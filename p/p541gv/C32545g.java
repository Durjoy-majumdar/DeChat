package p541gv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gv.g */
public enum C32545g implements C38174i<C32542f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86413d;

    public Object get() {
        Object obj = this.f86413d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86413d;
                if (obj == obj2) {
                    obj = new C32542f();
                    this.f86413d = obj;
                }
            }
        }
        return (C32542f) obj;
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
        return "provider " + C32542f.class.getName();
    }
}
