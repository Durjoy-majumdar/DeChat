package az2;

import az2.C28181m;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: az2.n */
public enum C28183n implements C38174i<C39674e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77678d;

    public Object get() {
        Object obj = this.f77678d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77678d;
                if (obj == obj2) {
                    C28181m.f77675a.getClass();
                    obj = C39674e.f106452d;
                    this.f77678d = obj;
                }
            }
        }
        return (C39674e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C28181m.C28182a.class;
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
        return Objects.equals(obj, "modtextstatus") || Objects.equals(obj, "textstatuslike") || Objects.equals(obj, "textstatusreference") || Objects.equals(obj, "textstatusiconconfigrefresh") || Objects.equals(obj, 6284) || Objects.equals(obj, 5215) || Objects.equals(obj, 6253) || Objects.equals(obj, 4099);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39674e.class.getName();
    }
}
