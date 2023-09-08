package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SnsPostFailEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.b0 */
public enum C31130b0 implements C38174i<C31127a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83469d;

    /* renamed from: dd2.b0$a */
    public static final class C31131a {

        /* renamed from: a */
        public static final List<Object> f83470a = null;

        static {
            f83470a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83469d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83469d;
                if (obj == obj2) {
                    obj = new C31127a0();
                    this.f83469d = obj;
                }
            }
        }
        return (C31127a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31131a.f83470a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SnsPostFailEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31127a0.class.getName();
    }
}
