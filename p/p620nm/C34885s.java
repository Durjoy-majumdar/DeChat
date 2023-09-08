package p620nm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.plugin.zero.LoadProtocolJNIService;
import ei3.C31607a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nm.s */
public enum C34885s implements C38174i<C89013r> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93700d;

    /* renamed from: nm.s$a */
    public static final class C34886a {

        /* renamed from: a */
        public static final List<Object> f93701a = null;

        static {
            f93701a = Arrays.asList(new Object[]{C85597u.class, LoadProtocolJNIService.class});
        }
    }

    /* renamed from: nm.s$b */
    public static final class C34887b {

        /* renamed from: a */
        public static final List<Object> f93702a = null;

        static {
            f93702a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93700d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93700d;
                if (obj == obj2) {
                    obj = new C89013r();
                    this.f93700d = obj;
                }
            }
        }
        return (C89013r) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34887b.f93702a;
        }
        if ("dependencies".equals(str)) {
            return C34886a.f93701a;
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
        return "provider " + C89013r.class.getName();
    }
}
