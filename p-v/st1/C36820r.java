package st1;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GetWcPaySignEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: st1.r */
public enum C36820r implements C38174i<C48463q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f97770d;

    /* renamed from: st1.r$a */
    public static final class C36821a {

        /* renamed from: a */
        public static final List<Object> f97771a = null;

        static {
            f97771a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f97770d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f97770d;
                if (obj == obj2) {
                    obj = new C48463q();
                    this.f97770d = obj;
                }
            }
        }
        return (C48463q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36821a.f97771a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GetWcPaySignEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C48463q.class.getName();
    }
}
