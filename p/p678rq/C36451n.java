package p678rq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.NewEdgeScriptUpdateEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: rq.n */
public enum C36451n implements C38174i<C36450m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96976d;

    /* renamed from: rq.n$a */
    public static final class C36452a {

        /* renamed from: a */
        public static final List<Object> f96977a = null;

        static {
            f96977a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96976d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96976d;
                if (obj == obj2) {
                    obj = new C36450m();
                    this.f96976d = obj;
                }
            }
        }
        return (C36450m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36452a.f96977a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, NewEdgeScriptUpdateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36450m.class.getName();
    }
}
