package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppBrandSetServiceUnreadCountEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.t0 */
public enum C37188t0 implements C38174i<C37186s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98453d;

    /* renamed from: tm.t0$a */
    public static final class C37189a {

        /* renamed from: a */
        public static final List<Object> f98454a = null;

        static {
            f98454a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98453d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98453d;
                if (obj == obj2) {
                    obj = new C37186s0();
                    this.f98453d = obj;
                }
            }
        }
        return (C37186s0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37189a.f98454a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppBrandSetServiceUnreadCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37186s0.class.getName();
    }
}
