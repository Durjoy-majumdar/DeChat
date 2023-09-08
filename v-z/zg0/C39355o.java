package zg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RcptRecentAddrEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zg0.o */
public enum C39355o implements C38174i<C16164n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105778d;

    /* renamed from: zg0.o$a */
    public static final class C39356a {

        /* renamed from: a */
        public static final List<Object> f105779a = null;

        static {
            f105779a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105778d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105778d;
                if (obj == obj2) {
                    obj = new C16164n();
                    this.f105778d = obj;
                }
            }
        }
        return (C16164n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39356a.f105779a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RcptRecentAddrEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C16164n.class.getName();
    }
}
