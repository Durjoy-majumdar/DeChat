package nm1;

import a14.C0000n0;
import android.content.Context;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import jq3.C60905o;
import kotlin.ResultKt;
import p565ir.C60606n;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.nearby.live.convert.NearbyFinderSquareLiveFeedConvert$bindActivityIcon$refreshActivityIconJob$1", mo125469f = "NearbyFinderSquareLiveFeedConvert.kt", mo125470l = {186}, mo125471m = "invokeSuspend")
/* renamed from: nm1.f */
public final class C11230f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f33094d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f33095e;

    /* renamed from: f */
    public final /* synthetic */ BaseFinderFeed f33096f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f33097g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11230f(C60905o oVar, BaseFinderFeed baseFinderFeed, ImageView imageView, C15601d<? super C11230f> dVar) {
        super(2, dVar);
        this.f33095e = oVar;
        this.f33096f = baseFinderFeed;
        this.f33097g = imageView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C11230f(this.f33095e, this.f33096f, this.f33097g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C11230f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f33094d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = this.f33095e.f173499A;
            C87412m.m108593f(context, "holder.context");
            long j = this.f33096f.mo3513o().field_id;
            String objectNonceId = this.f33096f.mo3513o().getObjectNonceId();
            ImageView imageView = this.f33097g;
            C87412m.m108593f(imageView, "iconView");
            this.f33094d = 1;
            if (((C60606n) C86312j.m106911c(C60606n.class)).vj0(context, j, objectNonceId, imageView, 1, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
