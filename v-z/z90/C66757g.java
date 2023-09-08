package z90;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplateOverlayUIC$loadNoRecommendList$1", mo125469f = "MaasAlbumMultiTemplateOverlayUIC.kt", mo125470l = {339, 343}, mo125471m = "invokeSuspend")
/* renamed from: z90.g */
public final class C66757g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f191823d;

    /* renamed from: e */
    public int f191824e;

    /* renamed from: f */
    public final /* synthetic */ C66739c f191825f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66757g(C66739c cVar, C15601d<? super C66757g> dVar) {
        super(2, dVar);
        this.f191825f = cVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66757g(this.f191825f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66757g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0085 A[LOOP:0: B:22:0x007f->B:24:0x0085, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f191824e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r5.f191823d
            java.util.List r0 = (java.util.List) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0068
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0031
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r6)
            qa0.b r6 = qa0.C62586b.f177739a
            r1 = 0
            r5.f191824e = r3
            java.lang.String r3 = "cache_key_finder_album"
            java.lang.Object r6 = r6.mo87645e(r1, r3, r5)
            if (r6 != r0) goto L_0x0031
            return r0
        L_0x0031:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0099
            z90.c r1 = r5.f191825f
            rx3.g r1 = r1.f191782s
            rx3.n r1 = (rx3.C36570n) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x006b
            bl3.r r1 = bl3.C39818r.f106831a
            z90.c r3 = r5.f191825f
            android.app.Activity r3 = r3.getContext()
            bl3.r$a r1 = r1.mo62443b(r3)
            java.lang.Class<la0.a> r3 = la0.C61242a.class
            bl3.c r1 = r1.mo62447c(r3)
            la0.a r1 = (la0.C61242a) r1
            r5.f191823d = r6
            r5.f191824e = r2
            java.lang.Object r1 = r1.mo86205G1(r6, r5)
            if (r1 != r0) goto L_0x0066
            return r0
        L_0x0066:
            r0 = r6
            r6 = r1
        L_0x0068:
            java.util.List r6 = (java.util.List) r6
            goto L_0x006c
        L_0x006b:
            r0 = r6
        L_0x006c:
            z90.c r1 = r5.f191825f
            com.tencent.mm.mj_template.sns.compose.widget.y1 r1 = r1.f191788y
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L_0x007f:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0095
            java.lang.Object r3 = r6.next()
            te3.pr4 r3 = (te3.pr4) r3
            com.tencent.mm.mj_template.sns.compose.widget.n1$d$a r4 = com.tencent.p014mm.mj_template.sns.compose.widget.C55319n1.C55323d.f157561i
            com.tencent.mm.mj_template.sns.compose.widget.n1$d r3 = r4.mo76616a(r3)
            r2.add(r3)
            goto L_0x007f
        L_0x0095:
            r1.mo76620c(r2)
            r6 = r0
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "loadNoRecommendList: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MaasMultiTemplate.MaasAlbumMultiTemplateOverlayUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z90.C66757g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
