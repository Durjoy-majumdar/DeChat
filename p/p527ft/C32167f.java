package p527ft;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ft.f */
public enum C32167f implements C38174i<C97978e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85518d;

    public Object get() {
        Object obj = this.f85518d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85518d;
                if (obj == obj2) {
                    obj = new C97978e();
                    this.f85518d = obj;
                }
            }
        }
        return (C97978e) obj;
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
        return "provider " + C97978e.class.getName();
    }
}
