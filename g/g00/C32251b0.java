package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ConsumedCouponCardCodeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.b0 */
public enum C32251b0 implements C38174i<C75821a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85679d;

    /* renamed from: g00.b0$a */
    public static final class C32252a {

        /* renamed from: a */
        public static final List<Object> f85680a = null;

        static {
            f85680a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85679d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85679d;
                if (obj == obj2) {
                    obj = new C75821a0();
                    this.f85679d = obj;
                }
            }
        }
        return (C75821a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32252a.f85680a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ConsumedCouponCardCodeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75821a0.class.getName();
    }
}
