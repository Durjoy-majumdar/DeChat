package p598lq;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: lq.f */
public enum C34334f implements C38174i<C34333e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92498d;

    public Object get() {
        Object obj = this.f92498d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92498d;
                if (obj == obj2) {
                    obj = new C34333e();
                    this.f92498d = obj;
                }
            }
        }
        return (C34333e) obj;
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
        return "provider " + C34333e.class.getName();
    }
}
