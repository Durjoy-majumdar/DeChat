package c61;

import com.tencent.p014mm.app.C80625v0;
import di0.C86294i;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: c61.c */
public enum C28501c implements C38174i<C79937b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f78318d;

    /* renamed from: c61.c$a */
    public static final class C28502a {

        /* renamed from: a */
        public static final List<Object> f78319a = null;

        static {
            f78319a = Arrays.asList(new Object[]{C86294i.class});
        }
    }

    /* renamed from: c61.c$b */
    public static final class C28503b {

        /* renamed from: a */
        public static final List<Object> f78320a = null;

        static {
            f78320a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f78318d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f78318d;
                if (obj == obj2) {
                    obj = new C79937b();
                    this.f78318d = obj;
                }
            }
        }
        return (C79937b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C28503b.f78320a;
        }
        if ("dependencies".equals(str)) {
            return C28502a.f78319a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.f84458d);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C79937b.class.getName();
    }
}
