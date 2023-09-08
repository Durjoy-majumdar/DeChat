package at1;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: at1.e */
public enum C28132e implements C38174i<C0217b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77583d;

    public Object get() {
        Object obj = this.f77583d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77583d;
                if (obj == obj2) {
                    obj = new C0217b();
                    this.f77583d = obj;
                }
            }
        }
        return (C0217b) obj;
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
        return "provider " + C0217b.class.getName();
    }
}
