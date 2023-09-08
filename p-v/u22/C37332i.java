package u22;

import com.tencent.wxmm.v2helper;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: u22.i */
public enum C37332i implements C38174i<C37331h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98732d;

    public Object get() {
        Object obj = this.f98732d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98732d;
                if (obj == obj2) {
                    obj = new C37331h();
                    this.f98732d = obj;
                }
            }
        }
        return (C37331h) obj;
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
        return Objects.equals(obj, Integer.valueOf(v2helper.EMethodSetSpkEnhance));
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37331h.class.getName();
    }
}
