package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.w */
public enum C36129w implements C38174i<C101308v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96280d;

    public Object get() {
        Object obj = this.f96280d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96280d;
                if (obj == obj2) {
                    obj = new C101308v();
                    this.f96280d = obj;
                }
            }
        }
        return (C101308v) obj;
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
        return "provider " + C101308v.class.getName();
    }
}
