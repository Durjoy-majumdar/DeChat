package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReportTuringOwnerDataEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.g0 */
public enum C36150g0 implements C38174i<C36148f0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96326d;

    /* renamed from: qx.g0$a */
    public static final class C36151a {

        /* renamed from: a */
        public static final List<Object> f96327a = null;

        static {
            f96327a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96326d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96326d;
                if (obj == obj2) {
                    obj = new C36148f0();
                    this.f96326d = obj;
                }
            }
        }
        return (C36148f0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36151a.f96327a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReportTuringOwnerDataEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36148f0.class.getName();
    }
}
