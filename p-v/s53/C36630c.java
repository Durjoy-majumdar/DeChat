package s53;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: s53.c */
public enum C36630c implements C38174i<C48237b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97379d;

    public Object get() {
        Object obj = this.f97379d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97379d;
                if (obj == obj2) {
                    obj = new C48237b();
                    this.f97379d = obj;
                }
            }
        }
        return (C48237b) obj;
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
        return "provider " + C48237b.class.getName();
    }
}
