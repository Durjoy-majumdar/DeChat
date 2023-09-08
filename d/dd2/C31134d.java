package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.DismissAllSendFailNotificationEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.d */
public enum C31134d implements C38174i<C31132c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83473d;

    /* renamed from: dd2.d$a */
    public static final class C31135a {

        /* renamed from: a */
        public static final List<Object> f83474a = null;

        static {
            f83474a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83473d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83473d;
                if (obj == obj2) {
                    obj = new C31132c();
                    this.f83473d = obj;
                }
            }
        }
        return (C31132c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31135a.f83474a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, DismissAllSendFailNotificationEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31132c.class.getName();
    }
}
