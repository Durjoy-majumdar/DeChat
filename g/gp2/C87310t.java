package gp2;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask;

/* renamed from: gp2.t */
public final class C87310t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdLandingPageChattingTask f253037d;

    /* renamed from: e */
    public final /* synthetic */ WxaExposedParams f253038e;

    /* renamed from: f */
    public final /* synthetic */ String f253039f;

    /* renamed from: g */
    public final /* synthetic */ Context f253040g;

    /* renamed from: h */
    public final /* synthetic */ String f253041h;

    /* renamed from: i */
    public final /* synthetic */ int f253042i;

    /* renamed from: j */
    public final /* synthetic */ String f253043j;

    /* renamed from: n */
    public final /* synthetic */ String f253044n;

    /* renamed from: o */
    public final /* synthetic */ String f253045o;

    /* renamed from: gp2.t$a */
    public static final class C87311a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ AdLandingPageChattingTask f253046d;

        public C87311a(AdLandingPageChattingTask adLandingPageChattingTask) {
            this.f253046d = adLandingPageChattingTask;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$doEnterChatting$1$2$1");
            if (i == 1) {
                this.f253046d.mo114397h();
            }
            SnsMethodCalculate.markEndTimeMs("mmOnActivityResult", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$doEnterChatting$1$2$1");
        }
    }

    public C87310t(AdLandingPageChattingTask adLandingPageChattingTask, WxaExposedParams wxaExposedParams, String str, Context context, String str2, int i, String str3, String str4, String str5) {
        this.f253037d = adLandingPageChattingTask;
        this.f253038e = wxaExposedParams;
        this.f253039f = str;
        this.f253040g = context;
        this.f253041h = str2;
        this.f253042i = i;
        this.f253043j = str3;
        this.f253044n = str4;
        this.f253045o = str5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$doEnterChatting$1$2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r14.f253041h
            java.lang.String r4 = "uxInfo"
            r2.put(r4, r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "JSONObject().apply {\n   …             }.toString()"
            gy3.C87412m.m108593f(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r3 = r3.setFlags(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask r4 = r14.f253037d
            java.lang.String r4 = r4.f249077g
            java.lang.String r5 = "Chat_User"
            android.content.Intent r3 = r3.putExtra(r5, r4)
            java.lang.String r4 = "app_brand_chatting_from_scene"
            r5 = 3
            android.content.Intent r3 = r3.putExtra(r4, r5)
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams r4 = r14.f253038e
            java.lang.String r6 = "app_brand_chatting_expose_params"
            android.content.Intent r3 = r3.putExtra(r6, r4)
            java.lang.String r4 = r14.f253039f
            java.lang.String r6 = "key_temp_session_from"
            android.content.Intent r3 = r3.putExtra(r6, r4)
            java.lang.String r4 = "finish_direct"
            r6 = 1
            android.content.Intent r3 = r3.putExtra(r4, r6)
            java.lang.String r4 = "app_brand_chatting_from_scene_new"
            r7 = 4
            android.content.Intent r3 = r3.putExtra(r4, r7)
            int r4 = r14.f253042i
            java.lang.String r7 = r14.f253043j
            java.lang.String r8 = r14.f253044n
            java.lang.String r9 = r14.f253045o
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r11 = 0
            if (r10 != 0) goto L_0x0076
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x0076
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r10 != 0) goto L_0x0076
            boolean r10 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r10 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r10 = 0
            goto L_0x0077
        L_0x0076:
            r10 = 1
        L_0x0077:
            java.lang.Class<h81.h> r12 = h81.C32735h.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            h81.h r12 = (h81.C32735h) r12
            if (r12 == 0) goto L_0x0087
            h81.h$c r13 = h81.C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video
            boolean r10 = r12.mo58784wf(r13, r10)
        L_0x0087:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "isSupportSendVideo#get, "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "MicroMsg.AppBrandContactABTests"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            if (r10 != 0) goto L_0x00a4
            java.lang.String r10 = "key_need_send_video"
            r3.putExtra(r10, r11)
        L_0x00a4:
            java.lang.String r10 = "showMessageCard"
            if (r4 != r6) goto L_0x00ce
            java.lang.String[] r4 = new java.lang.String[r5]
            r4[r11] = r7
            r4[r6] = r8
            r5 = 2
            r4[r5] = r9
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r4)
            if (r4 != 0) goto L_0x00ce
            r3.putExtra(r10, r6)
            java.lang.String r4 = "sendMessageTitle"
            r3.putExtra(r4, r7)
            java.lang.String r4 = "sendMessagePath"
            r3.putExtra(r4, r9)
            java.lang.String r4 = "sendMessageImg"
            r3.putExtra(r4, r8)
            goto L_0x00d1
        L_0x00ce:
            r3.putExtra(r10, r11)
        L_0x00d1:
            java.lang.String r4 = "sns_landing_pages_ux_info"
            r3.putExtra(r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "open ServiceChattingUI， uxInfo = "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "SnsAdMb.JsApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            android.content.Context r2 = r14.f253040g
            boolean r4 = r2 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r4 == 0) goto L_0x0100
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.p014mm.p136ui.MMActivity) r2
            gp2.t$a r4 = new gp2.t$a
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask r5 = r14.f253037d
            r4.<init>(r5)
            r2.mmSetOnActivityResultCallback(r4)
        L_0x0100:
            android.content.Context r2 = r14.f253040g
            java.lang.String r4 = ".ui.chatting.AppBrandServiceChattingUI"
            ke3.C88144b.m109802t(r2, r4, r3, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.C87310t.run():void");
    }
}
