package i73;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WalletLockProtectEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: i73.i */
public enum C33233i implements C38174i<C108395h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f90164d;

    /* renamed from: i73.i$a */
    public static final class C33234a {

        /* renamed from: a */
        public static final List<Object> f90165a = null;

        static {
            f90165a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f90164d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f90164d;
                if (obj == obj2) {
                    obj = new C108395h();
                    this.f90164d = obj;
                }
            }
        }
        return (C108395h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C33234a.f90165a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WalletLockProtectEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C108395h.class.getName();
    }
}
