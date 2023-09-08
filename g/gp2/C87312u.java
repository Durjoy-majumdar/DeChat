package gp2;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: gp2.u */
public final class C87312u {

    /* renamed from: a */
    public static final C87312u f253047a = new C87312u();

    /* renamed from: gp2.u$a */
    public static final class C87313a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f253048d;

        /* renamed from: e */
        public final /* synthetic */ String f253049e;

        /* renamed from: f */
        public final /* synthetic */ String f253050f;

        /* renamed from: g */
        public final /* synthetic */ String f253051g;

        /* renamed from: h */
        public final /* synthetic */ int f253052h;

        /* renamed from: i */
        public final /* synthetic */ String f253053i;

        /* renamed from: j */
        public final /* synthetic */ String f253054j;

        /* renamed from: n */
        public final /* synthetic */ String f253055n;

        /* renamed from: o */
        public final /* synthetic */ String f253056o;

        /* renamed from: p */
        public final /* synthetic */ String f253057p;

        public C87313a(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8) {
            this.f253048d = context;
            this.f253049e = str;
            this.f253050f = str2;
            this.f253051g = str3;
            this.f253052h = i;
            this.f253053i = str4;
            this.f253054j = str5;
            this.f253055n = str6;
            this.f253056o = str7;
            this.f253057p = str8;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$doEnterChattingOnMainThread$1");
            Context context = this.f253048d;
            String str = this.f253049e;
            String str2 = this.f253050f;
            String str3 = this.f253051g;
            int i = this.f253052h;
            String str4 = this.f253053i;
            String str5 = this.f253054j;
            String str6 = this.f253055n;
            String str7 = this.f253056o;
            String str8 = this.f253057p;
            SnsMethodCalculate.markStartTimeMs("access$doEnterChatting", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            SnsMethodCalculate.markStartTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
            bVar.f239557a = str2;
            bVar.f239560d = str;
            bVar.f239561e = "";
            bVar.f239562f = "";
            String str9 = str;
            bVar.f239564h = 0;
            bVar.f239563g = 0;
            bVar.f239565i = "";
            bVar.f239566j = 14;
            bVar.f239567k = "";
            bVar.f239568l = "";
            WxaExposedParams a = bVar.mo113977a();
            AdLandingPageChattingTask adLandingPageChattingTask = new AdLandingPageChattingTask();
            if (C112551y.m153811k(str8)) {
                str8 = str9;
            }
            adLandingPageChattingTask.f249077g = str8;
            adLandingPageChattingTask.f249078h = "";
            adLandingPageChattingTask.f249076f = str3;
            AdLandingPageChattingTask adLandingPageChattingTask2 = adLandingPageChattingTask;
            C87310t tVar = r3;
            C87310t tVar2 = new C87310t(adLandingPageChattingTask2, a, str3, context, str7, i, str4, str6, str5);
            AdLandingPageChattingTask adLandingPageChattingTask3 = adLandingPageChattingTask2;
            adLandingPageChattingTask3.f249079i = tVar;
            adLandingPageChattingTask3.mo114395c();
            SnsMethodCalculate.markEndTimeMs("doEnterChatting", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            SnsMethodCalculate.markEndTimeMs("access$doEnterChatting", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$doEnterChattingOnMainThread$1");
        }
    }

    /* renamed from: a */
    public final void mo121701a(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8) {
        SnsMethodCalculate.markStartTimeMs("doEnterChattingOnMainThread", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
        C87412m.m108594g(context, "context");
        String str9 = str;
        C87412m.m108594g(str9, "userName");
        String str10 = str2;
        C87412m.m108594g(str10, "weAppId");
        String str11 = str3;
        C87412m.m108594g(str11, "sessionFrom");
        String str12 = str4;
        C87412m.m108594g(str12, "sendMessageTitle");
        String str13 = str5;
        C87412m.m108594g(str13, "sendMessagePath");
        String str14 = str6;
        C87412m.m108594g(str14, "sendMessageImg");
        String str15 = str7;
        C87412m.m108594g(str15, "uxInfo");
        String str16 = str8;
        C87412m.m108594g(str16, "subBusinessUsername");
        MMHandlerThread.postToMainThread(new C87313a(context, str9, str10, str11, i, str12, str13, str14, str15, str16));
        SnsMethodCalculate.markEndTimeMs("doEnterChattingOnMainThread", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper");
    }
}
