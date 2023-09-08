package p532g5;

import a14.C0000n0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import fy3.C32227p;
import gy3.C87412m;
import iy3.C60641c;
import kotlin.ResultKt;
import p1104d1.C106969c;
import p1105d5.C106994f;
import p1166z0.C112545k;
import p175j0.C108494d2;
import p532g5.C59349d;
import p632o5.C109952d;
import p632o5.C109954f;
import p632o5.C109956h;
import p632o5.C109959i;
import p632o5.C109963m;
import p643p5.C110166b;
import p643p5.C110168e;
import p643p5.C35367c;
import rx3.C13598b0;
import rx3.C13603j;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "coil.compose.ImagePainter$execute$1", mo125469f = "ImagePainter.kt", mo125470l = {210}, mo125471m = "invokeSuspend")
/* renamed from: g5.e */
public final class C107735e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f322400d;

    /* renamed from: e */
    public int f322401e;

    /* renamed from: f */
    public final /* synthetic */ C59349d f322402f;

    /* renamed from: g */
    public final /* synthetic */ C59349d.C59352b f322403g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107735e(C59349d dVar, C59349d.C59352b bVar, C15601d<? super C107735e> dVar2) {
        super(2, dVar2);
        this.f322402f = dVar;
        this.f322403g = bVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C107735e(this.f322402f, this.f322403g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107735e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C59349d dVar;
        Object obj2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f322401e;
        C106969c cVar = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C59349d dVar2 = this.f322402f;
            C106994f fVar = (C106994f) ((C108494d2) dVar2.f169657w).getValue();
            C59349d dVar3 = this.f322402f;
            C59349d.C59352b bVar = this.f322403g;
            C109956h hVar = bVar.f169661b;
            long j = bVar.f169662c;
            dVar3.getClass();
            Context context = hVar.f328992a;
            hVar.getClass();
            C87412m.m108594g(context, "context");
            C109956h.C109957a aVar2 = new C109956h.C109957a(hVar, context);
            aVar2.f329031d = new C107736f(dVar3);
            aVar2.f329025H = null;
            aVar2.f329026I = null;
            aVar2.f329027J = null;
            if (hVar.f328990G.f328968b == null) {
                if (j != C112545k.f336974c) {
                    aVar2.f329042o = new C35367c(new PixelSize(C60641c.m70921b(C112545k.m153758d(j)), C60641c.m70921b(C112545k.m153756b(j))));
                    aVar2.f329025H = null;
                    aVar2.f329026I = null;
                    aVar2.f329027J = null;
                } else {
                    OriginalSize originalSize = OriginalSize.f309027d;
                    C87412m.m108594g(originalSize, "size");
                    aVar2.f329042o = new C35367c(originalSize);
                    aVar2.f329025H = null;
                    aVar2.f329026I = null;
                    aVar2.f329027J = null;
                }
            }
            C109952d dVar4 = hVar.f328990G;
            if (dVar4.f328969c == null) {
                aVar2.f329043p = C110168e.FILL;
            }
            if (dVar4.f328972f != C110166b.EXACT) {
                aVar2.f329046s = C110166b.INEXACT;
            }
            C109956h a = aVar2.mo161284a();
            this.f322400d = dVar2;
            this.f322401e = 1;
            Object a2 = fVar.mo157443a(a, this);
            if (a2 == aVar) {
                return aVar;
            }
            dVar = dVar2;
            obj = a2;
        } else if (i == 1) {
            dVar = (C59349d) this.f322400d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C109959i iVar = (C109959i) obj;
        if (iVar instanceof C109963m) {
            C109963m mVar = (C109963m) iVar;
            obj2 = new C59349d.C59353c.C59357d(C107737g.m145938b(mVar.f329059a), mVar);
        } else if (iVar instanceof C109954f) {
            Drawable a3 = iVar.mo161275a();
            if (a3 != null) {
                cVar = C107737g.m145938b(a3);
            }
            obj2 = new C59349d.C59353c.C59355b(cVar, (C109954f) iVar);
        } else {
            throw new C13603j();
        }
        ((C108494d2) dVar.f169655u).setValue(obj2);
        return C13598b0.f38549a;
    }
}
