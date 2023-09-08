package lg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckCanSyncAddrBookEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lg0.d */
public enum C34237d implements C38174i<C10502c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92319d;

    /* renamed from: lg0.d$a */
    public static final class C34238a {

        /* renamed from: a */
        public static final List<Object> f92320a = null;

        static {
            f92320a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92319d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92319d;
                if (obj == obj2) {
                    obj = new C10502c();
                    this.f92319d = obj;
                }
            }
        }
        return (C10502c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34238a.f92320a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckCanSyncAddrBookEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C10502c.class.getName();
    }
}
