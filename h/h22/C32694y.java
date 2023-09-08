package h22;

import com.tencent.p014mm.autogen.events.StartActivityEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.y */
public enum C32694y implements C38174i<C117062x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86741d;

    public Object get() {
        Object obj = this.f86741d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86741d;
                if (obj == obj2) {
                    obj = new C117062x();
                    this.f86741d = obj;
                }
            }
        }
        return (C117062x) obj;
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
        return Objects.equals(obj, StartActivityEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C117062x.class.getName();
    }
}
