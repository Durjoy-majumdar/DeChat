package fw0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C30630c;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fw0.z */
public enum C32200z implements C38174i<C87107w> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85600d;

    /* renamed from: fw0.z$a */
    public static final class C32201a {

        /* renamed from: a */
        public static final List<Object> f85601a = null;

        static {
            f85601a = Arrays.asList(new Object[]{C85597u.class, C30630c.class});
        }
    }

    /* renamed from: fw0.z$b */
    public static final class C32202b {

        /* renamed from: a */
        public static final List<Object> f85602a = null;

        static {
            f85602a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS, C80625v0.MATCH_PUSH, C80625v0.MATCH_SUPPORT, C80625v0.MATCH_SANDBOX, C80625v0.MATCH_EXDEVICE, C80625v0.MATCH_PATCH});
        }
    }

    public Object get() {
        Object obj = this.f85600d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85600d;
                if (obj == obj2) {
                    obj = new C87107w();
                    this.f85600d = obj;
                }
            }
        }
        return (C87107w) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C32202b.f85602a;
        }
        if ("dependencies".equals(str)) {
            return C32201a.f85601a;
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
        return "provider " + C87107w.class.getName();
    }
}
