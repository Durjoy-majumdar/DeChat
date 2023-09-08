package p779zr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zr.c */
public enum C39441c implements C38174i<C39440b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105941d;

    public Object get() {
        Object obj = this.f105941d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105941d;
                if (obj == obj2) {
                    obj = new C39440b();
                    this.f105941d = obj;
                }
            }
        }
        return (C39440b) obj;
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
        return "provider " + C39440b.class.getName();
    }
}
