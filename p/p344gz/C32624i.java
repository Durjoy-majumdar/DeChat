package p344gz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gz.i */
public enum C32624i implements C38174i<C20865h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86600d;

    public Object get() {
        Object obj = this.f86600d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86600d;
                if (obj == obj2) {
                    obj = new C20865h();
                    this.f86600d = obj;
                }
            }
        }
        return (C20865h) obj;
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
        return "provider " + C20865h.class.getName();
    }
}
