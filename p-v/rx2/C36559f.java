package rx2;

import com.tencent.p014mm.autogen.events.LogoutEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rx2.f */
public enum C36559f implements C38174i<C36558e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97239d;

    public Object get() {
        Object obj = this.f97239d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97239d;
                if (obj == obj2) {
                    obj = new C36558e();
                    this.f97239d = obj;
                }
            }
        }
        return (C36558e) obj;
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
        return Objects.equals(obj, LogoutEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36558e.class.getName();
    }
}
