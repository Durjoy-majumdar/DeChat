package xf2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xf2.h */
public enum C38512h implements C38174i<C38511g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101547d;

    public Object get() {
        Object obj = this.f101547d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101547d;
                if (obj == obj2) {
                    obj = new C38511g();
                    this.f101547d = obj;
                }
            }
        }
        return (C38511g) obj;
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
        return "provider " + C38511g.class.getName();
    }
}
