package sj1;

import a14.C0000n0;
import a14.C53965x0;
import android.widget.TextView;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.view.convert.PromoteBannerNormalConvert$onBindViewHolder$4", mo125469f = "PromoteBannerNormalConvert.kt", mo125470l = {223}, mo125471m = "invokeSuspend")
/* renamed from: sj1.e */
public final class C13682e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f38728d;

    /* renamed from: e */
    public final /* synthetic */ C63914h f38729e;

    /* renamed from: f */
    public final /* synthetic */ TextView f38730f;

    /* renamed from: g */
    public final /* synthetic */ TextView f38731g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13682e(C63914h hVar, TextView textView, TextView textView2, C15601d<? super C13682e> dVar) {
        super(2, dVar);
        this.f38729e = hVar;
        this.f38730f = textView;
        this.f38731g = textView2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C13682e(this.f38729e, this.f38730f, this.f38731g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C13682e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f38728d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f38728d = 1;
            if (C53965x0.m60607b(1000, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f38729e.mo88698j(this.f38730f, true);
        this.f38729e.mo88698j(this.f38731g, true);
        return C13598b0.f38549a;
    }
}
