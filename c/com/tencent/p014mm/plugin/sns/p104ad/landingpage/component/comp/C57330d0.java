package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53921m;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import ps2.C100891r;
import ps2.C62492o;
import rx3.C13598b0;
import so2.C101687p;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1", mo125469f = "AdLandingMusicComponent.kt", mo125470l = {645, 654}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d0 */
public final class C57330d0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f164232d;

    /* renamed from: e */
    public final /* synthetic */ C101687p f164233e;

    /* renamed from: f */
    public final /* synthetic */ AdLandingMusicComponent f164234f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1", mo125469f = "AdLandingMusicComponent.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.d0$a */
    public static final class C57331a extends C91594j implements C32227p<C0000n0, C15601d<? super Bitmap>, Object> {

        /* renamed from: d */
        public final /* synthetic */ AdLandingMusicComponent f164235d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f164236e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57331a(AdLandingMusicComponent adLandingMusicComponent, Bitmap bitmap, C15601d<? super C57331a> dVar) {
            super(2, dVar);
            this.f164235d = adLandingMusicComponent;
            this.f164236e = bitmap;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            C57331a aVar = new C57331a(this.f164235d, this.f164236e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            Object invokeSuspend = ((C57331a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            ResultKt.throwOnFailure(obj);
            AdLandingMusicComponent adLandingMusicComponent = this.f164235d;
            adLandingMusicComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("getDisplayType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            int i = adLandingMusicComponent.f273751u;
            SnsMethodCalculate.markEndTimeMs("getDisplayType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            double d = i == 0 ? 2.725d : 0.7348314606741573d;
            if ((((double) this.f164236e.getWidth()) + 0.0d) / ((double) this.f164236e.getHeight()) > d) {
                Bitmap bitmap2 = this.f164236e;
                bitmap = Bitmap.createBitmap(bitmap2, (int) ((((double) bitmap2.getWidth()) - (((double) this.f164236e.getHeight()) * d)) / ((double) 2)), 0, (int) (((double) this.f164236e.getHeight()) * d), this.f164236e.getHeight());
            } else {
                Bitmap bitmap3 = this.f164236e;
                bitmap = Bitmap.createBitmap(bitmap3, 0, (int) ((((double) bitmap3.getHeight()) - (((double) this.f164236e.getWidth()) / d)) / ((double) 2)), this.f164236e.getWidth(), (int) (((double) this.f164236e.getWidth()) / d));
            }
            try {
                Bitmap fastblur = BitmapUtil.fastblur(bitmap, 50);
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
                return fastblur;
            } catch (Throwable unused) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
                return null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57330d0(C101687p pVar, AdLandingMusicComponent adLandingMusicComponent, C15601d<? super C57330d0> dVar) {
        super(2, dVar);
        this.f164233e = pVar;
        this.f164234f = adLandingMusicComponent;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        C57330d0 d0Var = new C57330d0(this.f164233e, this.f164234f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        return d0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        Object invokeSuspend = ((C57330d0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        AdLandingMusicComponent adLandingMusicComponent;
        RoundCornerRelativeLayout O;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f164232d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f164233e.f297685B;
            C87412m.m108593f(str, "musicInfo.coverUrl");
            this.f164232d = 1;
            SnsMethodCalculate.markStartTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C62492o oVar = new C62492o(mVar);
            SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            C100891r.m132207b("adId", str, false, 0, 0, oVar);
            SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            Object o = mVar.mo74608o();
            SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (o == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
                return aVar;
            }
            obj = o;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            bitmap = (Bitmap) obj;
            if (!(bitmap == null || (O = adLandingMusicComponent.mo130167O()) == null)) {
                O.setBackground(new BitmapDrawable(AdLandingMusicComponent.m119663G(adLandingMusicComponent).getResources(), bitmap));
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return b0Var;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            throw illegalStateException;
        }
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 == null) {
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return b0Var2;
        } else if (bitmap2.getHeight() == 0) {
            C13598b0 b0Var3 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return b0Var3;
        } else {
            AdLandingMusicComponent adLandingMusicComponent2 = this.f164234f;
            adLandingMusicComponent2.getClass();
            SnsMethodCalculate.markStartTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            MMRoundCornerImageView mMRoundCornerImageView = adLandingMusicComponent2.f273753w;
            SnsMethodCalculate.markEndTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            mMRoundCornerImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            AdLandingMusicComponent adLandingMusicComponent3 = this.f164234f;
            adLandingMusicComponent3.getClass();
            SnsMethodCalculate.markStartTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            MMRoundCornerImageView mMRoundCornerImageView2 = adLandingMusicComponent3.f273753w;
            SnsMethodCalculate.markEndTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
            mMRoundCornerImageView2.setImageDrawable(new BitmapDrawable(AdLandingMusicComponent.m119663G(this.f164234f).getResources(), bitmap2));
            C53896h0 h0Var = C53872d1.f151119c;
            C57331a aVar2 = new C57331a(this.f164234f, bitmap2, (C15601d<? super C57331a>) null);
            this.f164232d = 2;
            obj = C53895h.m60469g(h0Var, aVar2, this);
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
                return aVar;
            }
            bitmap = (Bitmap) obj;
            adLandingMusicComponent = this.f164234f;
            O.setBackground(new BitmapDrawable(AdLandingMusicComponent.m119663G(adLandingMusicComponent).getResources(), bitmap));
            C13598b0 b0Var4 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return b0Var4;
        }
    }
}
