package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.d */
public enum C36007d implements C38174i<C47870c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96006d;

    public Object get() {
        Object obj = this.f96006d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96006d;
                if (obj == obj2) {
                    obj = new C47870c();
                    this.f96006d = obj;
                }
            }
        }
        return (C47870c) obj;
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
        return "provider " + C47870c.class.getName();
    }
}
