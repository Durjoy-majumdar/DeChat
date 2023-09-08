package p188kw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: kw.c */
public enum C34073c implements C38174i<C10423b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91946d;

    public Object get() {
        Object obj = this.f91946d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91946d;
                if (obj == obj2) {
                    obj = new C10423b();
                    this.f91946d = obj;
                }
            }
        }
        return (C10423b) obj;
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
        return "provider " + C10423b.class.getName();
    }
}
