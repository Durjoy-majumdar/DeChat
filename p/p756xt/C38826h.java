package p756xt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xt.h */
public enum C38826h implements C38174i<C38824g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104687d;

    public Object get() {
        Object obj = this.f104687d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104687d;
                if (obj == obj2) {
                    obj = new C38824g();
                    this.f104687d = obj;
                }
            }
        }
        return (C38824g) obj;
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
        return "provider " + C38824g.class.getName();
    }
}
