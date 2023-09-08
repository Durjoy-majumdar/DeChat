package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ResendAllFailNormalMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.t */
public enum C31155t implements C38174i<C31154s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83519d;

    /* renamed from: dd2.t$a */
    public static final class C31156a {

        /* renamed from: a */
        public static final List<Object> f83520a = null;

        static {
            f83520a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83519d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83519d;
                if (obj == obj2) {
                    obj = new C31154s();
                    this.f83519d = obj;
                }
            }
        }
        return (C31154s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31156a.f83520a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ResendAllFailNormalMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31154s.class.getName();
    }
}
