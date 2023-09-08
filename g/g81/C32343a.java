package g81;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;

/* renamed from: g81.a */
public class C32343a {

    /* renamed from: b */
    public static C32343a f85838b;

    /* renamed from: a */
    public long f85839a = 0;

    public C32343a() {
        if (C86709a0.m107522a()) {
            this.f85839a = C86709a0.m107535s().mo121142i().mo119673G(C72994y1.C72995a.USERINFO_GET_EXPTID_BEGIN_TIME_LONG, Util.nowMilliSecond());
        } else {
            this.f85839a = Util.nowMilliSecond();
        }
    }

    /* renamed from: a */
    public static C32343a m39684a() {
        if (f85838b == null) {
            f85838b = new C32343a();
        }
        return f85838b;
    }
}
