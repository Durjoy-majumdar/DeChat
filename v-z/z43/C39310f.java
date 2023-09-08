package z43;

import java.util.Collections;
import p261wl.C38174i;

/* renamed from: z43.f */
public enum C39310f implements C38174i<C39309e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105693d;

    public Object get() {
        Object obj = this.f105693d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105693d;
                if (obj == obj2) {
                    obj = new C39309e();
                    this.f105693d = obj;
                }
            }
        }
        return (C39309e) obj;
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
        return "provider " + C39309e.class.getName();
    }
}
