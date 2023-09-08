package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a70.C112760b;
import android.os.Build;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2conference;
import p156gj.C107842p;
import p156gj.C87201q;
import p156gj.C87203t;
import pe3.C89349b;
import qe3.C89625d;
import te3.C110967kz;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.s */
public class C105172s {

    /* renamed from: a */
    public static final String[] f312295a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b */
    public static boolean f312296b = false;

    /* renamed from: c */
    public static v2conference f312297c = new v2conference();

    /* renamed from: a */
    public static C110967kz m141220a(String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        C110967kz kzVar = new C110967kz();
        kzVar.f332145Q = str;
        kzVar.f332146R = str2;
        kzVar.f332153g = str3;
        kzVar.f332155i = C112760b.m154216X() + "/openvoice";
        kzVar.f332156j = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_UseDebugSvr_Int, 0);
        kzVar.f332159p = 1;
        kzVar.f332160q = Log.getImpl() != null ? Log.getImpl().getLogLevel(0) : 0;
        kzVar.f332162s = i;
        kzVar.f332148T = i2;
        kzVar.f332149U = i3;
        kzVar.f332165v = 4259845;
        kzVar.f332163t = 133;
        kzVar.f332130A = C87201q.m108260d();
        kzVar.f332131B = Util.getInt(C107842p.m146109b(), 0);
        kzVar.f332132C = C107842p.m146108a();
        kzVar.f332133D = Build.MANUFACTURER;
        kzVar.f332134E = C87203t.m108275k();
        String str4 = Build.VERSION.RELEASE;
        kzVar.f332135F = str4;
        kzVar.f332136G = Build.VERSION.INCREMENTAL;
        kzVar.f332137H = Build.DISPLAY;
        String f = C87203t.m108270f(false);
        if (f == null || f.isEmpty()) {
            Log.m105920e("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "getDeviceId failed");
        } else {
            kzVar.f332138I = C89349b.m111674a(MD5Util.getMD5String(f).getBytes());
        }
        kzVar.f332139J = str4;
        kzVar.f332142M = String.format("0x%x", new Object[]{Integer.valueOf(C89625d.f257841g)});
        if (z) {
            kzVar.f332141L = 0;
        } else {
            kzVar.f332141L = 65536;
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + kzVar.f332141L);
        }
        return kzVar;
    }

    /* renamed from: b */
    public static int m141221b(int i, byte[] bArr, int i2) {
        return f312297c.SetAppCmd(i, bArr, i2);
    }
}
