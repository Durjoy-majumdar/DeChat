package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.p */
public enum C32276p implements C38174i<C98063o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85735d;

    /* renamed from: g00.p$a */
    public static final class C32277a {

        /* renamed from: a */
        public static final List<Object> f85736a = null;

        static {
            f85736a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85735d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85735d;
                if (obj == obj2) {
                    obj = new C98063o();
                    this.f85735d = obj;
                }
            }
        }
        return (C98063o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32277a.f85736a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OnSearchSearchBoxCtrlInfoChangedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C98063o.class.getName();
    }
}
