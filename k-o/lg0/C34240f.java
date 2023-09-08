package lg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: lg0.f */
public enum C34240f implements C38174i<C34239e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92323d;

    /* renamed from: lg0.f$a */
    public static final class C34241a {

        /* renamed from: a */
        public static final List<Object> f92324a = null;

        static {
            f92324a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92323d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92323d;
                if (obj == obj2) {
                    obj = new C34239e();
                    this.f92323d = obj;
                }
            }
        }
        return (C34239e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34241a.f92324a;
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
        return "provider " + C34239e.class.getName();
    }
}
