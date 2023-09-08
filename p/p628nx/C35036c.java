package p628nx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: nx.c */
public enum C35036c implements C38174i<C47304b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94018d;

    public Object get() {
        Object obj = this.f94018d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94018d;
                if (obj == obj2) {
                    obj = new C47304b();
                    this.f94018d = obj;
                }
            }
        }
        return (C47304b) obj;
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
        return "provider " + C47304b.class.getName();
    }
}
