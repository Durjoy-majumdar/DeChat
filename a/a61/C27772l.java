package a61;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.EmojiFileCleanTaskEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: a61.l */
public enum C27772l implements C38174i<C27770k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f76832d;

    /* renamed from: a61.l$a */
    public static final class C27773a {

        /* renamed from: a */
        public static final List<Object> f76833a = null;

        static {
            f76833a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f76832d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f76832d;
                if (obj == obj2) {
                    obj = new C27770k();
                    this.f76832d = obj;
                }
            }
        }
        return (C27770k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C27773a.f76833a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, EmojiFileCleanTaskEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C27770k.class.getName();
    }
}
