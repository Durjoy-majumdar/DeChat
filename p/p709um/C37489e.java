package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.e */
public enum C37489e implements C38174i<C90699c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99051d;

    public Object get() {
        Object obj = this.f99051d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99051d;
                if (obj == obj2) {
                    obj = new C90699c();
                    this.f99051d = obj;
                }
            }
        }
        return (C90699c) obj;
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
        return "provider " + C90699c.class.getName();
    }
}
