package jz0;

import com.tencent.p014mm.autogen.events.ResetCardRetryCounterEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jz0.j */
public enum C33809j implements C38174i<C33808i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91408d;

    public Object get() {
        Object obj = this.f91408d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91408d;
                if (obj == obj2) {
                    obj = new C33808i();
                    this.f91408d = obj;
                }
            }
        }
        return (C33808i) obj;
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
        return Objects.equals(obj, ResetCardRetryCounterEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33808i.class.getName();
    }
}
