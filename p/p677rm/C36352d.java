package p677rm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rm.d */
public enum C36352d implements C38174i<C77537c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96751d;

    public Object get() {
        Object obj = this.f96751d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96751d;
                if (obj == obj2) {
                    obj = new C77537c();
                    this.f96751d = obj;
                }
            }
        }
        return (C77537c) obj;
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
        return "provider " + C77537c.class.getName();
    }
}
