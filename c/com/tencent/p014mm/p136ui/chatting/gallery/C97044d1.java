package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53965x0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import f03.C97787h;
import fy3.C32227p;
import kotlin.ResultKt;
import m03.C99783d;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$monitorProgress$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {820}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.ui.chatting.gallery.d1 */
public final class C97044d1 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f284676d;

    /* renamed from: e */
    public /* synthetic */ Object f284677e;

    /* renamed from: f */
    public final /* synthetic */ C99783d f284678f;

    /* renamed from: g */
    public final /* synthetic */ RedesignVideoPlayerSeekBar f284679g;

    /* renamed from: h */
    public final /* synthetic */ C97136u0 f284680h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97044d1(C99783d dVar, RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar, C97136u0 u0Var, C15601d<? super C97044d1> dVar2) {
        super(2, dVar2);
        this.f284678f = dVar;
        this.f284679g = redesignVideoPlayerSeekBar;
        this.f284680h = u0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C97044d1 d1Var = new C97044d1(this.f284678f, this.f284679g, this.f284680h, dVar);
        d1Var.f284677e = obj;
        return d1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C97044d1) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C0000n0 n0Var;
        long j;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f284676d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            n0Var = (C0000n0) this.f284677e;
        } else if (i == 1) {
            n0Var = (C0000n0) this.f284677e;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (C53930o0.m60560g(n0Var)) {
            int currentPosition = this.f284678f.getCurrentPosition() / 1000;
            if (this.f284679g.getmPosition() != currentPosition) {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "progress: " + currentPosition);
                this.f284679g.seek(currentPosition);
            }
            long min = Math.min(1000 - (((long) this.f284678f.getCurrentPosition()) % 1000), 500);
            if (this.f284678f.mo24838g()) {
                C97136u0 u0Var = this.f284680h;
                C99783d dVar = this.f284678f;
                C97787h hVar = u0Var.f285037u;
                if (hVar != null && hVar.mo134534g()) {
                    j = (long) dVar.getDuration();
                } else {
                    C97787h hVar2 = u0Var.f285037u;
                    j = hVar2 != null ? hVar2.mo134533f() : 0;
                }
                int i2 = (int) (j / ((long) 1000));
                if (i2 > 0) {
                    this.f284679g.mo135174v(i2);
                }
            }
            this.f284677e = n0Var;
            this.f284676d = 1;
            if (C53965x0.m60607b(min, this) == aVar) {
                return aVar;
            }
        }
        return C13598b0.f38549a;
    }
}
