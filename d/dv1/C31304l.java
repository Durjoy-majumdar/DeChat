package dv1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: dv1.l */
public enum C31304l implements C38174i<C31303k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83818d;

    public Object get() {
        Object obj = this.f83818d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83818d;
                if (obj == obj2) {
                    obj = new C31303k();
                    this.f83818d = obj;
                }
            }
        }
        return (C31303k) obj;
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
        return "provider " + C31303k.class.getName();
    }
}
