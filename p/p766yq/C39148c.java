package p766yq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yq.c */
public enum C39148c implements C38174i<C102897b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105363d;

    public Object get() {
        Object obj = this.f105363d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105363d;
                if (obj == obj2) {
                    obj = new C102897b();
                    this.f105363d = obj;
                }
            }
        }
        return (C102897b) obj;
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
        return "provider " + C102897b.class.getName();
    }
}
