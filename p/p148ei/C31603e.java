package p148ei;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BroadcastEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ei.e */
public enum C31603e implements C38174i<C116775d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84453d;

    /* renamed from: ei.e$a */
    public static final class C31604a {

        /* renamed from: a */
        public static final List<Object> f84454a = null;

        static {
            f84454a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84453d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84453d;
                if (obj == obj2) {
                    obj = new C116775d();
                    this.f84453d = obj;
                }
            }
        }
        return (C116775d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31604a.f84454a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BroadcastEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C116775d.class.getName();
    }
}
