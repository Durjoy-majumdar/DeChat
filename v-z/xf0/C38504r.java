package xf0;

import com.tencent.p014mm.autogen.events.WalletQueryAAStatusEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xf0.r */
public enum C38504r implements C38174i<C38503q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101532d;

    public Object get() {
        Object obj = this.f101532d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101532d;
                if (obj == obj2) {
                    obj = new C38503q();
                    this.f101532d = obj;
                }
            }
        }
        return (C38503q) obj;
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
        return Objects.equals(obj, WalletQueryAAStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38503q.class.getName();
    }
}
