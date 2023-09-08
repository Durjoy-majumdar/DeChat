package er1;

import com.tencent.p014mm.autogen.events.FinderCreateAccountResultEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: er1.d0 */
public enum C31671d0 implements C38174i<C7786c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84601d;

    public Object get() {
        Object obj = this.f84601d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84601d;
                if (obj == obj2) {
                    obj = new C7786c0();
                    this.f84601d = obj;
                }
            }
        }
        return (C7786c0) obj;
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
        return Objects.equals(obj, FinderCreateAccountResultEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C7786c0.class.getName();
    }
}
