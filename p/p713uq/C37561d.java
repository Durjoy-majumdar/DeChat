package p713uq;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.UpdateChatRoomSpamStatusEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: uq.d */
public enum C37561d implements C38174i<C37560c> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f99623d;

    /* renamed from: uq.d$a */
    public static final class C37562a {

        /* renamed from: a */
        public static final List<Object> f99624a = null;

        static {
            f99624a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f99623d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f99623d;
                if (obj == obj2) {
                    obj = new C37560c();
                    this.f99623d = obj;
                }
            }
        }
        return (C37560c) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C37562a.f99624a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, UpdateChatRoomSpamStatusEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C37560c.class.getName();
    }
}
