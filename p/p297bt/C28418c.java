package p297bt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bt.c */
public enum C28418c implements C38174i<C16820b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78150d;

    public Object get() {
        Object obj = this.f78150d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78150d;
                if (obj == obj2) {
                    obj = new C16820b();
                    this.f78150d = obj;
                }
            }
        }
        return (C16820b) obj;
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
        return "provider " + C16820b.class.getName();
    }
}
