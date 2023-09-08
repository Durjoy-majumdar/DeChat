package p785zx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zx.c */
public enum C39470c implements C38174i<C119182b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f106002d;

    public Object get() {
        Object obj = this.f106002d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f106002d;
                if (obj == obj2) {
                    obj = new C119182b();
                    this.f106002d = obj;
                }
            }
        }
        return (C119182b) obj;
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
        return "provider " + C119182b.class.getName();
    }
}
