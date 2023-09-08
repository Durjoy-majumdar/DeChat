package fh0;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import f81.C116807d;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fh0.e */
public enum C32046e implements C38174i<C32045d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85285d;

    /* renamed from: fh0.e$a */
    public static final class C32047a {

        /* renamed from: a */
        public static final List<Object> f85286a = null;

        static {
            f85286a = Arrays.asList(new Object[]{C116807d.class});
        }
    }

    /* renamed from: fh0.e$b */
    public static final class C32048b {

        /* renamed from: a */
        public static final List<Object> f85287a = null;

        static {
            f85287a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS});
        }
    }

    public Object get() {
        Object obj = this.f85285d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85285d;
                if (obj == obj2) {
                    obj = new C32045d();
                    this.f85285d = obj;
                }
            }
        }
        return (C32045d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C32047a.f85286a;
        }
        if ("onProcess".equals(str)) {
            return C32048b.f85287a;
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
        return "provider " + C32045d.class.getName();
    }
}
