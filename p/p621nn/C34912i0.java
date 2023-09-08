package p621nn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MsgSynchronizeStartEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: nn.i0 */
public enum C34912i0 implements C38174i<C34910h0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f93751d;

    /* renamed from: nn.i0$a */
    public static final class C34913a {

        /* renamed from: a */
        public static final List<Object> f93752a = null;

        static {
            f93752a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f93751d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f93751d;
                if (obj == obj2) {
                    obj = new C34910h0();
                    this.f93751d = obj;
                }
            }
        }
        return (C34910h0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C34913a.f93752a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MsgSynchronizeStartEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C34910h0.class.getName();
    }
}
