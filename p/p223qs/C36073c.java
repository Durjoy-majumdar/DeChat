package p223qs;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qs.c */
public enum C36073c implements C38174i<C12930b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96159d;

    public Object get() {
        Object obj = this.f96159d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96159d;
                if (obj == obj2) {
                    obj = new C12930b();
                    this.f96159d = obj;
                }
            }
        }
        return (C12930b) obj;
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
        return "provider " + C12930b.class.getName();
    }
}
