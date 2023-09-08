package xf0;

import com.tencent.p014mm.autogen.events.CloseAAEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: xf0.d */
public enum C38492d implements C38174i<C53321c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101505d;

    public Object get() {
        Object obj = this.f101505d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101505d;
                if (obj == obj2) {
                    obj = new C53321c();
                    this.f101505d = obj;
                }
            }
        }
        return (C53321c) obj;
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
        return Objects.equals(obj, CloseAAEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C53321c.class.getName();
    }
}
