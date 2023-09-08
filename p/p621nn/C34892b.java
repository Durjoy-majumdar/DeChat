package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BannerOnInitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.b */
public enum C34892b implements C38174i<C76941a> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93710d;

    /* renamed from: nn.b$a */
    public static final class C34893a {

        /* renamed from: a */
        public static final List<Object> f93711a = null;

        static {
            f93711a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93710d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93710d;
                if (obj == obj2) {
                    obj = new C76941a();
                    this.f93710d = obj;
                }
            }
        }
        return (C76941a) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34893a.f93711a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BannerOnInitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C76941a.class.getName();
    }
}
