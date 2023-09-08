package p770yu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: yu.c */
public enum C39173c implements C38174i<C39172b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105414d;

    public Object get() {
        Object obj = this.f105414d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105414d;
                if (obj == obj2) {
                    obj = new C39172b();
                    this.f105414d = obj;
                }
            }
        }
        return (C39172b) obj;
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
        return "provider " + C39172b.class.getName();
    }
}
