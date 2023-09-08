package er1;

import com.tencent.p014mm.autogen.events.FinderIpcResultEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: er1.z0 */
public enum C31687z0 implements C38174i<C7924y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84636d;

    public Object get() {
        Object obj = this.f84636d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84636d;
                if (obj == obj2) {
                    obj = new C7924y0();
                    this.f84636d = obj;
                }
            }
        }
        return (C7924y0) obj;
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
        return Objects.equals(obj, FinderIpcResultEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C7924y0.class.getName();
    }
}
