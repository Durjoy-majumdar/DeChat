package p714us;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: us.c */
public enum C37575c implements C38174i<C52603b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99661d;

    public Object get() {
        Object obj = this.f99661d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99661d;
                if (obj == obj2) {
                    obj = new C52603b();
                    this.f99661d = obj;
                }
            }
        }
        return (C52603b) obj;
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
        return "provider " + C52603b.class.getName();
    }
}
