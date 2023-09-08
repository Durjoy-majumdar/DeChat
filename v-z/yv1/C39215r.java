package yv1;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yv1.r */
public enum C39215r implements C38174i<C23376q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105506d;

    /* renamed from: yv1.r$a */
    public static final class C39216a {

        /* renamed from: a */
        public static final List<Object> f105507a = null;

        static {
            f105507a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105506d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105506d;
                if (obj == obj2) {
                    obj = new C23376q();
                    this.f105506d = obj;
                }
            }
        }
        return (C23376q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39216a.f105507a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, 48);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C23376q.class.getName();
    }
}
