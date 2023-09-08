package jl2;

import com.tencent.p014mm.autogen.events.DestroyPreloadedWebViewEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: jl2.g */
public enum C33594g implements C38174i<C33593f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90922d;

    public Object get() {
        Object obj = this.f90922d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90922d;
                if (obj == obj2) {
                    obj = new C33593f();
                    this.f90922d = obj;
                }
            }
        }
        return (C33593f) obj;
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
        return Objects.equals(obj, DestroyPreloadedWebViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33593f.class.getName();
    }
}
