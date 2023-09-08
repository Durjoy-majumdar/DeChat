package h22;

import com.tencent.p014mm.autogen.events.HomeUITabChangeEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h22.w */
public enum C32693w implements C38174i<C32692v> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86738d;

    public Object get() {
        Object obj = this.f86738d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86738d;
                if (obj == obj2) {
                    obj = new C32692v();
                    this.f86738d = obj;
                }
            }
        }
        return (C32692v) obj;
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
        return Objects.equals(obj, HomeUITabChangeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32692v.class.getName();
    }
}
