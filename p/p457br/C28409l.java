package p457br;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: br.l */
public enum C28409l implements C38174i<C92296k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78134d;

    public Object get() {
        Object obj = this.f78134d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78134d;
                if (obj == obj2) {
                    obj = new C92296k();
                    this.f78134d = obj;
                }
            }
        }
        return (C92296k) obj;
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
        return "provider " + C92296k.class.getName();
    }
}
