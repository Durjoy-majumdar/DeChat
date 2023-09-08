package p340fm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: fm.f */
public enum C32088f implements C38174i<C32086e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85344d;

    /* renamed from: fm.f$a */
    public static final class C32089a {

        /* renamed from: a */
        public static final List<Object> f85345a = null;

        static {
            f85345a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85344d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85344d;
                if (obj == obj2) {
                    obj = new C32086e();
                    this.f85344d = obj;
                }
            }
        }
        return (C32086e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("onProcess".equals(str)) {
            return C32089a.f85345a;
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
        return "provider " + C32086e.class.getName();
    }
}
