package hk1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hk1.h */
public enum C32934h implements C38174i<C59938g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89515d;

    /* renamed from: hk1.h$a */
    public static final class C32935a {

        /* renamed from: a */
        public static final List<Object> f89516a = null;

        static {
            f89516a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89515d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89515d;
                if (obj == obj2) {
                    obj = new C59938g();
                    this.f89515d = obj;
                }
            }
        }
        return (C59938g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32935a.f89516a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "2");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C59938g.class.getName();
    }
}
