package p553ht;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: ht.c */
public enum C33037c implements C38174i<C33035b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89712d;

    public Object get() {
        Object obj = this.f89712d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89712d;
                if (obj == obj2) {
                    obj = new C33035b();
                    this.f89712d = obj;
                }
            }
        }
        return (C33035b) obj;
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
        return "provider " + C33035b.class.getName();
    }
}
