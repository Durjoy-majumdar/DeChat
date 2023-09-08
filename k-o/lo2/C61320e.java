package lo2;

import a14.C0000n0;
import a14.C53921m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import kotlin.ResultKt;
import ps2.C62492o;
import ps2.C62495q;
import rx3.C13598b0;
import so2.C101683n;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1", mo125469f = "AdCombineFollowHfScreenHelper.kt", mo125470l = {66}, mo125471m = "invokeSuspend")
/* renamed from: lo2.e */
public final class C61320e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f174440d;

    /* renamed from: e */
    public int f174441e;

    /* renamed from: f */
    public final /* synthetic */ View f174442f;

    /* renamed from: g */
    public final /* synthetic */ C101683n.C101685b f174443g;

    /* renamed from: h */
    public final /* synthetic */ Context f174444h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61320e(View view, C101683n.C101685b bVar, Context context, C15601d<? super C61320e> dVar) {
        super(2, dVar);
        this.f174442f = view;
        this.f174443g = bVar;
        this.f174444h = context;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        C61320e eVar = new C61320e(this.f174442f, this.f174443g, this.f174444h, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        Object invokeSuspend = ((C61320e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        ImageView imageView;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f174441e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            View view = this.f174442f;
            ImageView imageView2 = view != null ? (ImageView) view.findViewById(C0966R.C0970id.ncd) : null;
            C101683n.C101685b bVar = this.f174443g;
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getHeadImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            String str = bVar.f297677b;
            SnsMethodCalculate.markEndTimeMs("getHeadImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
            if (str == null) {
                str = "";
            }
            this.f174440d = imageView2;
            this.f174441e = 1;
            SnsMethodCalculate.markStartTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
            mVar.mo74609p();
            C62495q.f177534a.mo87528a(str, new C62492o(mVar));
            Object o = mVar.mo74608o();
            SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (o == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
                return aVar;
            }
            imageView = imageView2;
            obj = o;
        } else if (i == 1) {
            imageView = (ImageView) this.f174440d;
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
            throw illegalStateException;
        }
        Bitmap bitmap = (Bitmap) obj;
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (imageView != null) {
            imageView.setImageDrawable(new BitmapDrawable(this.f174444h.getResources(), bitmap));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$1");
        return b0Var;
    }
}
