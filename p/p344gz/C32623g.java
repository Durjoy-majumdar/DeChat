package p344gz;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: gz.g */
public enum C32623g implements C38174i<C32622f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86597d;

    public Object get() {
        Object obj = this.f86597d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86597d;
                if (obj == obj2) {
                    obj = new C32622f();
                    this.f86597d = obj;
                }
            }
        }
        return (C32622f) obj;
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
        return "provider " + C32622f.class.getName();
    }
}
