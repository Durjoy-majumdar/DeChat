package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AcceptCouponCardEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.z */
public enum C32288z implements C38174i<C75823y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85756d;

    /* renamed from: g00.z$a */
    public static final class C32289a {

        /* renamed from: a */
        public static final List<Object> f85757a = null;

        static {
            f85757a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85756d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85756d;
                if (obj == obj2) {
                    obj = new C75823y();
                    this.f85756d = obj;
                }
            }
        }
        return (C75823y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32289a.f85757a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AcceptCouponCardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75823y.class.getName();
    }
}
