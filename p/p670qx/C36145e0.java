package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReportSensorDataEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.e0 */
public enum C36145e0 implements C38174i<C36143d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96316d;

    /* renamed from: qx.e0$a */
    public static final class C36146a {

        /* renamed from: a */
        public static final List<Object> f96317a = null;

        static {
            f96317a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96316d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96316d;
                if (obj == obj2) {
                    obj = new C36143d0();
                    this.f96316d = obj;
                }
            }
        }
        return (C36143d0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36146a.f96317a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReportSensorDataEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36143d0.class.getName();
    }
}
