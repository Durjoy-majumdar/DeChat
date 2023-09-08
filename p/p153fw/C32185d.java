package p153fw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: fw.d */
public enum C32185d implements C38174i<C8213c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85562d;

    public Object get() {
        Object obj = this.f85562d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85562d;
                if (obj == obj2) {
                    obj = new C8213c();
                    this.f85562d = obj;
                }
            }
        }
        return (C8213c) obj;
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
        return "provider " + C8213c.class.getName();
    }
}
