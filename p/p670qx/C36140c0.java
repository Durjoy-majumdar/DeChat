package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReportNewInstallAppEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.c0 */
public enum C36140c0 implements C38174i<C36138b0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96306d;

    /* renamed from: qx.c0$a */
    public static final class C36141a {

        /* renamed from: a */
        public static final List<Object> f96307a = null;

        static {
            f96307a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96306d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96306d;
                if (obj == obj2) {
                    obj = new C36138b0();
                    this.f96306d = obj;
                }
            }
        }
        return (C36138b0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36141a.f96307a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReportNewInstallAppEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36138b0.class.getName();
    }
}
