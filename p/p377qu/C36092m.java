package p377qu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qu.m */
public enum C36092m implements C38174i<C118211l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96200d;

    public Object get() {
        Object obj = this.f96200d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96200d;
                if (obj == obj2) {
                    obj = new C118211l();
                    this.f96200d = obj;
                }
            }
        }
        return (C118211l) obj;
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
        return "provider " + C118211l.class.getName();
    }
}
