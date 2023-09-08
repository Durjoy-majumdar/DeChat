package g00;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: g00.t */
public enum C32281t implements C38174i<C32280s> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f85744d;

    /* renamed from: g00.t$a */
    public static final class C32282a {

        /* renamed from: a */
        public static final List<Object> f85745a = null;

        static {
            f85745a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f85744d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f85744d;
                if (obj == obj2) {
                    obj = new C32280s();
                    this.f85744d = obj;
                }
            }
        }
        return (C32280s) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32282a.f85745a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, WxaPkgDownloadCompleteNotifyEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32280s.class.getName();
    }
}
