package ma2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ma2.a0 */
public enum C34497a0 implements C38174i<C99825z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92841d;

    /* renamed from: ma2.a0$a */
    public static final class C34498a {

        /* renamed from: a */
        public static final List<Object> f92842a = null;

        static {
            f92842a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92841d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92841d;
                if (obj == obj2) {
                    obj = new C99825z();
                    this.f92841d = obj;
                }
            }
        }
        return (C99825z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34498a.f92842a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 6);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99825z.class.getName();
    }
}
