package h22;

import com.tencent.p014mm.autogen.events.FinderTeenModeChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.r */
public enum C32689r implements C38174i<C8486q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86732d;

    public Object get() {
        Object obj = this.f86732d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86732d;
                if (obj == obj2) {
                    obj = new C8486q();
                    this.f86732d = obj;
                }
            }
        }
        return (C8486q) obj;
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
        return Objects.equals(obj, FinderTeenModeChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C8486q.class.getName();
    }
}
