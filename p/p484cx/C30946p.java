package p484cx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cx.p */
public enum C30946p implements C38174i<C57996o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83061d;

    public Object get() {
        Object obj = this.f83061d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83061d;
                if (obj == obj2) {
                    obj = new C57996o();
                    this.f83061d = obj;
                }
            }
        }
        return (C57996o) obj;
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
        return "provider " + C57996o.class.getName();
    }
}
