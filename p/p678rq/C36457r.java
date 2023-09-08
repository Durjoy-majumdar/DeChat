package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NewEdgeSqlUpdateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.r */
public enum C36457r implements C38174i<C36456q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96984d;

    /* renamed from: rq.r$a */
    public static final class C36458a {

        /* renamed from: a */
        public static final List<Object> f96985a = null;

        static {
            f96985a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96984d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96984d;
                if (obj == obj2) {
                    obj = new C36456q();
                    this.f96984d = obj;
                }
            }
        }
        return (C36456q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36458a.f96985a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NewEdgeSqlUpdateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36456q.class.getName();
    }
}
