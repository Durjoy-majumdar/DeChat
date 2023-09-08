package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SnsPostSuccessEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.d0 */
public enum C31136d0 implements C38174i<C31133c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83477d;

    /* renamed from: dd2.d0$a */
    public static final class C31137a {

        /* renamed from: a */
        public static final List<Object> f83478a = null;

        static {
            f83478a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83477d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83477d;
                if (obj == obj2) {
                    obj = new C31133c0();
                    this.f83477d = obj;
                }
            }
        }
        return (C31133c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31137a.f83478a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SnsPostSuccessEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31133c0.class.getName();
    }
}
