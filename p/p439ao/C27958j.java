package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.j */
public enum C27958j implements C38174i<C27956i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77190d;

    /* renamed from: ao.j$a */
    public static final class C27959a {

        /* renamed from: a */
        public static final List<Object> f77191a = null;

        static {
            f77191a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77190d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77190d;
                if (obj == obj2) {
                    obj = new C27956i();
                    this.f77190d = obj;
                }
            }
        }
        return (C27956i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27959a.f77191a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "BizRecommendExpt");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27956i.class.getName();
    }
}
