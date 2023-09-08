package p620nm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nm.u */
public enum C34888u implements C38174i<C89017t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93705d;

    /* renamed from: nm.u$a */
    public static final class C34889a {

        /* renamed from: a */
        public static final List<Object> f93706a = null;

        static {
            f93706a = Arrays.asList(new Object[]{C85597u.class});
        }
    }

    /* renamed from: nm.u$b */
    public static final class C34890b {

        /* renamed from: a */
        public static final List<Object> f93707a = null;

        static {
            f93707a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93705d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93705d;
                if (obj == obj2) {
                    obj = new C89017t();
                    this.f93705d = obj;
                }
            }
        }
        return (C89017t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34890b.f93707a;
        }
        if ("dependencies".equals(str)) {
            return C34889a.f93706a;
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
        return "provider " + C89017t.class.getName();
    }
}
