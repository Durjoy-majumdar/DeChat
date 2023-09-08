package hc1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hc1.f */
public enum C32805f implements C38174i<C76150e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89246d;

    public Object get() {
        Object obj = this.f89246d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89246d;
                if (obj == obj2) {
                    obj = new C76150e();
                    this.f89246d = obj;
                }
            }
        }
        return (C76150e) obj;
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
        return "provider " + C76150e.class.getName();
    }
}
