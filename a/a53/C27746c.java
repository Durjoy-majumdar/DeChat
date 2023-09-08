package a53;

import com.tencent.p014mm.autogen.events.WCPayStartBalanceFetchEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a53.c */
public enum C27746c implements C38174i<C67005b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76776d;

    public Object get() {
        Object obj = this.f76776d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76776d;
                if (obj == obj2) {
                    obj = new C67005b();
                    this.f76776d = obj;
                }
            }
        }
        return (C67005b) obj;
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
        return Objects.equals(obj, WCPayStartBalanceFetchEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67005b.class.getName();
    }
}
