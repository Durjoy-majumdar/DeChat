package p703tu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: tu.f */
public enum C37250f implements C38174i<C52364e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98575d;

    public Object get() {
        Object obj = this.f98575d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98575d;
                if (obj == obj2) {
                    obj = new C52364e();
                    this.f98575d = obj;
                }
            }
        }
        return (C52364e) obj;
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
        return "provider " + C52364e.class.getName();
    }
}
