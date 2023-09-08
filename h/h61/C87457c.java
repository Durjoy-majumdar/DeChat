package h61;

import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.emoji.magicemoji.bean.WxaPkgRecordForME;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h61.C87455a;
import kr0.C33983a1;
import kr0.C33987b1;
import o40.C61926c;
import p523fp.C32147e;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: h61.c */
public final class C87457c implements C33983a1.C33985b, C33983a1.C33984a {

    /* renamed from: a */
    public final C87455a.C87456a f253434a;

    /* renamed from: b */
    public int f253435b;

    /* renamed from: c */
    public long f253436c;

    /* renamed from: d */
    public C32226l<? super WxaPkgRecordForME, C13598b0> f253437d;

    /* renamed from: e */
    public final C13601g f253438e = C36568h.m40985a(C87458a.f253439d);

    /* renamed from: h61.c$a */
    public static final class C87458a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C87458a f253439d = new C87458a();

        public C87458a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C87455a.f253427c);
        }
    }

    public C87457c(C87455a.C87456a aVar) {
        C87412m.m108594g(aVar, "appIdBundle");
        this.f253434a = aVar;
    }

    /* renamed from: a */
    public void mo8657a(int i, String str) {
        WxaPkgRecordForME d;
        Log.m105928w("MicroMsg.MagicEmojiRecordMgr", "stevecai: onError: record download failed with " + i + ' ' + str);
        if (!((Boolean) ((C36570n) this.f253438e).getValue()).booleanValue() && (d = mo121913d()) != null) {
            mo121915f(d, false);
        }
        C115669n.INSTANCE.mo175911u(C87455a.f253430f, 2);
    }

    /* renamed from: b */
    public void mo56555b(C29315z2 z2Var, String str) {
        C87412m.m108594g(z2Var, "record");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str2 = z2Var.field_appId;
        C87412m.m108593f(str2, "record.field_appId");
        String str3 = z2Var.field_pkgPath;
        C87412m.m108593f(str3, "record.field_pkgPath");
        int i = z2Var.field_version;
        String str4 = z2Var.field_versionMd5;
        C87412m.m108593f(str4, "record.field_versionMd5");
        WxaPkgRecordForME wxaPkgRecordForME = new WxaPkgRecordForME(str2, str3, i, str4);
        Log.m105924i("MicroMsg.MagicEmojiRecordMgr", "stevecai: record download success: " + wxaPkgRecordForME);
        this.f253435b = 0;
        mo121912c(wxaPkgRecordForME.f248143f);
        mo121915f(wxaPkgRecordForME, false);
    }

    /* renamed from: c */
    public final void mo121912c(int i) {
        C87455a.C87456a aVar = this.f253434a;
        ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56532sv(aVar.f253432b, aVar.f253431a, 999);
        ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59394hF(this.f253434a.f253431a, i);
    }

    /* renamed from: d */
    public final WxaPkgRecordForME mo121913d() {
        WxaPkgRecordForME e = mo121914e();
        if (e != null) {
            return e;
        }
        if (!MMApplicationContext.isMainProcess()) {
            return null;
        }
        String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(37, 9);
        if (C86013q1.m106450k(AD)) {
            C32717b.f86777a.mo58771a(AD);
            mo121912c(0);
            Log.m105924i("MicroMsg.MagicEmojiRecordMgr", "stevecai: update magic emoji record from cache to version 0");
        }
        return mo121914e();
    }

    /* renamed from: e */
    public final WxaPkgRecordForME mo121914e() {
        C87455a.C87456a aVar = this.f253434a;
        C29315z2 Yh = ((C33987b1) C86312j.m106911c(C33987b1.class)).mo59392Yh(aVar.f253431a, aVar.f253433c, 0);
        if (Yh == null) {
            return null;
        }
        String str = Yh.field_appId;
        C87412m.m108593f(str, "record.field_appId");
        String str2 = Yh.field_pkgPath;
        C87412m.m108593f(str2, "record.field_pkgPath");
        int i = Yh.field_version;
        String str3 = Yh.field_versionMd5;
        C87412m.m108593f(str3, "record.field_versionMd5");
        WxaPkgRecordForME wxaPkgRecordForME = new WxaPkgRecordForME(str, str2, i, str3);
        mo121912c(wxaPkgRecordForME.f248143f);
        return wxaPkgRecordForME;
    }

    /* renamed from: f */
    public final void mo121915f(WxaPkgRecordForME wxaPkgRecordForME, boolean z) {
        String str = "record ready: " + wxaPkgRecordForME;
        C87412m.m108594g(str, "msg");
        int i = 0;
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger() || !C87455a.f253425a.f253431a.equals("wx9d5f7f0bf2dc950c")) {
            C61926c.m72668M(new C8490d(str));
        } else {
            Log.m105921e("MagicEmojiUtils", "[MagicEmoji]: %s", str);
        }
        C32226l<? super WxaPkgRecordForME, C13598b0> lVar = this.f253437d;
        if (lVar != null) {
            lVar.invoke(wxaPkgRecordForME);
            this.f253437d = null;
            if (!z) {
                i = 7;
            }
            C115669n.INSTANCE.mo175911u(C87455a.f253430f, i);
        }
    }

    /* renamed from: g */
    public final void mo121916g() {
        if (Util.ticksToNow(this.f253436c) > 60000) {
            this.f253435b = 0;
        }
        int i = this.f253435b;
        if (i >= 3) {
            C115669n.INSTANCE.mo175911u(C87455a.f253430f, 8);
            return;
        }
        this.f253435b = i + 1;
        this.f253436c = Util.currentTicks();
        Log.m105924i("MicroMsg.MagicEmojiRecordMgr", "stevecai: tryDownloadRecord: start downloading...");
        C87455a.C87456a aVar = this.f253434a;
        ((C33983a1) C86312j.m106911c(C33983a1.class)).mo56533yv(aVar.f253431a, aVar.f253433c, this, this);
    }
}
