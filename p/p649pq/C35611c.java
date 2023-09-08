package p649pq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: pq.c */
public enum C35611c implements C38174i<C100834b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95195d;

    public Object get() {
        Object obj = this.f95195d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95195d;
                if (obj == obj2) {
                    obj = new C100834b();
                    this.f95195d = obj;
                }
            }
        }
        return (C100834b) obj;
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
        return "provider " + C100834b.class.getName();
    }
}
