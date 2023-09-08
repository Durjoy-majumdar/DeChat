package p591ky;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ky.e */
public enum C34118e implements C38174i<C34117d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92049d;

    public Object get() {
        Object obj = this.f92049d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92049d;
                if (obj == obj2) {
                    obj = new C34117d();
                    this.f92049d = obj;
                }
            }
        }
        return (C34117d) obj;
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
        return "provider " + C34117d.class.getName();
    }
}
