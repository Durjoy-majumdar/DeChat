package ue1;

import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ue1.e0 */
public enum C37428e0 implements C38174i<C37427d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98934d;

    public Object get() {
        Object obj = this.f98934d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98934d;
                if (obj == obj2) {
                    obj = new C37427d0();
                    this.f98934d = obj;
                }
            }
        }
        return (C37427d0) obj;
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
        return Objects.equals(obj, "FinderPersonalMsgSysMsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37427d0.class.getName();
    }
}
