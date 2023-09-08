package p377qu;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: qu.d */
public enum C36084d implements C38174i<C89852c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96179d;

    public Object get() {
        Object obj = this.f96179d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96179d;
                if (obj == obj2) {
                    obj = new C89852c();
                    this.f96179d = obj;
                }
            }
        }
        return (C89852c) obj;
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
        return "provider " + C89852c.class.getName();
    }
}
