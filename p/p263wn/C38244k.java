package p263wn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wn.k */
public enum C38244k implements C38174i<C38243j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100987d;

    public Object get() {
        Object obj = this.f100987d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100987d;
                if (obj == obj2) {
                    obj = new C38243j();
                    this.f100987d = obj;
                }
            }
        }
        return (C38243j) obj;
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
        return "provider " + C38243j.class.getName();
    }
}
