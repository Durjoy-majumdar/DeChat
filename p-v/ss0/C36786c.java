package ss0;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ss0.c */
public enum C36786c implements C38174i<C90347a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97690d;

    public Object get() {
        Object obj = this.f97690d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97690d;
                if (obj == obj2) {
                    obj = new C90347a();
                    this.f97690d = obj;
                }
            }
        }
        return (C90347a) obj;
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
        return "provider " + C90347a.class.getName();
    }
}
