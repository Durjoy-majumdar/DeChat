package dp1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dp1.s */
public enum C31231s implements C38174i<C7452r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83679d;

    public Object get() {
        Object obj = this.f83679d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83679d;
                if (obj == obj2) {
                    obj = new C7452r();
                    this.f83679d = obj;
                }
            }
        }
        return (C7452r) obj;
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
        return "provider " + C7452r.class.getName();
    }
}
