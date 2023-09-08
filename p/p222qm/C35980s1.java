package p222qm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.StartWebViewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qm.s1 */
public enum C35980s1 implements C38174i<C35976r1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95949d;

    /* renamed from: qm.s1$a */
    public static final class C35981a {

        /* renamed from: a */
        public static final List<Object> f95950a = null;

        static {
            f95950a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95949d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95949d;
                if (obj == obj2) {
                    obj = new C35976r1();
                    this.f95949d = obj;
                }
            }
        }
        return (C35976r1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35981a.f95950a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, StartWebViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35976r1.class.getName();
    }
}
