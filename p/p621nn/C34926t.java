package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.t */
public enum C34926t implements C38174i<C34925s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93776d;

    /* renamed from: nn.t$a */
    public static final class C34927a {

        /* renamed from: a */
        public static final List<Object> f93777a = null;

        static {
            f93777a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93776d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93776d;
                if (obj == obj2) {
                    obj = new C34925s();
                    this.f93776d = obj;
                }
            }
        }
        return (C34925s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34927a.f93777a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BackupProcessMgrExitEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34925s.class.getName();
    }
}
