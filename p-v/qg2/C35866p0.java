package qg2;

import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qg2.p0 */
public enum C35866p0 implements C38174i<C101163o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95726d;

    public Object get() {
        Object obj = this.f95726d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95726d;
                if (obj == obj2) {
                    obj = new C101163o0();
                    this.f95726d = obj;
                }
            }
        }
        return (C101163o0) obj;
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
        return Objects.equals(obj, RecordOperationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C101163o0.class.getName();
    }
}
