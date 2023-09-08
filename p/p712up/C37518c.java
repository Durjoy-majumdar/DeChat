package p712up;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: up.c */
public enum C37518c implements C38174i<C37517b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99114d;

    public Object get() {
        Object obj = this.f99114d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99114d;
                if (obj == obj2) {
                    obj = new C37517b();
                    this.f99114d = obj;
                }
            }
        }
        return (C37517b) obj;
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
        return "provider " + C37517b.class.getName();
    }
}
