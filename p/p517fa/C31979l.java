package p517fa;

import com.tencent.kinda.debug.api.IKindaReloadFeatureService;
import com.tencent.kinda.framework.app.SubCoreKinda;
import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fa.l */
public enum C31979l implements C38174i<C31977k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85158d;

    /* renamed from: fa.l$a */
    public static final class C31980a {

        /* renamed from: a */
        public static final List<Object> f85159a = null;

        static {
            f85159a = Arrays.asList(new Object[]{IKindaReloadFeatureService.class, SubCoreKinda.class});
        }
    }

    /* renamed from: fa.l$b */
    public static final class C31981b {

        /* renamed from: a */
        public static final List<Object> f85160a = null;

        static {
            f85160a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85158d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85158d;
                if (obj == obj2) {
                    obj = new C31977k();
                    this.f85158d = obj;
                }
            }
        }
        return (C31977k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C31980a.f85159a;
        }
        if ("onProcess".equals(str)) {
            return C31981b.f85160a;
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
        return "provider " + C31977k.class.getName();
    }
}
