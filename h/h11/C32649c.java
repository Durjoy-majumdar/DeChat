package h11;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: h11.c */
public enum C32649c implements C38174i<C98307a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86654d;

    public Object get() {
        Object obj = this.f86654d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86654d;
                if (obj == obj2) {
                    obj = new C98307a();
                    this.f86654d = obj;
                }
            }
        }
        return (C98307a) obj;
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
        return "provider " + C98307a.class.getName();
    }
}
