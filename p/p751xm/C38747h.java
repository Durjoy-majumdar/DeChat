package p751xm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: xm.h */
public enum C38747h implements C38174i<C78857g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104527d;

    public Object get() {
        Object obj = this.f104527d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104527d;
                if (obj == obj2) {
                    obj = new C78857g();
                    this.f104527d = obj;
                }
            }
        }
        return (C78857g) obj;
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
        return "provider " + C78857g.class.getName();
    }
}
