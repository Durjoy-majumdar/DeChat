package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.j0 */
public enum C32270j0 implements C38174i<C32268i0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85719d;

    /* renamed from: g00.j0$a */
    public static final class C32271a {

        /* renamed from: a */
        public static final List<Object> f85720a = null;

        static {
            f85720a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85719d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85719d;
                if (obj == obj2) {
                    obj = new C32268i0();
                    this.f85719d = obj;
                }
            }
        }
        return (C32268i0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32271a.f85720a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DynamicConfigUpdatedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32268i0.class.getName();
    }
}
