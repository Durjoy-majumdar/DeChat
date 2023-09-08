package p621nn;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.r */
public enum C34923r implements C38174i<C34922q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93772d;

    /* renamed from: nn.r$a */
    public static final class C34924a {

        /* renamed from: a */
        public static final List<Object> f93773a = null;

        static {
            f93773a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93772d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93772d;
                if (obj == obj2) {
                    obj = new C34922q();
                    this.f93772d = obj;
                }
            }
        }
        return (C34922q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34924a.f93773a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "MMBakChatNotify");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34922q.class.getName();
    }
}
