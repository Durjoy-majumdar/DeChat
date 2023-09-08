package p406zn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: zn.o */
public enum C39409o implements C38174i<C39406n> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105877d;

    /* renamed from: zn.o$a */
    public static final class C39410a {

        /* renamed from: a */
        public static final List<Object> f105878a = null;

        static {
            f105878a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: zn.o$b */
    public static final class C39411b {

        /* renamed from: a */
        public static final List<Object> f105879a = null;

        static {
            f105879a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f105877d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105877d;
                if (obj == obj2) {
                    obj = new C39406n();
                    this.f105877d = obj;
                }
            }
        }
        return (C39406n) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C39410a.f105878a;
        }
        if ("onProcess".equals(str)) {
            return C39411b.f105879a;
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
        return "provider " + C39406n.class.getName();
    }
}
