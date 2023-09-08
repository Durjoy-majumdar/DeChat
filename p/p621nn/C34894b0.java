package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.BackupUSBStopActionEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.b0 */
public enum C34894b0 implements C38174i<C34891a0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93714d;

    /* renamed from: nn.b0$a */
    public static final class C34895a {

        /* renamed from: a */
        public static final List<Object> f93715a = null;

        static {
            f93715a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93714d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93714d;
                if (obj == obj2) {
                    obj = new C34891a0();
                    this.f93714d = obj;
                }
            }
        }
        return (C34891a0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34895a.f93715a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, BackupUSBStopActionEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34891a0.class.getName();
    }
}
