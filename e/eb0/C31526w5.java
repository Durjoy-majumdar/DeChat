package eb0;

import com.tencent.p014mm.app.C80625v0;
import eb0.C86497v5;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.w5 */
public enum C31526w5 implements C38174i<C86497v5> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84278d;

    /* renamed from: eb0.w5$a */
    public static final class C31527a {

        /* renamed from: a */
        public static final List<Object> f84279a = null;

        static {
            f84279a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84278d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84278d;
                if (obj == obj2) {
                    obj = C86497v5.C31522d.f84272a;
                    this.f84278d = obj;
                }
            }
        }
        return (C86497v5) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C86497v5.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C31527a.f84279a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 10001) || Objects.equals(obj, 10002);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C86497v5.class.getName();
    }
}
