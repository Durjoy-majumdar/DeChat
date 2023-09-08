package x02;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.HotPatchApplyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: x02.k */
public enum C38432k implements C38174i<C91118g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101385d;

    /* renamed from: x02.k$a */
    public static final class C38433a {

        /* renamed from: a */
        public static final List<Object> f101386a = null;

        static {
            f101386a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_PATCH});
        }
    }

    public Object get() {
        Object obj = this.f101385d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101385d;
                if (obj == obj2) {
                    obj = C91118g.f261313f.get();
                    this.f101385d = obj;
                }
            }
        }
        return (C91118g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C91118g.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38433a.f101386a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, HotPatchApplyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C91118g.class.getName();
    }
}
