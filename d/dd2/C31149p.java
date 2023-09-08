package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.OmitAllFailNormalMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.p */
public enum C31149p implements C38174i<C31148o> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83511d;

    /* renamed from: dd2.p$a */
    public static final class C31150a {

        /* renamed from: a */
        public static final List<Object> f83512a = null;

        static {
            f83512a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83511d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83511d;
                if (obj == obj2) {
                    obj = new C31148o();
                    this.f83511d = obj;
                }
            }
        }
        return (C31148o) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31150a.f83512a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, OmitAllFailNormalMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31148o.class.getName();
    }
}
