package p457br;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: br.h */
public enum C28407h implements C38174i<C28406g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78128d;

    public Object get() {
        Object obj = this.f78128d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78128d;
                if (obj == obj2) {
                    obj = new C28406g();
                    this.f78128d = obj;
                }
            }
        }
        return (C28406g) obj;
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
        return "provider " + C28406g.class.getName();
    }
}
