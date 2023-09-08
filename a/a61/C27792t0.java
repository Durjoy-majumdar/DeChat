package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.RePullEmojiInfoDescEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.t0 */
public enum C27792t0 implements C38174i<C27790s0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76866d;

    /* renamed from: a61.t0$a */
    public static final class C27793a {

        /* renamed from: a */
        public static final List<Object> f76867a = null;

        static {
            f76867a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76866d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76866d;
                if (obj == obj2) {
                    obj = new C27790s0();
                    this.f76866d = obj;
                }
            }
        }
        return (C27790s0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27793a.f76867a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, RePullEmojiInfoDescEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27790s0.class.getName();
    }
}
