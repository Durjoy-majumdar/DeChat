package c73;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c73.c */
public enum C28513c implements C38174i<C28512b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78341d;

    /* renamed from: c73.c$a */
    public static final class C28514a {

        /* renamed from: a */
        public static final List<Object> f78342a = null;

        static {
            f78342a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78341d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78341d;
                if (obj == obj2) {
                    obj = new C28512b();
                    this.f78341d = obj;
                }
            }
        }
        return (C28512b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C28514a.f78342a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 1);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C28512b.class.getName();
    }
}
