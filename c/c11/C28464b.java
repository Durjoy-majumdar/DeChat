package c11;

import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c11.b */
public enum C28464b implements C38174i<C28463a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78245d;

    public Object get() {
        Object obj = this.f78245d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78245d;
                if (obj == obj2) {
                    obj = new C28463a();
                    this.f78245d = obj;
                }
            }
        }
        return (C28463a) obj;
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
        return Objects.equals(obj, CoreAccountInitializationNotifiedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28463a.class.getName();
    }
}
