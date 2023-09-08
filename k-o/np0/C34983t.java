package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.t */
public enum C34983t implements C38174i<C11246s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93903d;

    /* renamed from: np0.t$a */
    public static final class C34984a {

        /* renamed from: a */
        public static final List<Object> f93904a = null;

        static {
            f93904a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93903d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93903d;
                if (obj == obj2) {
                    obj = new C11246s();
                    this.f93903d = obj;
                }
            }
        }
        return (C11246s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34984a.f93904a;
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
        return "provider " + C11246s.class.getName();
    }
}
