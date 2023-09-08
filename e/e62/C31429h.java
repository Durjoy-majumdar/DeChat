package e62;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: e62.h */
public enum C31429h implements C38174i<C7602g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84127d;

    /* renamed from: e62.h$a */
    public static final class C31430a {

        /* renamed from: a */
        public static final List<Object> f84128a = null;

        static {
            f84128a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84127d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84127d;
                if (obj == obj2) {
                    obj = new C7602g();
                    this.f84127d = obj;
                }
            }
        }
        return (C7602g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31430a.f84128a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "PushLoginUrlAutoLoginSwitchUpdate");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C7602g.class.getName();
    }
}
