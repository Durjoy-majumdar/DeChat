package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import a70.C112760b;
import android.net.ConnectivityManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import bp3.C104160f;
import bp3.C79758p;
import c92.C104331h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2conference;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;
import java.io.IOException;
import java.lang.reflect.Method;
import l33.C109247e;
import p156gj.C107842p;
import p156gj.C87201q;
import p156gj.C87203t;
import pe3.C89349b;
import q62.C101048b;
import qe3.C89625d;
import te3.C110967kz;
import te3.nd4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.w */
public class C105714w {

    /* renamed from: a */
    public static final String[] f314300a = {"ilink2", "voipComm", "voipChannel", "voipCodec", "confService"};

    /* renamed from: b */
    public static boolean f314301b = false;

    /* renamed from: c */
    public static v2conference f314302c = new v2conference();

    /* renamed from: a */
    public static String m141916a() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            z = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "mobile network not connectedorconnecting");
            return "";
        }
        String simOperator = ((TelephonyManager) MMApplicationContext.getContext().getSystemService("phone")).getSimOperator();
        if (simOperator == null || simOperator.length() < 3) {
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "nic_op NULL");
            return "";
        }
        return simOperator.substring(0, 3) + XVFSFile.PATH_SEPARATOR + simOperator.substring(3, simOperator.length());
    }

    /* renamed from: b */
    public static C110967kz m141917b(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        C110967kz kzVar = new C110967kz();
        kzVar.f332145Q = "wechat";
        kzVar.f332154h = str3;
        kzVar.f332143N = str4;
        kzVar.f332155i = C112760b.m154216X() + "/ilink";
        kzVar.f332147S = 1;
        kzVar.f332156j = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_VOIP_UseDebugSvr_Int, 0);
        kzVar.f332159p = 1;
        kzVar.f332160q = Log.getImpl() != null ? Log.getImpl().getLogLevel(0) : 0;
        kzVar.f332162s = i;
        kzVar.f332163t = i2;
        kzVar.f332164u = i3;
        kzVar.f332130A = C87201q.m108260d();
        kzVar.f332131B = Util.getInt(C107842p.m146109b(), 0);
        kzVar.f332132C = C107842p.m146108a();
        kzVar.f332133D = Build.MANUFACTURER;
        kzVar.f332134E = C87203t.m108275k();
        String str5 = Build.VERSION.RELEASE;
        kzVar.f332135F = str5;
        kzVar.f332136G = Build.VERSION.INCREMENTAL;
        kzVar.f332137H = Build.DISPLAY;
        kzVar.f332140K = m141916a();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ilink_codeclist_param, 2);
        Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "iCodecListParam: " + Qe);
        kzVar.f332165v = 1;
        if (Qe == 1) {
            kzVar.f332165v = 5;
        } else if (Qe == 0) {
            kzVar.f332165v = 21;
        }
        if (C104331h.m139314g()) {
            kzVar.f332165v = kzVar.f332165v | 65536 | 4194304;
        }
        int Os = ((C101048b) C86312j.m106911c(C101048b.class)).mo60590Os(2);
        if (Os == 3) {
            Os = 1;
        }
        if (C109247e.zx0()) {
            kzVar.f332141L = Os;
        } else {
            kzVar.f332141L = Os + 65536;
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "isVoipDoubleLinkSettingOpen false, setsimtype " + kzVar.f332141L);
        }
        String f = C87203t.m108270f(false);
        if (f == null || f.isEmpty()) {
            Log.m105920e("MicroMsg.Multitalk.ILinkNativeEngine", "getDeviceId failed");
        } else {
            kzVar.f332138I = C89349b.m111674a(MD5Util.getMD5String(f).getBytes());
        }
        kzVar.f332139J = str5;
        kzVar.f332142M = String.format("0x%x", new Object[]{Integer.valueOf(C89625d.f257841g)});
        return kzVar;
    }

    /* renamed from: c */
    public static int m141918c(int i, byte[] bArr, int i2) {
        return f314302c.SetAppCmd(i, bArr, i2);
    }

    /* renamed from: d */
    public static int m141919d(nd4 nd4) {
        int i = -1;
        if (nd4 == null) {
            Log.m105920e("MicroMsg.Multitalk.ILinkNativeEngine", "steve: videoResParam is null");
            return -1;
        }
        try {
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", "videoResParam:" + nd4 + ",length:" + nd4.toByteArray().length);
            i = f314302c.SubscribeVideo(nd4.toByteArray(), nd4.toByteArray().length);
            StringBuilder sb = new StringBuilder();
            sb.append("steve: subScribeVideoAndResList ret:");
            sb.append(i);
            Log.m105924i("MicroMsg.Multitalk.ILinkNativeEngine", sb.toString());
            return i;
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e, "SetVideoResolution exception", new Object[0]);
            return i;
        }
    }
}
