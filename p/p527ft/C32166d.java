package p527ft;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ft.d */
public enum C32166d implements C38174i<C97977c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85515d;

    public Object get() {
        Object obj = this.f85515d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85515d;
                if (obj == obj2) {
                    obj = new C97977c();
                    this.f85515d = obj;
                }
            }
        }
        return (C97977c) obj;
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
        return "provider " + C97977c.class.getName();
    }
}
