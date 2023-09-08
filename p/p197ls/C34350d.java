package p197ls;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ls.d */
public enum C34350d implements C38174i<C10644c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92535d;

    public Object get() {
        Object obj = this.f92535d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92535d;
                if (obj == obj2) {
                    obj = new C10644c();
                    this.f92535d = obj;
                }
            }
        }
        return (C10644c) obj;
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
        return "provider " + C10644c.class.getName();
    }
}
