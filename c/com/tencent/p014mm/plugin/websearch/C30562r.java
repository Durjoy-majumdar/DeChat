package com.tencent.p014mm.plugin.websearch;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import kv1.C99260q;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.C49912ix3;
import te3.C50049jx3;
import u73.C14135q;
import u73.C52469w0;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.websearch.r */
public class C30562r extends C86301e implements C14135q {

    /* renamed from: d */
    public static String f82336d = "websearch_";

    /* renamed from: e */
    public static String f82337e;

    /* renamed from: com.tencent.mm.plugin.websearch.r$a */
    public class C30563a implements l0$$e {
        public C30563a(C30562r rVar) {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.websearch.r$b */
    public class C30564b implements l0$$e {
        public C30564b(C30562r rVar) {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            return 0;
        }
    }

    /* renamed from: Vi */
    public void mo13545Vi() {
        Log.m105924i("WebSearchPrivacyMgr", "reInit");
        f82336d = "websearch_" + C86709a0.m107523b().mo121111i();
        Object e = C86709a0.m107535s().mo121142i().mo119684e(274436, "");
        String obj = e != null ? e.toString() : "en";
        f82337e = String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/newreadtemplate?t=gdpr/confirm&business=search&lang=%s&cc=%s&autoCloseWindow=1", new Object[]{LocaleUtil.getApplicationLanguage(), obj});
        String.format(HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/newreadtemplate?t=gdpr/close&business=search&lang=%s&cc=%s&autoCloseWindow=1", new Object[]{LocaleUtil.getApplicationLanguage(), obj});
    }

    /* renamed from: YA */
    public void mo13546YA() {
        Log.m105924i("WebSearchPrivacyMgr", "closeSearch ");
        init();
        vx0().edit().putBoolean("websearch_confirmed", false).commit();
        C49912ix3 ix32 = new C49912ix3();
        ix32.f135735d = 1;
        ix32.f135736e = (int) (System.currentTimeMillis() / 1000);
        ix32.f135737f = 2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ix32;
        bVar.f127067b = new C50049jx3();
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchconfirm";
        bVar.f127069d = 2957;
        C89144l0.m111429e(bVar.mo72403a(), new C30564b(this), false);
        ((C99260q) C86312j.m106911c(C99260q.class)).mo128760x3();
        if (C52469w0.f146609a != null) {
            C52469w0.f146609a = null;
        }
        MMApplicationContext.getContext().getSharedPreferences("fts_recent_biz_sp", 0).edit().remove(C52469w0.m58724b()).commit();
    }

    public boolean eq0(Context context, Runnable runnable) {
        init();
        runnable.run();
        return false;
    }

    public void init() {
        if (f82337e == null) {
            mo13545Vi();
        }
    }

    /* renamed from: kN */
    public void mo13549kN(Context context, Runnable runnable) {
        init();
        runnable.run();
    }

    public void vw0() {
        Log.m105924i("WebSearchPrivacyMgr", "openSearch ");
        init();
        vx0().edit().putBoolean("websearch_confirmed", true).commit();
        C49912ix3 ix32 = new C49912ix3();
        ix32.f135735d = 1;
        ix32.f135736e = (int) (System.currentTimeMillis() / 1000);
        ix32.f135737f = 1;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ix32;
        bVar.f127067b = new C50049jx3();
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchconfirm";
        bVar.f127069d = 2957;
        C89144l0.m111429e(bVar.mo72403a(), new C30563a(this), false);
    }

    public final SharedPreferences vx0() {
        init();
        Log.m105925i("WebSearchPrivacyMgr", " sp name %s ", f82336d);
        return MultiProcSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), f82336d, 0, false);
    }
}
