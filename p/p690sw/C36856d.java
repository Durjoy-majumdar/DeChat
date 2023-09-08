package p690sw;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: sw.d */
public enum C36856d implements C38174i<C90359c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97834d;

    public Object get() {
        Object obj = this.f97834d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97834d;
                if (obj == obj2) {
                    obj = new C90359c();
                    this.f97834d = obj;
                }
            }
        }
        return (C90359c) obj;
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
        return "provider " + C90359c.class.getName();
    }
}
