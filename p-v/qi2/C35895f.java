package qi2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: qi2.f */
public enum C35895f implements C38174i<C35894e> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f95782d;

    /* renamed from: qi2.f$a */
    public static final class C35896a {

        /* renamed from: a */
        public static final List<Object> f95783a = null;

        static {
            f95783a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f95782d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f95782d;
                if (obj == obj2) {
                    obj = new C35894e();
                    this.f95782d = obj;
                }
            }
        }
        return (C35894e) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C35896a.f95783a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, JsApiOpenC2CTransferMsgViewEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35894e.class.getName();
    }
}
