package p178ju;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: ju.k */
public enum C33677k implements C38174i<C33676j> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f91118d;

    /* renamed from: ju.k$a */
    public static final class C33678a {

        /* renamed from: a */
        public static final List<Object> f91119a = null;

        static {
            f91119a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f91118d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f91118d;
                if (obj == obj2) {
                    obj = new C33676j();
                    this.f91118d = obj;
                }
            }
        }
        return (C33676j) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C33678a.f91119a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "comment_link_profile");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C33676j.class.getName();
    }
}
