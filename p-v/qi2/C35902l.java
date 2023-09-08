package qi2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WalletQueryRemittanceStatusEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi2.l */
public enum C35902l implements C38174i<C77351k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95794d;

    /* renamed from: qi2.l$a */
    public static final class C35903a {

        /* renamed from: a */
        public static final List<Object> f95795a = null;

        static {
            f95795a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95794d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95794d;
                if (obj == obj2) {
                    obj = new C77351k();
                    this.f95794d = obj;
                }
            }
        }
        return (C77351k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35903a.f95795a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WalletQueryRemittanceStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77351k.class.getName();
    }
}
