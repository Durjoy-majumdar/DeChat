package p630nz;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nz.d */
public enum C35057d implements C38174i<C89105c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94069d;

    /* renamed from: nz.d$a */
    public static final class C35058a {

        /* renamed from: a */
        public static final List<Object> f94070a = null;

        static {
            f94070a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94069d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94069d;
                if (obj == obj2) {
                    obj = new C89105c();
                    this.f94069d = obj;
                }
            }
        }
        return (C89105c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35058a.f94070a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 3899);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C89105c.class.getName();
    }
}
