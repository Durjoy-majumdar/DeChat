package ov2;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: ov2.c */
public enum C35319c implements C38174i<C35317b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94610d;

    /* renamed from: ov2.c$a */
    public static final class C35320a {

        /* renamed from: a */
        public static final List<Object> f94611a = null;

        static {
            f94611a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94610d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94610d;
                if (obj == obj2) {
                    obj = new C35317b();
                    this.f94610d = obj;
                }
            }
        }
        return (C35317b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35320a.f94611a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C35317b.class.getName();
    }
}
