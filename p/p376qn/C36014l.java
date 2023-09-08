package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.l */
public enum C36014l implements C38174i<C22112k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96021d;

    public Object get() {
        Object obj = this.f96021d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96021d;
                if (obj == obj2) {
                    obj = new C22112k();
                    this.f96021d = obj;
                }
            }
        }
        return (C22112k) obj;
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
        return "provider " + C22112k.class.getName();
    }
}
