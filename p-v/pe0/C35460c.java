package pe0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: pe0.c */
public enum C35460c implements C38174i<C35459b> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f94885d;

    /* renamed from: pe0.c$a */
    public static final class C35461a {

        /* renamed from: a */
        public static final List<Object> f94886a = null;

        static {
            f94886a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f94885d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f94885d;
                if (obj == obj2) {
                    obj = new C35459b();
                    this.f94885d = obj;
                }
            }
        }
        return (C35459b) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C35461a.f94886a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "@im.chatroom");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C35459b.class.getName();
    }
}
