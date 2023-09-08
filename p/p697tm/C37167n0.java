package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppBrandGetServiceUnreadCountEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.n0 */
public enum C37167n0 implements C38174i<C37165m0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98411d;

    /* renamed from: tm.n0$a */
    public static final class C37168a {

        /* renamed from: a */
        public static final List<Object> f98412a = null;

        static {
            f98412a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98411d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98411d;
                if (obj == obj2) {
                    obj = new C37165m0();
                    this.f98411d = obj;
                }
            }
        }
        return (C37165m0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37168a.f98412a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppBrandGetServiceUnreadCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37165m0.class.getName();
    }
}
