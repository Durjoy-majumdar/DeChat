package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.d0 */
public enum C32084d0 implements C38174i<C32081c0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85337d;

    /* renamed from: fm.d0$a */
    public static final class C32085a {

        /* renamed from: a */
        public static final List<Object> f85338a = null;

        static {
            f85338a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85337d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85337d;
                if (obj == obj2) {
                    obj = new C32081c0();
                    this.f85337d = obj;
                }
            }
        }
        return (C32081c0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32085a.f85338a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WeChatFrontBackEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32081c0.class.getName();
    }
}
