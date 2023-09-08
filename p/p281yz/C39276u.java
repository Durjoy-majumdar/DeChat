package p281yz;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C30644o;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yz.u */
public enum C39276u implements C38174i<C79171t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105633d;

    /* renamed from: yz.u$a */
    public static final class C39277a {

        /* renamed from: a */
        public static final List<Object> f105634a = null;

        static {
            f105634a = Arrays.asList(new Object[]{C30644o.class});
        }
    }

    /* renamed from: yz.u$b */
    public static final class C39278b {

        /* renamed from: a */
        public static final List<Object> f105635a = null;

        static {
            f105635a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105633d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105633d;
                if (obj == obj2) {
                    obj = new C79171t();
                    this.f105633d = obj;
                }
            }
        }
        return (C79171t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C39278b.f105635a;
        }
        if ("dependencies".equals(str)) {
            return C39277a.f105634a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79171t.class.getName();
    }
}
