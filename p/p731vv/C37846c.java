package p731vv;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vv.c */
public enum C37846c implements C38174i<C37845b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100204d;

    public Object get() {
        Object obj = this.f100204d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100204d;
                if (obj == obj2) {
                    obj = new C37845b();
                    this.f100204d = obj;
                }
            }
        }
        return (C37845b) obj;
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
        return "provider " + C37845b.class.getName();
    }
}
