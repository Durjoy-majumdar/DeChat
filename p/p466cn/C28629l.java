package p466cn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: cn.l */
public enum C28629l implements C38174i<C92427k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78558d;

    public Object get() {
        Object obj = this.f78558d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78558d;
                if (obj == obj2) {
                    obj = new C92427k();
                    this.f78558d = obj;
                }
            }
        }
        return (C92427k) obj;
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
        return "provider " + C92427k.class.getName();
    }
}
