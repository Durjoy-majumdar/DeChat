package lu1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: lu1.c */
public enum C34378c implements C38174i<C109423b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92592d;

    public Object get() {
        Object obj = this.f92592d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92592d;
                if (obj == obj2) {
                    obj = new C109423b();
                    this.f92592d = obj;
                }
            }
        }
        return (C109423b) obj;
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
        return "provider " + C109423b.class.getName();
    }
}
