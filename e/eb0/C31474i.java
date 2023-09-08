package eb0;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: eb0.i */
public enum C31474i implements C38174i<C75579g> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f84198d;

    /* renamed from: eb0.i$a */
    public static final class C31475a {

        /* renamed from: a */
        public static final List<Object> f84199a = null;

        static {
            f84199a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f84198d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f84198d;
                if (obj == obj2) {
                    obj = new C75579g();
                    this.f84198d = obj;
                }
            }
        }
        return (C75579g) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("accountAware".equals(str)) {
            return Boolean.TRUE;
        }
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("onProcess".equals(str)) {
            return C31475a.f84199a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "addcontact") || Objects.equals(obj, "dynacfg") || Objects.equals(obj, "dynacfg_split") || Objects.equals(obj, "banner") || Objects.equals(obj, "midinfo") || Objects.equals(obj, "revokemsg") || Objects.equals(obj, "clouddelmsg") || Objects.equals(obj, "updatepackage") || Objects.equals(obj, "deletepackage") || Objects.equals(obj, "delchatroommember") || Objects.equals(obj, "WakenPush") || Objects.equals(obj, "DisasterNotice") || Objects.equals(obj, "EmotionKv") || Objects.equals(obj, "globalalert") || Objects.equals(obj, "yybsigcheck") || Objects.equals(obj, "qy_status_notify") || Objects.equals(obj, "qy_chat_update") || Objects.equals(obj, "qy_revoke_msg") || Objects.equals(obj, "bindmobiletip") || Objects.equals(obj, "BindPhoneGuidance") || Objects.equals(obj, "ClientCheckConsistency") || Objects.equals(obj, "ClientCheckHook") || Objects.equals(obj, "ClientCheckGetAppList") || Objects.equals(obj, "ClientCheckGetExtInfo") || Objects.equals(obj, "ClientCheckSensorCollect") || Objects.equals(obj, "functionmsg") || Objects.equals(obj, "paymsg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C75579g.class.getName();
    }
}
