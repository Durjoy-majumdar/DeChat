package c22;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: c22.c */
public enum C28491c implements C38174i<C28488b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78302d;

    public Object get() {
        Object obj = this.f78302d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78302d;
                if (obj == obj2) {
                    obj = new C28488b();
                    this.f78302d = obj;
                }
            }
        }
        return (C28488b) obj;
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
        return "provider " + C28488b.class.getName();
    }
}
