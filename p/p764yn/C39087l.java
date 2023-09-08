package p764yn;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.CheckHotPatchAlertEvent;
import com.tencent.p014mm.autogen.events.CheckTinkerUpdateEvent;
import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: yn.l */
public enum C39087l implements C38174i<C39086k> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f105218d;

    /* renamed from: yn.l$a */
    public static final class C39088a {

        /* renamed from: a */
        public static final List<Object> f105219a = null;

        static {
            f105219a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f105218d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f105218d;
                if (obj == obj2) {
                    obj = new C39086k();
                    this.f105218d = obj;
                }
            }
        }
        return (C39086k) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C39088a.f105219a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, CheckHotPatchAlertEvent.class) || Objects.equals(obj, DynamicConfigUpdatedEvent.class) || Objects.equals(obj, CheckTinkerUpdateEvent.class);
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C39086k.class.getName();
    }
}
