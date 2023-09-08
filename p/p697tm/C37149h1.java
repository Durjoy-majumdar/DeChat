package p697tm;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.h1 */
public enum C37149h1 implements C38174i<C90520g1> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98373d;

    /* renamed from: tm.h1$a */
    public static final class C37150a {

        /* renamed from: a */
        public static final List<Object> f98374a = null;

        static {
            f98374a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98373d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98373d;
                if (obj == obj2) {
                    obj = new C90520g1();
                    this.f98373d = obj;
                }
            }
        }
        return (C90520g1) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37150a.f98374a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 20) || Objects.equals(obj, 1) || Objects.equals(obj, 17) || Objects.equals(obj, 19);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C90520g1.class.getName();
    }
}
