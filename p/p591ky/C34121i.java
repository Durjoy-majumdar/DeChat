package p591ky;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ky.i */
public enum C34121i implements C38174i<C34120h> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92056d;

    /* renamed from: ky.i$a */
    public static final class C34122a {

        /* renamed from: a */
        public static final List<Object> f92057a = null;

        static {
            f92057a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: ky.i$b */
    public static final class C34123b {

        /* renamed from: a */
        public static final List<Object> f92058a = null;

        static {
            f92058a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92056d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92056d;
                if (obj == obj2) {
                    obj = new C34120h();
                    this.f92056d = obj;
                }
            }
        }
        return (C34120h) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C34122a.f92057a;
        }
        if ("onProcess".equals(str)) {
            return C34123b.f92058a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, C31607a.ON_SPLASH);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34120h.class.getName();
    }
}
