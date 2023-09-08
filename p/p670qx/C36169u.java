package p670qx;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qx.u */
public enum C36169u implements C38174i<C36168t> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f96358d;

    /* renamed from: qx.u$a */
    public static final class C36170a {

        /* renamed from: a */
        public static final List<Object> f96359a = null;

        static {
            f96359a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f96358d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f96358d;
                if (obj == obj2) {
                    obj = new C36168t();
                    this.f96358d = obj;
                }
            }
        }
        return (C36168t) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C36170a.f96359a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, PostSyncTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C36168t.class.getName();
    }
}
