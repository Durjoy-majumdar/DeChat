package tb3;

import com.tencent.p014mm.app.C80625v0;
import ei3.C31607a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tb3.c */
public enum C37003c implements C38174i<C77880b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98115d;

    /* renamed from: tb3.c$a */
    public static final class C37004a {

        /* renamed from: a */
        public static final List<Object> f98116a = null;

        static {
            f98116a = Arrays.asList(new Object[]{C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND});
        }
    }

    public Object get() {
        Object obj = this.f98115d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98115d;
                if (obj == obj2) {
                    obj = new C77880b();
                    this.f98115d = obj;
                }
            }
        }
        return (C77880b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C37004a.f98116a;
        }
        if ("dependencies".equals(str)) {
            return Collections.EMPTY_LIST;
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
        return "provider " + C77880b.class.getName();
    }
}
