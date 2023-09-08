package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.r */
public enum C32117r implements C38174i<C32115q> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85404d;

    /* renamed from: fm.r$a */
    public static final class C32118a {

        /* renamed from: a */
        public static final List<Object> f85405a = null;

        static {
            f85405a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85404d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85404d;
                if (obj == obj2) {
                    obj = new C32115q();
                    this.f85404d = obj;
                }
            }
        }
        return (C32115q) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32118a.f85405a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WeChatTabRedDotEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32115q.class.getName();
    }
}
