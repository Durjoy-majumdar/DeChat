package p647po;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: po.b */
public enum C35587b implements C38174i<C100828a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95144d;

    public Object get() {
        Object obj = this.f95144d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95144d;
                if (obj == obj2) {
                    obj = new C100828a();
                    this.f95144d = obj;
                }
            }
        }
        return (C100828a) obj;
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
        return "provider " + C100828a.class.getName();
    }
}
