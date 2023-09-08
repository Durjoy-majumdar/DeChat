package p005bg;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: bg.e */
public enum C28308e implements C38174i<C28305d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77911d;

    /* renamed from: bg.e$a */
    public static final class C28309a {

        /* renamed from: a */
        public static final List<Object> f77912a = null;

        static {
            f77912a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: bg.e$b */
    public static final class C28310b {

        /* renamed from: a */
        public static final List<Object> f77913a = null;

        static {
            f77913a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f77911d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77911d;
                if (obj == obj2) {
                    obj = new C28305d();
                    this.f77911d = obj;
                }
            }
        }
        return (C28305d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C28309a.f77912a;
        }
        if ("onProcess".equals(str)) {
            return C28310b.f77913a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28305d.class.getName();
    }
}
