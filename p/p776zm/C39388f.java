package p776zm;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: zm.f */
public enum C39388f implements C38174i<C39385e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105833d;

    public Object get() {
        Object obj = this.f105833d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105833d;
                if (obj == obj2) {
                    obj = new C39385e();
                    this.f105833d = obj;
                }
            }
        }
        return (C39385e) obj;
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
        return "provider " + C39385e.class.getName();
    }
}
