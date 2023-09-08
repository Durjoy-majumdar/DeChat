package p439ao;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ao.l */
public enum C27962l implements C38174i<C27960k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f77196d;

    /* renamed from: ao.l$a */
    public static final class C27963a {

        /* renamed from: a */
        public static final List<Object> f77197a = null;

        static {
            f77197a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f77196d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f77196d;
                if (obj == obj2) {
                    obj = new C27960k();
                    this.f77196d = obj;
                }
            }
        }
        return (C27960k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27963a.f77197a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "BizRecommendNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27960k.class.getName();
    }
}
