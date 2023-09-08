package p742wr;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: wr.e */
public enum C38284e implements C38174i<C38283d> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f101070d;

    /* renamed from: wr.e$a */
    public static final class C38285a {

        /* renamed from: a */
        public static final List<Object> f101071a = null;

        static {
            f101071a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f101070d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f101070d;
                if (obj == obj2) {
                    obj = new C38283d();
                    this.f101070d = obj;
                }
            }
        }
        return (C38283d) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C38285a.f101071a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CoreAccountInitializationNotifiedEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C38283d.class.getName();
    }
}
