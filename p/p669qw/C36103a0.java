package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.a0 */
public enum C36103a0 implements C38174i<C101309z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96219d;

    public Object get() {
        Object obj = this.f96219d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96219d;
                if (obj == obj2) {
                    obj = new C101309z();
                    this.f96219d = obj;
                }
            }
        }
        return (C101309z) obj;
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
        return "provider " + C101309z.class.getName();
    }
}
