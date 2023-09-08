package p499dw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dw.c */
public enum C31314c implements C38174i<C31313b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83835d;

    public Object get() {
        Object obj = this.f83835d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83835d;
                if (obj == obj2) {
                    obj = new C31313b();
                    this.f83835d = obj;
                }
            }
        }
        return (C31313b) obj;
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
        return "provider " + C31313b.class.getName();
    }
}
