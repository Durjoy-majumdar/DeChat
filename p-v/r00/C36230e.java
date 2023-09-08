package r00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: r00.e */
public enum C36230e implements C38174i<C22192d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96500d;

    public Object get() {
        Object obj = this.f96500d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96500d;
                if (obj == obj2) {
                    obj = new C22192d();
                    this.f96500d = obj;
                }
            }
        }
        return (C22192d) obj;
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
        return "provider " + C22192d.class.getName();
    }
}
