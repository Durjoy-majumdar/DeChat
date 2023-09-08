package b02;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.wx_extension.C1262l;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: b02.i */
public enum C28223i implements C38174i<C28221h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77762d;

    /* renamed from: b02.i$a */
    public static final class C28224a {

        /* renamed from: a */
        public static final List<Object> f77763a = null;

        static {
            f77763a = Arrays.asList(new Object[]{C1262l.class});
        }
    }

    /* renamed from: b02.i$b */
    public static final class C28225b {

        /* renamed from: a */
        public static final List<Object> f77764a = null;

        static {
            f77764a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_MAGIC_EMOJI});
        }
    }

    public Object get() {
        Object obj = this.f77762d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77762d;
                if (obj == obj2) {
                    obj = new C28221h();
                    this.f77762d = obj;
                }
            }
        }
        return (C28221h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28225b.f77764a;
        }
        if ("dependencies".equals(str)) {
            return C28224a.f77763a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C28221h.class.getName();
    }
}
