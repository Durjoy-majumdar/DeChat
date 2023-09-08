package gz0;

import com.tencent.p014mm.autogen.events.ShareCouponCardEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gz0.y */
public enum C32631y implements C38174i<C98290x> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86623d;

    public Object get() {
        Object obj = this.f86623d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86623d;
                if (obj == obj2) {
                    obj = new C98290x();
                    this.f86623d = obj;
                }
            }
        }
        return (C98290x) obj;
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
        return Objects.equals(obj, ShareCouponCardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98290x.class.getName();
    }
}
