package p669qw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qw.r */
public enum C36127r implements C38174i<C36126q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96274d;

    public Object get() {
        Object obj = this.f96274d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96274d;
                if (obj == obj2) {
                    obj = new C36126q();
                    this.f96274d = obj;
                }
            }
        }
        return (C36126q) obj;
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
        return "provider " + C36126q.class.getName();
    }
}
