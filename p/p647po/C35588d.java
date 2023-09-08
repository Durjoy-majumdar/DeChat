package p647po;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: po.d */
public enum C35588d implements C38174i<C100829c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95147d;

    public Object get() {
        Object obj = this.f95147d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95147d;
                if (obj == obj2) {
                    obj = new C100829c();
                    this.f95147d = obj;
                }
            }
        }
        return (C100829c) obj;
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
        return "provider " + C100829c.class.getName();
    }
}
