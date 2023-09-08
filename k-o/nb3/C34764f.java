package nb3;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import p261wl.C38174i;

/* renamed from: nb3.f */
public enum C34764f implements C38174i<C47220e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93446d;

    /* renamed from: nb3.f$a */
    public static final class C34765a {

        /* renamed from: a */
        public static final List<Object> f93447a = null;

        static {
            f93447a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93446d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93446d;
                if (obj == obj2) {
                    obj = new C47220e();
                    this.f93446d = obj;
                }
            }
        }
        return (C47220e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34765a.f93447a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return false;
    }

    public boolean hasNoKeys() {
        return true;
    }

    public String toString() {
        return "provider " + C47220e.class.getName();
    }
}
