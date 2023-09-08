package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.v */
public enum C38758v implements C38174i<C53375u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104560d;

    public Object get() {
        Object obj = this.f104560d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104560d;
                if (obj == obj2) {
                    obj = new C53375u();
                    this.f104560d = obj;
                }
            }
        }
        return (C53375u) obj;
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
        return "provider " + C53375u.class.getName();
    }
}
