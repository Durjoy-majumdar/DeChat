package z40;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: z40.c */
public enum C39304c implements C38174i<C39303b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105681d;

    public Object get() {
        Object obj = this.f105681d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105681d;
                if (obj == obj2) {
                    obj = new C39303b();
                    this.f105681d = obj;
                }
            }
        }
        return (C39303b) obj;
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
        return "provider " + C39303b.class.getName();
    }
}
