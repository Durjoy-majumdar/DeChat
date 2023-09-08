package p655px;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.normsg.C115632c;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: px.k */
public enum C35716k implements C38174i<C35714j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95412d;

    /* renamed from: px.k$a */
    public static final class C35717a {

        /* renamed from: a */
        public static final List<Object> f95413a = null;

        static {
            f95413a = Arrays.asList(new Object[]{C115632c.class});
        }
    }

    /* renamed from: px.k$b */
    public static final class C35718b {

        /* renamed from: a */
        public static final List<Object> f95414a = null;

        static {
            f95414a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f95412d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95412d;
                if (obj == obj2) {
                    obj = new C35714j();
                    this.f95412d = obj;
                }
            }
        }
        return (C35714j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C35717a.f95413a;
        }
        if ("onProcess".equals(str)) {
            return C35718b.f95414a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35714j.class.getName();
    }
}
