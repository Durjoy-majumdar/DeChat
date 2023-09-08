package p741wq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wq.h */
public enum C38256h implements C38174i<C38255g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101017d;

    public Object get() {
        Object obj = this.f101017d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101017d;
                if (obj == obj2) {
                    obj = new C38255g();
                    this.f101017d = obj;
                }
            }
        }
        return (C38255g) obj;
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
        return "provider " + C38255g.class.getName();
    }
}
