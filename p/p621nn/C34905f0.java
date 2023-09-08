package p621nn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.f0 */
public enum C34905f0 implements C38174i<C34902e0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93737d;

    /* renamed from: nn.f0$a */
    public static final class C34906a {

        /* renamed from: a */
        public static final List<Object> f93738a = null;

        static {
            f93738a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93737d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93737d;
                if (obj == obj2) {
                    obj = new C34902e0();
                    this.f93737d = obj;
                }
            }
        }
        return (C34902e0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34906a.f93738a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "ChatSync");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34902e0.class.getName();
    }
}
