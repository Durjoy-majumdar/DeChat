package p717ux;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ux.c */
public enum C37602c implements C38174i<C118631b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99715d;

    public Object get() {
        Object obj = this.f99715d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99715d;
                if (obj == obj2) {
                    obj = new C118631b();
                    this.f99715d = obj;
                }
            }
        }
        return (C118631b) obj;
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
        return "provider " + C118631b.class.getName();
    }
}
