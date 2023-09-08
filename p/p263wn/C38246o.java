package p263wn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wn.o */
public enum C38246o implements C38174i<C15551n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100993d;

    public Object get() {
        Object obj = this.f100993d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100993d;
                if (obj == obj2) {
                    obj = new C15551n();
                    this.f100993d = obj;
                }
            }
        }
        return (C15551n) obj;
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
        return "provider " + C15551n.class.getName();
    }
}
