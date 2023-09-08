package mh0;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import java.util.Collections;
import java.util.Objects;
import mh0.C99865e0;
import p261wl.C38174i;

/* renamed from: mh0.g0 */
public enum C34564g0 implements C38174i<C99865e0.C34562b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92965d;

    public Object get() {
        Object obj = this.f92965d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92965d;
                if (obj == obj2) {
                    obj = new C99865e0.C34562b();
                    this.f92965d = obj;
                }
            }
        }
        return (C99865e0.C34562b) obj;
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
        return Objects.equals(obj, RevokeMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99865e0.C34562b.class.getName();
    }
}
