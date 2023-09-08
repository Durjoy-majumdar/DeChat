package h20;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: h20.f */
public enum C32671f implements C38174i<C32668e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f86692d;

    /* renamed from: h20.f$a */
    public static final class C32672a {

        /* renamed from: a */
        public static final List<Object> f86693a = null;

        static {
            f86693a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f86692d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f86692d;
                if (obj == obj2) {
                    obj = new C32668e();
                    this.f86692d = obj;
                }
            }
        }
        return (C32668e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32672a.f86693a;
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
        return "provider " + C32668e.class.getName();
    }
}
