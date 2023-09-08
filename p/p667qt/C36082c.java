package p667qt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qt.c */
public enum C36082c implements C38174i<C36081b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96173d;

    public Object get() {
        Object obj = this.f96173d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96173d;
                if (obj == obj2) {
                    obj = new C36081b();
                    this.f96173d = obj;
                }
            }
        }
        return (C36081b) obj;
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
        return "provider " + C36081b.class.getName();
    }
}
