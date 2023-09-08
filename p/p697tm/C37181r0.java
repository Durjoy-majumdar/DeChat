package p697tm;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.AppBrandResetAllServiceUnreadCountEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: tm.r0 */
public enum C37181r0 implements C38174i<C37179q0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f98439d;

    /* renamed from: tm.r0$a */
    public static final class C37182a {

        /* renamed from: a */
        public static final List<Object> f98440a = null;

        static {
            f98440a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f98439d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f98439d;
                if (obj == obj2) {
                    obj = new C37179q0();
                    this.f98439d = obj;
                }
            }
        }
        return (C37179q0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37182a.f98440a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, AppBrandResetAllServiceUnreadCountEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37179q0.class.getName();
    }
}
