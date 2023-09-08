package p742wr;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wr.i */
public enum C38288i implements C38174i<C102484h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101077d;

    public Object get() {
        Object obj = this.f101077d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101077d;
                if (obj == obj2) {
                    obj = new C102484h();
                    this.f101077d = obj;
                }
            }
        }
        return (C102484h) obj;
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
        return "provider " + C102484h.class.getName();
    }
}
