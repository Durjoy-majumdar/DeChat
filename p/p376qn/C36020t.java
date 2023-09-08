package p376qn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qn.t */
public enum C36020t implements C38174i<C36019s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96033d;

    public Object get() {
        Object obj = this.f96033d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96033d;
                if (obj == obj2) {
                    obj = new C36019s();
                    this.f96033d = obj;
                }
            }
        }
        return (C36019s) obj;
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
        return "provider " + C36019s.class.getName();
    }
}
