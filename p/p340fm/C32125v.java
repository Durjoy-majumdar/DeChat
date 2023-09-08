package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WeChatFrontBackEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.v */
public enum C32125v implements C38174i<C32124u> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85418d;

    /* renamed from: fm.v$a */
    public static final class C32126a {

        /* renamed from: a */
        public static final List<Object> f85419a = null;

        static {
            f85419a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85418d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85418d;
                if (obj == obj2) {
                    obj = new C32124u();
                    this.f85418d = obj;
                }
            }
        }
        return (C32124u) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32126a.f85419a;
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
        return "provider " + C32124u.class.getName();
    }
}
