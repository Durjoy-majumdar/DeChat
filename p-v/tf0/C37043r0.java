package tf0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import ei3.C31607a;
import f81.C7998c;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p151er.C58676k;
import p261wl.C38174i;

/* renamed from: tf0.r0 */
public enum C37043r0 implements C38174i<FinderCommonFeatureService> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98202d;

    /* renamed from: tf0.r0$a */
    public static final class C37044a {

        /* renamed from: a */
        public static final List<Object> f98203a = null;

        static {
            f98203a = Arrays.asList(new Object[]{C7998c.class, C58676k.class});
        }
    }

    /* renamed from: tf0.r0$b */
    public static final class C37045b {

        /* renamed from: a */
        public static final List<Object> f98204a = null;

        static {
            f98204a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98202d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98202d;
                if (obj == obj2) {
                    obj = new FinderCommonFeatureService();
                    this.f98202d = obj;
                }
            }
        }
        return (FinderCommonFeatureService) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37045b.f98204a;
        }
        if ("dependencies".equals(str)) {
            return C37044a.f98203a;
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
        return "provider " + FinderCommonFeatureService.class.getName();
    }
}
