package h22;

import com.tencent.p014mm.autogen.events.VoipEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.t */
public enum C32691t implements C38174i<C32690s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86735d;

    public Object get() {
        Object obj = this.f86735d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86735d;
                if (obj == obj2) {
                    obj = new C32690s();
                    this.f86735d = obj;
                }
            }
        }
        return (C32690s) obj;
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
        return Objects.equals(obj, VoipEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32690s.class.getName();
    }
}
