package p439ao;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ao.a0 */
public enum C27941a0 implements C38174i<C27979z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77164d;

    public Object get() {
        Object obj = this.f77164d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77164d;
                if (obj == obj2) {
                    obj = new C27979z();
                    this.f77164d = obj;
                }
            }
        }
        return (C27979z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
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
        return "provider " + C27979z.class.getName();
    }
}
