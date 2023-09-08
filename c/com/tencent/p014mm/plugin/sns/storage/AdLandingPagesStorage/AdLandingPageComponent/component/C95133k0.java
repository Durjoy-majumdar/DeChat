package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import nj3.C76912y0;
import ob0.C47350c;
import pe3.C47465a;
import qs2.C89838o;
import te3.C50098k92;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0 */
public class C95133k0 implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C89838o f276098a;

    /* renamed from: b */
    public final /* synthetic */ C95108i0 f276099b;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0$a */
    public class C95134a implements Runnable {
        public C95134a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6$1");
            C76912y0.makeText(C95133k0.this.f276099b.f276579d, (int) C0966R.string.ja5, 0).show();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k0$b */
    public class C95135b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C50098k92 f276101d;

        public C95135b(C50098k92 k922) {
            this.f276101d = k922;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6$2");
            C95133k0 k0Var = C95133k0.this;
            C95108i0 i0Var = k0Var.f276099b;
            C89838o oVar = k0Var.f276098a;
            String str = this.f276101d.f136626d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            i0Var.mo131624M(oVar, str);
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6$2");
        }
    }

    public C95133k0(C95108i0 i0Var, C89838o oVar) {
        this.f276099b = i0Var;
        this.f276098a = oVar;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        C47465a aVar;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6");
        if (i == 0 && i2 == 0 && (aVar = cVar.f127056b.f127083a) != null) {
            C50098k92 k922 = (C50098k92) aVar;
            Log.m105925i("MicroMsg.Sns.AdLandingPageBtnComponent", "getsubbusinessinfo cgi success, subBusinessUsername:%s", k922.f136626d);
            MMHandlerThread.postToMainThread(new C95135b(k922));
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6");
            return;
        }
        Log.m105921e("MicroMsg.Sns.AdLandingPageBtnComponent", "getsubbusinessinfo cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", Integer.valueOf(i), Integer.valueOf(i2), str, cVar.f127056b.f127083a);
        MMHandlerThread.postToMainThread(new C95134a());
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent$6");
    }
}
