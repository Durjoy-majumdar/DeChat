package dd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.SendMsgSuccessEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: dd2.z */
public enum C31163z implements C38174i<C31162y> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f83530d;

    /* renamed from: dd2.z$a */
    public static final class C31164a {

        /* renamed from: a */
        public static final List<Object> f83531a = null;

        static {
            f83531a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f83530d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f83530d;
                if (obj == obj2) {
                    obj = new C31162y();
                    this.f83530d = obj;
                }
            }
        }
        return (C31162y) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C31164a.f83531a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, SendMsgSuccessEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C31162y.class.getName();
    }
}
