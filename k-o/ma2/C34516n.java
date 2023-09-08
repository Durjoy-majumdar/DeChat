package ma2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ma2.C99808k;
import p261wl.C38174i;

/* renamed from: ma2.n */
public enum C34516n implements C38174i<C99808k.C99810c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f92877d;

    /* renamed from: ma2.n$a */
    public static final class C34517a {

        /* renamed from: a */
        public static final List<Object> f92878a = null;

        static {
            f92878a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f92877d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f92877d;
                if (obj == obj2) {
                    obj = new C99808k.C99810c();
                    this.f92877d = obj;
                }
            }
        }
        return (C99808k.C99810c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C34517a.f92878a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, MusicPlayerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C99808k.C99810c.class.getName();
    }
}
