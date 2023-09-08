package fm2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fm2.e */
public enum C32136e implements C38174i<C59253b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85445d;

    public Object get() {
        Object obj = this.f85445d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85445d;
                if (obj == obj2) {
                    obj = new C59253b();
                    this.f85445d = obj;
                }
            }
        }
        return (C59253b) obj;
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
        return "provider " + C59253b.class.getName();
    }
}
