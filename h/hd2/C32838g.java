package hd2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: hd2.g */
public enum C32838g implements C38174i<C32837f> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f89315d;

    /* renamed from: hd2.g$a */
    public static final class C32839a {

        /* renamed from: a */
        public static final List<Object> f89316a = null;

        static {
            f89316a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f89315d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f89315d;
                if (obj == obj2) {
                    obj = new C32837f();
                    this.f89315d = obj;
                }
            }
        }
        return (C32837f) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C32839a.f89316a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, KindaBindCardEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C32837f.class.getName();
    }
}
