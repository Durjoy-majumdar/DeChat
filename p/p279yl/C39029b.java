package p279yl;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yl.b */
public enum C39029b implements C38174i<C79137a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105098d;

    public Object get() {
        Object obj = this.f105098d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105098d;
                if (obj == obj2) {
                    obj = new C79137a();
                    this.f105098d = obj;
                }
            }
        }
        return (C79137a) obj;
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
        return "provider " + C79137a.class.getName();
    }
}
