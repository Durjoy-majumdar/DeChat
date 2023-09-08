package p281yz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yz.q */
public enum C39262q implements C38174i<C79170p> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105625d;

    public Object get() {
        Object obj = this.f105625d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105625d;
                if (obj == obj2) {
                    obj = new C79170p();
                    this.f105625d = obj;
                }
            }
        }
        return (C79170p) obj;
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
        return "provider " + C79170p.class.getName();
    }
}
