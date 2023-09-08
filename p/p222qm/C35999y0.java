package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ResendMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.y0 */
public enum C35999y0 implements C38174i<C77367x0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95987d;

    /* renamed from: qm.y0$a */
    public static final class C36000a {

        /* renamed from: a */
        public static final List<Object> f95988a = null;

        static {
            f95988a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95987d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95987d;
                if (obj == obj2) {
                    obj = new C77367x0();
                    this.f95987d = obj;
                }
            }
        }
        return (C77367x0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36000a.f95988a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ResendMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77367x0.class.getName();
    }
}
