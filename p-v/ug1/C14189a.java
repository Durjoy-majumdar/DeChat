package ug1;

import a14.C0000n0;
import a14.C53965x0;
import com.tencent.p014mm.plugin.finder.live.cheer.CheerCountDownView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.cheer.CheerCountDownView$startCountDown$1", mo125469f = "CheerCountDownView.kt", mo125470l = {81}, mo125471m = "invokeSuspend")
/* renamed from: ug1.a */
public final class C14189a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public float f39634d;

    /* renamed from: e */
    public int f39635e;

    /* renamed from: f */
    public final /* synthetic */ long f39636f;

    /* renamed from: g */
    public final /* synthetic */ CheerCountDownView f39637g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f39638h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14189a(long j, CheerCountDownView cheerCountDownView, C32224a<C13598b0> aVar, C15601d<? super C14189a> dVar) {
        super(2, dVar);
        this.f39636f = j;
        this.f39637g = cheerCountDownView;
        this.f39638h = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14189a(this.f39636f, this.f39637g, this.f39638h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14189a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f39635e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            f = 360.0f / (((float) this.f39636f) / 60.0f);
        } else if (i == 1) {
            f = this.f39634d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (true) {
            CheerCountDownView cheerCountDownView = this.f39637g;
            float f2 = cheerCountDownView.f159295j;
            if (f2 > 0.0f) {
                float f3 = f2 - f;
                cheerCountDownView.f159295j = f3;
                if (f3 < 0.0f) {
                    cheerCountDownView.f159295j = 0.0f;
                }
                cheerCountDownView.invalidate();
                if (this.f39637g.f159295j > 0.0f) {
                    this.f39634d = f;
                    this.f39635e = 1;
                    if (C53965x0.m60607b(60, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.m105920e("CheerCountDownView", "endCountDown");
                this.f39638h.invoke();
                return C13598b0.f38549a;
            }
        }
    }
}
