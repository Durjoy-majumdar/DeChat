package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.EmojiConfigEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.h */
public enum C27763h implements C38174i<C91962g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76812d;

    /* renamed from: a61.h$a */
    public static final class C27764a {

        /* renamed from: a */
        public static final List<Object> f76813a = null;

        static {
            f76813a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76812d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76812d;
                if (obj == obj2) {
                    obj = new C91962g();
                    this.f76812d = obj;
                }
            }
        }
        return (C91962g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27764a.f76813a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EmojiConfigEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C91962g.class.getName();
    }
}
