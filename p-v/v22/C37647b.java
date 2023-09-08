package v22;

import com.tencent.p014mm.autogen.events.CleanStaticMapEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: v22.b */
public enum C37647b implements C38174i<C78319a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99791d;

    public Object get() {
        Object obj = this.f99791d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99791d;
                if (obj == obj2) {
                    obj = new C78319a();
                    this.f99791d = obj;
                }
            }
        }
        return (C78319a) obj;
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
        return Objects.equals(obj, CleanStaticMapEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C78319a.class.getName();
    }
}
