package gk0;

import com.tencent.p014mm.sdk.platformtools.Log;
import lp3.C88631d;

/* renamed from: gk0.z0 */
public final class C8332z0<T> implements C88631d.C76721a {

    /* renamed from: a */
    public static final C8332z0<T> f27293a = new C8332z0<>();

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        if (obj instanceof Exception) {
            Log.m105920e("MicroMsg.ReportUserCheckPhonePrivacy", "CgiCheckVerifyCodeWxaPhone " + ((Exception) obj).getMessage());
        }
    }
}
