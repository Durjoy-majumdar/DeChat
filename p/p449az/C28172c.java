package p449az;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: az.c */
public enum C28172c implements C38174i<C28171b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77661d;

    public Object get() {
        Object obj = this.f77661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77661d;
                if (obj == obj2) {
                    obj = new C28171b();
                    this.f77661d = obj;
                }
            }
        }
        return (C28171b) obj;
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
        return "provider " + C28171b.class.getName();
    }
}
