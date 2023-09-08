package lo2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import nj3.C76912y0;
import oa1.C117731d;
import p244tt.C14088e;
import zt3.C119157j;

/* renamed from: lo2.t0 */
public class C46881t0 {

    /* renamed from: lo2.t0$a */
    public class C46882a implements C14088e.C14090b {

        /* renamed from: a */
        public final /* synthetic */ long f126081a;

        public C46882a(long j) {
            this.f126081a = j;
        }

        /* renamed from: a */
        public void mo1717a() {
            SnsMethodCalculate.markStartTimeMs("success", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$2");
            Log.m105924i("LiteAppPreviewHelper", "startLiteApp success, costTime is " + (System.currentTimeMillis() - this.f126081a));
            SnsMethodCalculate.markEndTimeMs("success", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$2");
        }

        /* renamed from: b */
        public void mo1718b() {
            SnsMethodCalculate.markStartTimeMs("fail", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$2");
            Log.m105924i("LiteAppPreviewHelper", "startLiteApp fail, costTime is " + (System.currentTimeMillis() - this.f126081a));
            SnsMethodCalculate.markEndTimeMs("fail", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper$2");
        }
    }

    /* renamed from: a */
    public static void m52210a() {
        SnsMethodCalculate.markStartTimeMs("checkFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        SnsMethodCalculate.markStartTimeMs("checkLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        ((C119157j) C119157j.f356862d).mo183875f(new C34320s0("wxaliteb984a6d0a709290f7f2cd6cab0db8fbe"));
        SnsMethodCalculate.markEndTimeMs("checkLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        SnsMethodCalculate.markEndTimeMs("checkFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
    }

    /* renamed from: b */
    public static boolean m52211b() {
        SnsMethodCalculate.markStartTimeMs("isFinderRoomPreviewAbTest", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        SnsMethodCalculate.markStartTimeMs("isLiteAppCanOpen", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        boolean z = false;
        try {
            String format = String.format("clicfg_ad_liteapp_%s_open", new Object[]{"wxaliteb984a6d0a709290f7f2cd6cab0db8fbe"});
            Log.m105918d("LiteAppPreviewHelper", "expAppId is " + format);
            String f = C117731d.m166007c().mo182444f(format, "0", false, true);
            Log.m105918d("LiteAppPreviewHelper", "flagStr is " + f);
            z = f.equalsIgnoreCase("1");
            SnsMethodCalculate.markEndTimeMs("isLiteAppCanOpen", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        } catch (Throwable th) {
            Log.m105920e("LiteAppPreviewHelper", th.toString());
            SnsMethodCalculate.markEndTimeMs("isLiteAppCanOpen", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        }
        SnsMethodCalculate.markEndTimeMs("isFinderRoomPreviewAbTest", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        return z;
    }

    /* renamed from: c */
    public static void m52212c(Context context, String str) {
        SnsMethodCalculate.markStartTimeMs("jumpFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        try {
            if (!m52211b()) {
                m52214e(context);
                SnsMethodCalculate.markStartTimeMs("reportPreviewAbTestClose", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                C115669n.INSTANCE.mo175911u(1706, 10);
                SnsMethodCalculate.markEndTimeMs("reportPreviewAbTestClose", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                SnsMethodCalculate.markEndTimeMs("jumpFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                return;
            }
            if (((C14088e) C86312j.m106911c(C14088e.class)).mo13509NR("wxaliteb984a6d0a709290f7f2cd6cab0db8fbe") == null) {
                m52214e(context);
                m52210a();
                SnsMethodCalculate.markStartTimeMs("reportNoLiteAppPackage", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                C115669n.INSTANCE.mo175911u(1706, 12);
                SnsMethodCalculate.markEndTimeMs("reportNoLiteAppPackage", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            } else {
                m52213d(context, "wxaliteb984a6d0a709290f7f2cd6cab0db8fbe", str);
                SnsMethodCalculate.markStartTimeMs("reportFinderRoomCanPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
                C115669n.INSTANCE.mo175911u(1706, 13);
                SnsMethodCalculate.markEndTimeMs("reportFinderRoomCanPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            }
            SnsMethodCalculate.markEndTimeMs("jumpFinderRoomPreview", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        } catch (Throwable th) {
            Log.m105920e("LiteAppPreviewHelper", th.toString());
        }
    }

    /* renamed from: d */
    public static void m52213d(Context context, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("openLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        if (context == null) {
            Log.m105920e("LiteAppPreviewHelper", "context is null");
            SnsMethodCalculate.markEndTimeMs("openLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        } else if (Util.isNullOrNil(str)) {
            Log.m105920e("LiteAppPreviewHelper", "appId is null or nil");
            SnsMethodCalculate.markEndTimeMs("openLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        } else {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Bundle bundle = new Bundle();
                bundle.putString("appId", str);
                bundle.putString("path", "");
                bundle.putString(SearchIntents.EXTRA_QUERY, str2);
                bundle.putBoolean("transparent", true);
                bundle.putInt("nextAnimIn", C0966R.C0968anim.f2503er);
                bundle.putInt("currentAnimOut", C0966R.C0968anim.f2506eu);
                ((C14088e) C86312j.m106911c(C14088e.class)).mo13510OP(context, bundle, true, false, new C46882a(currentTimeMillis));
            } catch (Throwable th) {
                Log.m105920e("LiteAppPreviewHelper", th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("openLiteApp", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        }
    }

    /* renamed from: e */
    public static void m52214e(Context context) {
        SnsMethodCalculate.markStartTimeMs("showErrToast", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
        if (context == null) {
            SnsMethodCalculate.markEndTimeMs("showErrToast", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
            return;
        }
        C76912y0.m92767f(context, "直播间配置拉取失败");
        SnsMethodCalculate.markEndTimeMs("showErrToast", "com.tencent.mm.plugin.sns.ad.helper.LiteAppPreviewHelper");
    }
}
