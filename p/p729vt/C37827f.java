package p729vt;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: vt.f */
public enum C37827f implements C38174i<C37826e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100172d;

    public Object get() {
        Object obj = this.f100172d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100172d;
                if (obj == obj2) {
                    obj = new C37826e();
                    this.f100172d = obj;
                }
            }
        }
        return (C37826e) obj;
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
        return "provider " + C37826e.class.getName();
    }
}
