package v22;

import com.tencent.p014mm.autogen.events.GetStaticMapEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.o */
public enum C37658o implements C38174i<C78321n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99821d;

    public Object get() {
        Object obj = this.f99821d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99821d;
                if (obj == obj2) {
                    obj = new C78321n();
                    this.f99821d = obj;
                }
            }
        }
        return (C78321n) obj;
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
        return Objects.equals(obj, GetStaticMapEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78321n.class.getName();
    }
}
