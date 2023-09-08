package h22;

import com.tencent.p014mm.autogen.events.FinderSyncEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.p */
public enum C32688p implements C38174i<C32687o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86729d;

    public Object get() {
        Object obj = this.f86729d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86729d;
                if (obj == obj2) {
                    obj = new C32687o();
                    this.f86729d = obj;
                }
            }
        }
        return (C32687o) obj;
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
        return Objects.equals(obj, FinderSyncEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32687o.class.getName();
    }
}
