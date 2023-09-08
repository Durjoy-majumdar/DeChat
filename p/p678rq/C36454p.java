package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NewEdgeSqlDeleteEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.p */
public enum C36454p implements C38174i<C36453o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96980d;

    /* renamed from: rq.p$a */
    public static final class C36455a {

        /* renamed from: a */
        public static final List<Object> f96981a = null;

        static {
            f96981a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96980d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96980d;
                if (obj == obj2) {
                    obj = new C36453o();
                    this.f96980d = obj;
                }
            }
        }
        return (C36453o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36455a.f96981a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NewEdgeSqlDeleteEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36453o.class.getName();
    }
}
