package p538gr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gr.f */
public enum C32508f implements C38174i<C32507e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86346d;

    public Object get() {
        Object obj = this.f86346d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86346d;
                if (obj == obj2) {
                    obj = new C32507e();
                    this.f86346d = obj;
                }
            }
        }
        return (C32507e) obj;
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
        return "provider " + C32507e.class.getName();
    }
}
