package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.a0 */
public enum C34959a0 implements C38174i<C11247z> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93848d;

    /* renamed from: np0.a0$a */
    public static final class C34960a {

        /* renamed from: a */
        public static final List<Object> f93849a = null;

        static {
            f93849a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93848d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93848d;
                if (obj == obj2) {
                    obj = C11247z.INSTANCE;
                    this.f93848d = obj;
                }
            }
        }
        return (C11247z) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C11247z.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34960a.f93849a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "UpdateWxaUserSwitchNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C11247z.class.getName();
    }
}
