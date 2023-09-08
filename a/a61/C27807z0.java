package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.UploadEmojiMsgEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.z0 */
public enum C27807z0 implements C38174i<C67007y0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76894d;

    /* renamed from: a61.z0$a */
    public static final class C27808a {

        /* renamed from: a */
        public static final List<Object> f76895a = null;

        static {
            f76895a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76894d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76894d;
                if (obj == obj2) {
                    obj = new C67007y0();
                    this.f76894d = obj;
                }
            }
        }
        return (C67007y0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27808a.f76895a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, UploadEmojiMsgEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C67007y0.class.getName();
    }
}
