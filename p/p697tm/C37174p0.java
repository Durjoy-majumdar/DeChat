package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.p0 */
public enum C37174p0 implements C38174i<C90524o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98425d;

    /* renamed from: tm.p0$a */
    public static final class C37175a {

        /* renamed from: a */
        public static final List<Object> f98426a = null;

        static {
            f98426a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98425d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98425d;
                if (obj == obj2) {
                    obj = new C90524o0();
                    this.f98425d = obj;
                }
            }
        }
        return (C90524o0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37175a.f98426a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppBrandOuterMenuClickReportEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90524o0.class.getName();
    }
}
