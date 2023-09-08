package p266wy;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wy.f */
public enum C38355f implements C38174i<C15605e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101225d;

    /* renamed from: wy.f$a */
    public static final class C38356a {

        /* renamed from: a */
        public static final List<Object> f101226a = null;

        static {
            f101226a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101225d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101225d;
                if (obj == obj2) {
                    obj = new C15605e();
                    this.f101225d = obj;
                }
            }
        }
        return (C15605e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38356a.f101226a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "teenagermodebecomeguardian");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C15605e.class.getName();
    }
}
