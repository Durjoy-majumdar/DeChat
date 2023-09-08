package p265wx;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wx.j */
public enum C38330j implements C38174i<C22932i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101179d;

    public Object get() {
        Object obj = this.f101179d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101179d;
                if (obj == obj2) {
                    obj = new C22932i();
                    this.f101179d = obj;
                }
            }
        }
        return (C22932i) obj;
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
        return "provider " + C22932i.class.getName();
    }
}
