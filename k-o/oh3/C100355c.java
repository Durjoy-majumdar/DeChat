package oh3;

import a14.C0000n0;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f03.C97785g;
import f03.C97787h;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import m03.C99783d;
import p501dz.C58466h;
import rx3.C13598b0;
import te3.C101804kv2;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.sns_compose.widget.PlayerState$getPlayer$1", mo125469f = "PlayerVideo.kt", mo125470l = {149}, mo125471m = "invokeSuspend")
/* renamed from: oh3.c */
public final class C100355c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f293939d;

    /* renamed from: e */
    public int f293940e;

    /* renamed from: f */
    public final /* synthetic */ C100356d f293941f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100355c(C100356d dVar, C15601d<? super C100355c> dVar2) {
        super(2, dVar2);
        this.f293941f = dVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C100355c(this.f293941f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C100355c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C97787h hVar;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f293940e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MiscroMsg.PlayerState", "getPlayer snsId:" + this.f293941f.f293944e + " isPlay:" + this.f293941f.f293950n);
            C99783d dVar = this.f293941f.f293949j;
            if (dVar == null) {
                return C13598b0.f38549a;
            }
            C87412m.m108591d(dVar);
            if (dVar.isInitialized()) {
                C99783d dVar2 = this.f293941f.f293949j;
                C87412m.m108591d(dVar2);
                dVar2.stop();
            }
            C100356d dVar3 = this.f293941f;
            if (dVar3.f293951o == null) {
                int i2 = dVar3.f293945f;
                C87412m.m108594g(dVar3.f293946g, "media");
                dVar3.f293951o = null;
            }
            C100356d dVar4 = this.f293941f;
            if (dVar4.f293951o != null) {
                C99783d dVar5 = dVar4.f293949j;
                C87412m.m108591d(dVar5);
                ((C96875r0) dVar5).setVideoPath(this.f293941f.f293951o);
                C99783d dVar6 = this.f293941f.f293949j;
                C87412m.m108591d(dVar6);
                dVar6.setVideoCallback(this.f293941f);
                C99783d dVar7 = this.f293941f.f293949j;
                C87412m.m108591d(dVar7);
                dVar7.setLoop(true);
                C99783d dVar8 = this.f293941f.f293949j;
                C87412m.m108591d(dVar8);
                dVar8.setScaleType(C96814a.C96817e.COVER);
                return C13598b0.f38549a;
            }
            int i3 = dVar4.f293945f;
            C101804kv2 kv22 = dVar4.f293946g;
            int i4 = dVar4.f293947h;
            C87412m.m108594g(kv22, "media");
            C87412m.m108591d((Object) null);
            C97787h mr02 = ((C58466h) C86312j.m106911c(C58466h.class)).mr0((C97785g) null);
            mr02.start();
            this.f293939d = mr02;
            this.f293940e = 1;
            if (mr02.mo134539k(this) == aVar) {
                return aVar;
            }
            hVar = mr02;
        } else if (i == 1) {
            hVar = (C97787h) this.f293939d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C99783d dVar9 = this.f293941f.f293949j;
        C87412m.m108591d(dVar9);
        dVar9.setResourceDownloader(hVar);
        C99783d dVar10 = this.f293941f.f293949j;
        C87412m.m108591d(dVar10);
        dVar10.prepare();
        C99783d dVar62 = this.f293941f.f293949j;
        C87412m.m108591d(dVar62);
        dVar62.setVideoCallback(this.f293941f);
        C99783d dVar72 = this.f293941f.f293949j;
        C87412m.m108591d(dVar72);
        dVar72.setLoop(true);
        C99783d dVar82 = this.f293941f.f293949j;
        C87412m.m108591d(dVar82);
        dVar82.setScaleType(C96814a.C96817e.COVER);
        return C13598b0.f38549a;
    }
}
