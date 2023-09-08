package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WebviewReportPublisherIdEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.f0 */
public enum C32260f0 implements C38174i<C98062e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85699d;

    /* renamed from: g00.f0$a */
    public static final class C32261a {

        /* renamed from: a */
        public static final List<Object> f85700a = null;

        static {
            f85700a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85699d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85699d;
                if (obj == obj2) {
                    obj = new C98062e0();
                    this.f85699d = obj;
                }
            }
        }
        return (C98062e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32261a.f85700a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WebviewReportPublisherIdEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98062e0.class.getName();
    }
}
