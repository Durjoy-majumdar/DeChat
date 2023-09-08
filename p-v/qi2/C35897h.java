package qi2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ReceiveTransferAppMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi2.h */
public enum C35897h implements C38174i<C77350g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95786d;

    /* renamed from: qi2.h$a */
    public static final class C35898a {

        /* renamed from: a */
        public static final List<Object> f95787a = null;

        static {
            f95787a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95786d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95786d;
                if (obj == obj2) {
                    obj = new C77350g();
                    this.f95786d = obj;
                }
            }
        }
        return (C77350g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35898a.f95787a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, ReceiveTransferAppMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C77350g.class.getName();
    }
}
