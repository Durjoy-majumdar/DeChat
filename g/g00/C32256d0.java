package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.d0 */
public enum C32256d0 implements C38174i<C32254c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85689d;

    /* renamed from: g00.d0$a */
    public static final class C32257a {

        /* renamed from: a */
        public static final List<Object> f85690a = null;

        static {
            f85690a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85689d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85689d;
                if (obj == obj2) {
                    obj = new C32254c0();
                    this.f85689d = obj;
                }
            }
        }
        return (C32254c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32257a.f85690a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckResUpdateCacheFileEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32254c0.class.getName();
    }
}
