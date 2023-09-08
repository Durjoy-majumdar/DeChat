package eg1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: eg1.g */
public enum C31585g implements C38174i<C31582f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84409d;

    public Object get() {
        Object obj = this.f84409d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84409d;
                if (obj == obj2) {
                    obj = new C31582f();
                    this.f84409d = obj;
                }
            }
        }
        return (C31582f) obj;
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
        return "provider " + C31582f.class.getName();
    }
}
