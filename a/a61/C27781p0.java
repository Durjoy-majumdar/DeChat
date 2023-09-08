package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.GifErrorCodeEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.p0 */
public enum C27781p0 implements C38174i<C27780o0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76850d;

    /* renamed from: a61.p0$a */
    public static final class C27782a {

        /* renamed from: a */
        public static final List<Object> f76851a = null;

        static {
            f76851a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76850d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76850d;
                if (obj == obj2) {
                    obj = new C27780o0();
                    this.f76850d = obj;
                }
            }
        }
        return (C27780o0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27782a.f76851a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, GifErrorCodeEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27780o0.class.getName();
    }
}
