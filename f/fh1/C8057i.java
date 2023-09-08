package fh1;

import a14.C0000n0;
import android.widget.ImageView;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import fh1.C8048h;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$GestureEffectSettingConvert$onBindViewHolder$1", mo125469f = "GestureEffectAnchorSettingController.kt", mo125470l = {339}, mo125471m = "invokeSuspend")
/* renamed from: fh1.i */
public final class C8057i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f26795d;

    /* renamed from: e */
    public final /* synthetic */ C8048h.C8051c f26796e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f26797f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8057i(C8048h.C8051c cVar, ImageView imageView, C15601d<? super C8057i> dVar) {
        super(2, dVar);
        this.f26796e = cVar;
        this.f26797f = imageView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8057i(this.f26796e, this.f26797f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8057i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f26795d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C8048h.C8051c cVar = this.f26796e;
            this.f26795d = 1;
            obj = cVar.mo9139a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f26797f.setImageBitmap(MMBitmapFactory.m98734c((String) obj));
        return C13598b0.f38549a;
    }
}
