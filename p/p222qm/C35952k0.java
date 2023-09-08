package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetDisasterInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.k0 */
public enum C35952k0 implements C38174i<C35950j0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95889d;

    /* renamed from: qm.k0$a */
    public static final class C35953a {

        /* renamed from: a */
        public static final List<Object> f95890a = null;

        static {
            f95890a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95889d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95889d;
                if (obj == obj2) {
                    obj = new C35950j0();
                    this.f95889d = obj;
                }
            }
        }
        return (C35950j0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35953a.f95890a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetDisasterInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35950j0.class.getName();
    }
}
