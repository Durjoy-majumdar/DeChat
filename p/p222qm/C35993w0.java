package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OnAuthSyncEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.w0 */
public enum C35993w0 implements C38174i<C35990v0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95973d;

    /* renamed from: qm.w0$a */
    public static final class C35994a {

        /* renamed from: a */
        public static final List<Object> f95974a = null;

        static {
            f95974a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95973d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95973d;
                if (obj == obj2) {
                    obj = new C35990v0();
                    this.f95973d = obj;
                }
            }
        }
        return (C35990v0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35994a.f95974a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OnAuthSyncEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35990v0.class.getName();
    }
}
