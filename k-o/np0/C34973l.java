package np0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: np0.l */
public enum C34973l implements C38174i<C34972k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93884d;

    /* renamed from: np0.l$a */
    public static final class C34974a {

        /* renamed from: a */
        public static final List<Object> f93885a = null;

        static {
            f93885a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93884d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93884d;
                if (obj == obj2) {
                    obj = C34972k.INSTANCE;
                    this.f93884d = obj;
                }
            }
        }
        return (C34972k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return C34972k.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34974a.f93885a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "weapp_pushmsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34972k.class.getName();
    }
}
