package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BackupGetA8keyRedirectEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.p */
public enum C34920p implements C38174i<C34919o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93768d;

    /* renamed from: nn.p$a */
    public static final class C34921a {

        /* renamed from: a */
        public static final List<Object> f93769a = null;

        static {
            f93769a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93768d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93768d;
                if (obj == obj2) {
                    obj = new C34919o();
                    this.f93768d = obj;
                }
            }
        }
        return (C34919o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34921a.f93769a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BackupGetA8keyRedirectEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34919o.class.getName();
    }
}
