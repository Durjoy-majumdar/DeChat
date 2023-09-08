package b24;

import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.g */
public class C113094g extends C113107m0 {
    public C113094g() {
        this.f338498e = TPReportParams.LIVE_STEP_PLAY;
    }

    /* renamed from: i */
    public byte[] mo165623i(int i, int i2, int i3, int i4) {
        byte[] bArr = new byte[6];
        C117790util.m166193o(bArr, 0, i);
        bArr[2] = (byte) (i2 >> 0);
        C117790util.m166193o(bArr, 3, i3);
        bArr[5] = (byte) (i4 >> 0);
        mo165627b(this.f338498e);
        mo165626a(bArr, 6);
        mo165632g();
        return mo165628c();
    }
}
