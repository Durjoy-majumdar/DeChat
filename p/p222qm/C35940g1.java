package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SDKOpenOfflinePayEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.g1 */
public enum C35940g1 implements C38174i<C89708f1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95864d;

    /* renamed from: qm.g1$a */
    public static final class C35941a {

        /* renamed from: a */
        public static final List<Object> f95865a = null;

        static {
            f95865a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95864d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95864d;
                if (obj == obj2) {
                    obj = new C89708f1();
                    this.f95864d = obj;
                }
            }
        }
        return (C89708f1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35941a.f95865a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SDKOpenOfflinePayEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89708f1.class.getName();
    }
}
