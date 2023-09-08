package eh0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eh0.e */
public enum C31601e implements C38174i<C31599d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84447d;

    public Object get() {
        Object obj = this.f84447d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84447d;
                if (obj == obj2) {
                    obj = new C31599d();
                    this.f84447d = obj;
                }
            }
        }
        return (C31599d) obj;
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
        return "provider " + C31599d.class.getName();
    }
}
