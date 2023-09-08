package cb1;

import com.tencent.p014mm.autogen.events.ExtCallEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: cb1.b */
public enum C28521b implements C38174i<C79993a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78356d;

    public Object get() {
        Object obj = this.f78356d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78356d;
                if (obj == obj2) {
                    obj = new C79993a();
                    this.f78356d = obj;
                }
            }
        }
        return (C79993a) obj;
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
        return Objects.equals(obj, ExtCallEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79993a.class.getName();
    }
}
