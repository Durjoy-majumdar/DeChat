package g61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g61.c */
public enum C32321c implements C38174i<C32318b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85804d;

    /* renamed from: g61.c$a */
    public static final class C32322a {

        /* renamed from: a */
        public static final List<Object> f85805a = null;

        static {
            f85805a = Arrays.asList(new Object[]{C30211n0.class});
        }
    }

    /* renamed from: g61.c$b */
    public static final class C32323b {

        /* renamed from: a */
        public static final List<Object> f85806a = null;

        static {
            f85806a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1});
        }
    }

    public Object get() {
        Object obj = this.f85804d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85804d;
                if (obj == obj2) {
                    obj = new C32318b();
                    this.f85804d = obj;
                }
            }
        }
        return (C32318b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("dependencies".equals(str)) {
            return C32322a.f85805a;
        }
        if ("onProcess".equals(str)) {
            return C32323b.f85806a;
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
        return "provider " + C32318b.class.getName();
    }
}
