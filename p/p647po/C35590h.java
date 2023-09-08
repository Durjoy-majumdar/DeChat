package p647po;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: po.h */
public enum C35590h implements C38174i<C100831g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95153d;

    public Object get() {
        Object obj = this.f95153d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95153d;
                if (obj == obj2) {
                    obj = new C100831g();
                    this.f95153d = obj;
                }
            }
        }
        return (C100831g) obj;
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
        return "provider " + C100831g.class.getName();
    }
}
