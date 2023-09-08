package p344gz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gz.e */
public enum C32621e implements C38174i<C20864d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86594d;

    public Object get() {
        Object obj = this.f86594d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86594d;
                if (obj == obj2) {
                    obj = new C20864d();
                    this.f86594d = obj;
                }
            }
        }
        return (C20864d) obj;
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
        return "provider " + C20864d.class.getName();
    }
}
