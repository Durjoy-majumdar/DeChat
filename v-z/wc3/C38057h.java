package wc3;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: wc3.h */
public enum C38057h implements C38174i<C102427g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f100603d;

    public Object get() {
        Object obj = this.f100603d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f100603d;
                if (obj == obj2) {
                    obj = new C102427g();
                    this.f100603d = obj;
                }
            }
        }
        return (C102427g) obj;
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
        return "provider " + C102427g.class.getName();
    }
}
