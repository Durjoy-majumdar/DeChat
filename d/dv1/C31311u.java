package dv1;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dv1.u */
public enum C31311u implements C38174i<C31310t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83829d;

    public Object get() {
        Object obj = this.f83829d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83829d;
                if (obj == obj2) {
                    obj = new C31310t();
                    this.f83829d = obj;
                }
            }
        }
        return (C31310t) obj;
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
        return Objects.equals(obj, ManualAuthEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31310t.class.getName();
    }
}
