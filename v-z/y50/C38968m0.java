package y50;

import com.tencent.p014mm.app.C80625v0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p261wl.C38174i;

/* renamed from: y50.m0 */
public enum C38968m0 implements C38174i<C66523l0> {
    INSTANCE;
    

    /* renamed from: d */
    public volatile Object f104988d;

    /* renamed from: y50.m0$a */
    public static final class C38969a {

        /* renamed from: a */
        public static final List<Object> f104989a = null;

        static {
            f104989a = Arrays.asList(new Object[]{C80625v0.MATCH_MM});
        }
    }

    public Object get() {
        Object obj = this.f104988d;
        Object obj2 = C38174i.f100844M0;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f104988d;
                if (obj == obj2) {
                    obj = new C66523l0();
                    this.f104988d = obj;
                }
            }
        }
        return (C66523l0) obj;
    }

    public Object getQualifierAttribute(String str) {
        if ("creator".equals(str)) {
            return Void.class;
        }
        if ("accountAware".equals(str)) {
            return Boolean.FALSE;
        }
        if ("onProcess".equals(str)) {
            return C38969a.f104989a;
        }
        return null;
    }

    public boolean hasKey(Object obj) {
        return Objects.equals(obj, "ApplyLiveMic") || Objects.equals(obj, "AcceptLiveMic") || Objects.equals(obj, "CloseLive") || Objects.equals(obj, "CloseLiveMic") || Objects.equals(obj, "CloseApplyLiveMic") || Objects.equals(obj, "BanLiveComment") || Objects.equals(obj, "LiveMicSucc") || Objects.equals(obj, "OnlineLiveList") || Objects.equals(obj, "mmfinderlive_apply_live_mic_sys_msg") || Objects.equals(obj, "mmfinderlive_accept_live_mic_sys_msg") || Objects.equals(obj, "mmfinderlive_close_live_mic_sys_msg");
    }

    public boolean hasNoKeys() {
        return false;
    }

    public String toString() {
        return "provider " + C66523l0.class.getName();
    }
}
