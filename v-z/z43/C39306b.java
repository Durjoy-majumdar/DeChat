package z43;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: z43.b */
public enum C39306b implements C38174i<C39305a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105684d;

    public Object get() {
        Object obj = this.f105684d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105684d;
                if (obj == obj2) {
                    obj = new C39305a();
                    this.f105684d = obj;
                }
            }
        }
        return (C39305a) obj;
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
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39305a.class.getName();
    }
}
