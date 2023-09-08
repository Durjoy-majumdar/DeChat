package gz0;

import com.tencent.p014mm.autogen.events.ShakeAcceptCouponCardEvent;
import java.util.Collections;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gz0.b */
public enum C32625b implements C38174i<C20866a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86603d;

    public Object get() {
        Object obj = this.f86603d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86603d;
                if (obj == obj2) {
                    obj = new C20866a();
                    this.f86603d = obj;
                }
            }
        }
        return (C20866a) obj;
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
        return Objects.equals(obj, ShakeAcceptCouponCardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C20866a.class.getName();
    }
}
