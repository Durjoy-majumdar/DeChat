package v22;

import com.tencent.p014mm.autogen.events.LocationServerEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.s */
public enum C37661s implements C38174i<C78322r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99827d;

    public Object get() {
        Object obj = this.f99827d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99827d;
                if (obj == obj2) {
                    obj = new C78322r();
                    this.f99827d = obj;
                }
            }
        }
        return (C78322r) obj;
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
        return Objects.equals(obj, LocationServerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78322r.class.getName();
    }
}
