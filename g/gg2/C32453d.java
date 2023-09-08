package gg2;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: gg2.d */
public enum C32453d implements C38174i<C32449b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86237d;

    /* renamed from: gg2.d$a */
    public static final class C32454a {

        /* renamed from: a */
        public static final List<Object> f86238a = null;

        static {
            f86238a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86237d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86237d;
                if (obj == obj2) {
                    obj = new C32449b();
                    this.f86237d = obj;
                }
            }
        }
        return (C32449b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
        }
        if ("onProcess".equals(str)) {
            return C32454a.f86238a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ASYNC);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32449b.class.getName();
    }
}
