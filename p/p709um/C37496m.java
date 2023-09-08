package p709um;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: um.m */
public enum C37496m implements C38174i<C37495l> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99063d;

    public Object get() {
        Object obj = this.f99063d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99063d;
                if (obj == obj2) {
                    obj = new C37495l();
                    this.f99063d = obj;
                }
            }
        }
        return (C37495l) obj;
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
        return "provider " + C37495l.class.getName();
    }
}
