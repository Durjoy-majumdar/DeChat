package p551hq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: hq.b */
public enum C32976b implements C38174i<C87582a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89593d;

    public Object get() {
        Object obj = this.f89593d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89593d;
                if (obj == obj2) {
                    obj = new C87582a();
                    this.f89593d = obj;
                }
            }
        }
        return (C87582a) obj;
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
        return "provider " + C87582a.class.getName();
    }
}
