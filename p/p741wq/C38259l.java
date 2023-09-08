package p741wq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wq.l */
public enum C38259l implements C38174i<C38258k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101023d;

    public Object get() {
        Object obj = this.f101023d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101023d;
                if (obj == obj2) {
                    obj = new C38258k();
                    this.f101023d = obj;
                }
            }
        }
        return (C38258k) obj;
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
        return "provider " + C38258k.class.getName();
    }
}
