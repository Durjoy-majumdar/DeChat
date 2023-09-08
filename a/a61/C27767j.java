package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.EmojiFileCheckerEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.j */
public enum C27767j implements C38174i<C39495i> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76822d;

    /* renamed from: a61.j$a */
    public static final class C27768a {

        /* renamed from: a */
        public static final List<Object> f76823a = null;

        static {
            f76823a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76822d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76822d;
                if (obj == obj2) {
                    obj = new C39495i();
                    this.f76822d = obj;
                }
            }
        }
        return (C39495i) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27768a.f76823a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EmojiFileCheckerEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39495i.class.getName();
    }
}
