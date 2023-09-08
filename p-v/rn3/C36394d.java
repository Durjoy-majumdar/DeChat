package rn3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: rn3.d */
public enum C36394d implements C38174i<C36393c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96850d;

    public Object get() {
        Object obj = this.f96850d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96850d;
                if (obj == obj2) {
                    obj = new C36393c();
                    this.f96850d = obj;
                }
            }
        }
        return (C36393c) obj;
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
        return "provider " + C36393c.class.getName();
    }
}
