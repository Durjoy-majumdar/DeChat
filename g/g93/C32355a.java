package g93;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import kj2.C117407d;

/* renamed from: g93.a */
public class C32355a {

    /* renamed from: a */
    public static final String f85865a = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/__tmpl__/");

    /* renamed from: a */
    public static void m39689a(int i) {
        m39690b(908, i, 1, true);
    }

    /* renamed from: b */
    public static void m39690b(int i, int i2, int i3, boolean z) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        Log.m105925i("ConstantsPreload", "id:%d, key:%d, valye:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i4 > 0) {
            C117407d.INSTANCE.idkeyStat((long) i4, (long) i5, (long) i6, false);
        }
        if (!(!z || i4 == 908 || i4 == 0)) {
            C117407d.INSTANCE.idkeyStat(908, (long) i5, (long) i6, false);
        }
        C117407d.INSTANCE.mo160131h(15792, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: c */
    public static void m39691c(int i) {
        m39692d(i, 1);
    }

    /* renamed from: d */
    public static void m39692d(int i, long j) {
        C117407d.INSTANCE.mo182089r(1009, (long) i, j);
    }
}
