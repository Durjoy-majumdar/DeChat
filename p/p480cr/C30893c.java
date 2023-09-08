package p480cr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cr.c */
public enum C30893c implements C38174i<C45148b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f82937d;

    public Object get() {
        Object obj = this.f82937d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f82937d;
                if (obj == obj2) {
                    obj = new C45148b();
                    this.f82937d = obj;
                }
            }
        }
        return (C45148b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C45148b.class.getName();
    }
}
