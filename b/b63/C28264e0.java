package b63;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: b63.e0 */
public enum C28264e0 implements C38174i<C67182d0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77832d;

    /* renamed from: b63.e0$a */
    public static final class C28265a {

        /* renamed from: a */
        public static final List<Object> f77833a = null;

        static {
            f77833a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77832d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77832d;
                if (obj == obj2) {
                    obj = new C67182d0();
                    this.f77832d = obj;
                }
            }
        }
        return (C67182d0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28265a.f77833a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WalletGetUserInfoEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67182d0.class.getName();
    }
}
