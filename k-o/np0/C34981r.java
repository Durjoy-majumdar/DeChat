package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.r */
public enum C34981r implements C38174i<C34980q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93899d;

    /* renamed from: np0.r$a */
    public static final class C34982a {

        /* renamed from: a */
        public static final List<Object> f93900a = null;

        static {
            f93900a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93899d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93899d;
                if (obj == obj2) {
                    obj = C34980q.INSTANCE;
                    this.f93899d = obj;
                }
            }
        }
        return (C34980q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C34980q.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34982a.f93900a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "subscribesysmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34980q.class.getName();
    }
}
