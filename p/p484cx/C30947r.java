package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.r */
public enum C30947r implements C38174i<C57997q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83064d;

    public Object get() {
        Object obj = this.f83064d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83064d;
                if (obj == obj2) {
                    obj = new C57997q();
                    this.f83064d = obj;
                }
            }
        }
        return (C57997q) obj;
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
        return "provider " + C57997q.class.getName();
    }
}
