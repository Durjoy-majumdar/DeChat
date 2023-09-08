package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.n */
public enum C34917n implements C38174i<C100137m> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93764d;

    /* renamed from: nn.n$a */
    public static final class C34918a {

        /* renamed from: a */
        public static final List<Object> f93765a = null;

        static {
            f93765a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93764d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93764d;
                if (obj == obj2) {
                    obj = new C100137m();
                    this.f93764d = obj;
                }
            }
        }
        return (C100137m) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34918a.f93765a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BackupCoreResetEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C100137m.class.getName();
    }
}
