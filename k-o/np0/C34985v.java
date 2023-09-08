package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.v */
public enum C34985v implements C38174i<C76951u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93907d;

    /* renamed from: np0.v$a */
    public static final class C34986a {

        /* renamed from: a */
        public static final List<Object> f93908a = null;

        static {
            f93908a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93907d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93907d;
                if (obj == obj2) {
                    obj = new C76951u();
                    this.f93907d = obj;
                }
            }
        }
        return (C76951u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34986a.f93908a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "link_view_wxapp");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76951u.class.getName();
    }
}
