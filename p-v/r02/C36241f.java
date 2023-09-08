package r02;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: r02.f */
public enum C36241f implements C38174i<C36240e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96522d;

    /* renamed from: r02.f$a */
    public static final class C36242a {

        /* renamed from: a */
        public static final List<Object> f96523a = null;

        static {
            f96523a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96522d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96522d;
                if (obj == obj2) {
                    obj = new C36240e();
                    this.f96522d = obj;
                }
            }
        }
        return (C36240e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36242a.f96523a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36240e.class.getName();
    }
}
