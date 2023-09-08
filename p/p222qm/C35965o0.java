package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KickOfflineEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.o0 */
public enum C35965o0 implements C38174i<C35963n0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95917d;

    /* renamed from: qm.o0$a */
    public static final class C35966a {

        /* renamed from: a */
        public static final List<Object> f95918a = null;

        static {
            f95918a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95917d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95917d;
                if (obj == obj2) {
                    obj = new C35963n0();
                    this.f95917d = obj;
                }
            }
        }
        return (C35963n0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35966a.f95918a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, KickOfflineEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35963n0.class.getName();
    }
}
