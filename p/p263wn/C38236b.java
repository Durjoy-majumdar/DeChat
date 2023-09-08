package p263wn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wn.b */
public enum C38236b implements C38174i<C91038a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100966d;

    public Object get() {
        Object obj = this.f100966d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100966d;
                if (obj == obj2) {
                    obj = new C91038a();
                    this.f100966d = obj;
                }
            }
        }
        return (C91038a) obj;
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
        return "provider " + C91038a.class.getName();
    }
}
