package tm2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm2.f */
public enum C37216f implements C38174i<C78046e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98509d;

    /* renamed from: tm2.f$a */
    public static final class C37217a {

        /* renamed from: a */
        public static final List<Object> f98510a = null;

        static {
            f98510a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98509d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98509d;
                if (obj == obj2) {
                    obj = new C78046e();
                    this.f98509d = obj;
                }
            }
        }
        return (C78046e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37217a.f98510a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C78046e.class.getName();
    }
}
