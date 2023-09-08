package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BackupStartMergeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.z */
public enum C34931z implements C38174i<C100139y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93780d;

    /* renamed from: nn.z$a */
    public static final class C34932a {

        /* renamed from: a */
        public static final List<Object> f93781a = null;

        static {
            f93781a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93780d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93780d;
                if (obj == obj2) {
                    obj = new C100139y();
                    this.f93780d = obj;
                }
            }
        }
        return (C100139y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34932a.f93781a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BackupStartMergeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C100139y.class.getName();
    }
}
