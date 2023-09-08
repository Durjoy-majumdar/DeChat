package p00;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: p00.c */
public enum C35350c implements C38174i<C110094b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94671d;

    public Object get() {
        Object obj = this.f94671d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94671d;
                if (obj == obj2) {
                    obj = new C110094b();
                    this.f94671d = obj;
                }
            }
        }
        return (C110094b) obj;
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
        return "provider " + C110094b.class.getName();
    }
}
