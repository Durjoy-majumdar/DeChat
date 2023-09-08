package bb2;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: bb2.c */
public enum C28291c implements C38174i<C92212b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77881d;

    public Object get() {
        Object obj = this.f77881d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77881d;
                if (obj == obj2) {
                    obj = new C92212b();
                    this.f77881d = obj;
                }
            }
        }
        return (C92212b) obj;
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
        return "provider " + C92212b.class.getName();
    }
}
