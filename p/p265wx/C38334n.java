package p265wx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wx.n */
public enum C38334n implements C38174i<C38333m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101186d;

    public Object get() {
        Object obj = this.f101186d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101186d;
                if (obj == obj2) {
                    obj = new C38333m();
                    this.f101186d = obj;
                }
            }
        }
        return (C38333m) obj;
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
        return "provider " + C38333m.class.getName();
    }
}
