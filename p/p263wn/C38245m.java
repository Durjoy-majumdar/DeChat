package p263wn;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wn.m */
public enum C38245m implements C38174i<C91040l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100990d;

    public Object get() {
        Object obj = this.f100990d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100990d;
                if (obj == obj2) {
                    obj = new C91040l();
                    this.f100990d = obj;
                }
            }
        }
        return (C91040l) obj;
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
        return "provider " + C91040l.class.getName();
    }
}
