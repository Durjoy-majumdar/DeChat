package p351jq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: jq.i */
public enum C33628i implements C38174i<C76434h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91017d;

    public Object get() {
        Object obj = this.f91017d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91017d;
                if (obj == obj2) {
                    obj = new C76434h();
                    this.f91017d = obj;
                }
            }
        }
        return (C76434h) obj;
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
        return "provider " + C76434h.class.getName();
    }
}
