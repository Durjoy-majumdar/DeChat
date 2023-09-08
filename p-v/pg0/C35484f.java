package pg0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WebViewUIDestroyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pg0.f */
public enum C35484f implements C38174i<C11933e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94923d;

    /* renamed from: pg0.f$a */
    public static final class C35485a {

        /* renamed from: a */
        public static final List<Object> f94924a = null;

        static {
            f94924a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94923d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94923d;
                if (obj == obj2) {
                    obj = new C11933e();
                    this.f94923d = obj;
                }
            }
        }
        return (C11933e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35485a.f94924a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WebViewUIDestroyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11933e.class.getName();
    }
}
