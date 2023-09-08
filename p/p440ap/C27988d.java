package p440ap;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ap.d */
public enum C27988d implements C38174i<C92048c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77256d;

    /* renamed from: ap.d$a */
    public static final class C27989a {

        /* renamed from: a */
        public static final List<Object> f77257a = null;

        static {
            f77257a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77256d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77256d;
                if (obj == obj2) {
                    obj = new C92048c();
                    this.f77256d = obj;
                }
            }
        }
        return (C92048c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27989a.f77257a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 4);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C92048c.class.getName();
    }
}
