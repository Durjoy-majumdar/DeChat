package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import qs2.C101259c0;
import qs2.C101271i0;
import rx3.C13598b0;
import te3.C52075y62;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1", mo125469f = "AdLandingQRCodeBtnCompDelegate.kt", mo125470l = {276}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l2 */
public final class C95141l2 extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

    /* renamed from: d */
    public Object f276136d;

    /* renamed from: e */
    public Object f276137e;

    /* renamed from: f */
    public Object f276138f;

    /* renamed from: g */
    public Object f276139g;

    /* renamed from: h */
    public int f276140h;

    /* renamed from: i */
    public final /* synthetic */ String f276141i;

    /* renamed from: j */
    public final /* synthetic */ C101259c0 f276142j;

    /* renamed from: n */
    public final /* synthetic */ C101271i0 f276143n;

    /* renamed from: o */
    public final /* synthetic */ String f276144o;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l2$a */
    public static final class C95142a implements AdLandingPagesProxy.C94830p {

        /* renamed from: a */
        public final /* synthetic */ String f276145a;

        /* renamed from: b */
        public final /* synthetic */ C53916l<String> f276146b;

        public C95142a(String str, C53916l<? super String> lVar) {
            this.f276145a = str;
            this.f276146b = lVar;
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
            C95116i2.C95117a aVar = C95116i2.f276048e;
            aVar.mo131643a();
            Log.m105924i("AdLandingQRCodeBtnCompDelegate", "onCallback() called with: errType = " + i + ", errNo = " + i2 + ", obj = " + obj);
            if (i == 0 && i2 == 0) {
                try {
                    if (obj instanceof byte[]) {
                        C52075y62 y622 = new C52075y62();
                        y622.parseFrom((byte[]) obj);
                        if (C87412m.m108589b(this.f276145a, y622.f145141f)) {
                            aVar.mo131643a();
                            Log.m105924i("AdLandingQRCodeBtnCompDelegate", "request new qr image imgUrl completed " + y622.f145139d);
                            C53916l<String> lVar = this.f276146b;
                            Result.Companion companion = Result.Companion;
                            lVar.resumeWith(Result.m168114constructorimpl(y622.f145139d));
                            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
                            return;
                        }
                    }
                } catch (Throwable th) {
                    C95116i2.f276048e.mo131643a();
                    Log.m105920e("AdLandingQRCodeBtnCompDelegate", th.toString());
                }
            }
            this.f276146b.resumeWith(Result.m168114constructorimpl((Object) null));
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1$1$1");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95141l2(String str, C101259c0 c0Var, C101271i0 i0Var, String str2, C15601d<? super C95141l2> dVar) {
        super(2, dVar);
        this.f276141i = str;
        this.f276142j = c0Var;
        this.f276143n = i0Var;
        this.f276144o = str2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        C95141l2 l2Var = new C95141l2(this.f276141i, this.f276142j, this.f276143n, this.f276144o, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return l2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        Object invokeSuspend = ((C95141l2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f276140h;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f276141i;
            C101259c0 c0Var = this.f276142j;
            C101271i0 i0Var = this.f276143n;
            String str2 = this.f276144o;
            this.f276136d = str;
            this.f276137e = c0Var;
            this.f276138f = i0Var;
            this.f276139g = str2;
            this.f276140h = 1;
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C95116i2.C95117a aVar2 = C95116i2.f276048e;
            String str3 = c0Var.f296555a0;
            C95142a aVar3 = new C95142a(str2, mVar);
            SnsMethodCalculate.markStartTimeMs("requestQrImageUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            C87412m.m108594g(i0Var, "pageData");
            aVar2.mo131643a();
            Log.m105924i("AdLandingQRCodeBtnCompDelegate", "requestQrImageUrl() called with: geoString = " + str + ", qrExtInfo = " + str3 + ", backUp = " + "" + ", pageData = " + i0Var + ", cId = " + str2 + ", callback = " + aVar3);
            AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
            String str4 = str == null ? "" : str;
            if (str3 == null) {
                str3 = "";
            }
            String l = i0Var.mo140745l();
            if (l == null) {
                l = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            String h = i0Var.mo140741h();
            instance.doAdUpdateQrUrlScene(str4, str3, "", l, str2, h == null ? "" : h, aVar3);
            SnsMethodCalculate.markEndTimeMs("requestQrImageUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            obj2 = mVar.mo74608o();
            if (obj2 == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
                return aVar;
            }
        } else if (i == 1) {
            String str5 = (String) this.f276139g;
            C101271i0 i0Var2 = (C101271i0) this.f276138f;
            C101259c0 c0Var2 = (C101259c0) this.f276137e;
            String str6 = (String) this.f276136d;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
            throw illegalStateException;
        }
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestUrlAndImage$imageUrl$1");
        return obj2;
    }
}
