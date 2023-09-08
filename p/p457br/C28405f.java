package p457br;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: br.f */
public enum C28405f implements C38174i<C54543e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78125d;

    public Object get() {
        Object obj = this.f78125d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78125d;
                if (obj == obj2) {
                    obj = new C54543e();
                    this.f78125d = obj;
                }
            }
        }
        return (C54543e) obj;
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
        return "provider " + C54543e.class.getName();
    }
}
