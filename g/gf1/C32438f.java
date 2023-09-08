package gf1;

import com.tencent.p014mm.app.C80625v0;
import gf1.C32436e;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gf1.f */
public enum C32438f implements C38174i<C32434d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86018d;

    /* renamed from: gf1.f$a */
    public static final class C32439a {

        /* renamed from: a */
        public static final List<Object> f86019a = null;

        static {
            f86019a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86018d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86018d;
                if (obj == obj2) {
                    C32436e.f86015a.getClass();
                    obj = C32434d.f86010d;
                    this.f86018d = obj;
                }
            }
        }
        return (C32434d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C32436e.C32437a.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32439a.f86019a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 70001L);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32434d.class.getName();
    }
}
