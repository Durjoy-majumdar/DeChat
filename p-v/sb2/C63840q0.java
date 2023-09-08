package sb2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.C57067h;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvPreviewTrackUIC$initBgTrackView$2", mo125469f = "MusicMvPreviewTrackUIC.kt", mo125470l = {96}, mo125471m = "invokeSuspend")
/* renamed from: sb2.q0 */
public final class C63840q0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180967d;

    /* renamed from: e */
    public final /* synthetic */ C57067h f180968e;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvPreviewTrackUIC$initBgTrackView$2$1", mo125469f = "MusicMvPreviewTrackUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.q0$a */
    public static final class C63841a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C57067h f180969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63841a(C57067h hVar, C15601d<? super C63841a> dVar) {
            super(2, dVar);
            this.f180969d = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63841a(this.f180969d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63841a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f180969d.mo80499c3().notifyDataSetChanged();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63840q0(C57067h hVar, C15601d<? super C63840q0> dVar) {
        super(2, dVar);
        this.f180968e = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63840q0(this.f180968e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63840q0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006c, code lost:
        r1 = r1.f184740e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r5.f180967d
            r2 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x000e
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x009b
        L_0x000e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0016:
            kotlin.ResultKt.throwOnFailure(r6)
            com.tencent.mm.plugin.mv.ui.uic.h r6 = r5.f180968e
            bl3.r r1 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r3 = r6.getActivity()
            bl3.r$a r1 = r1.mo62444c(r3)
            java.lang.Class<sb2.o0> r3 = sb2.C63830o0.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            sb2.o0 r1 = (sb2.C63830o0) r1
            java.util.LinkedList r1 = r1.mo88627d3()
            r6.getClass()
            java.lang.String r3 = "<set-?>"
            gy3.C87412m.m108594g(r1, r3)
            r6.f163410g = r1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "initBgTrackView size:"
            r6.append(r1)
            com.tencent.mm.plugin.mv.ui.uic.h r1 = r5.f180968e
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.uic.h$a> r1 = r1.f163408e
            int r1 = r1.size()
            r6.append(r1)
            java.lang.String r1 = ", mediaInfoList.size:"
            r6.append(r1)
            com.tencent.mm.plugin.mv.ui.uic.h r1 = r5.f180968e
            java.util.LinkedList<i03.d> r1 = r1.f163410g
            int r1 = r1.size()
            r6.append(r1)
            java.lang.String r1 = ", trackData?.refObjectList.size:"
            r6.append(r1)
            com.tencent.mm.plugin.mv.ui.uic.h r1 = r5.f180968e
            te3.p23 r1 = r1.f163407d
            r3 = 0
            if (r1 == 0) goto L_0x007a
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r1 = r1.f184740e
            if (r1 == 0) goto L_0x007a
            int r1 = r1.size()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r1)
            goto L_0x007b
        L_0x007a:
            r4 = r3
        L_0x007b:
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "MicroMsg.Mv.MusicMvPreviewTrackUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            a14.h0 r6 = a14.C53872d1.f151117a
            a14.k2 r6 = f14.C58901s.f168555a
            sb2.q0$a r1 = new sb2.q0$a
            com.tencent.mm.plugin.mv.ui.uic.h r4 = r5.f180968e
            r1.<init>(r4, r3)
            r5.f180967d = r2
            java.lang.Object r6 = a14.C53895h.m60469g(r6, r1, r5)
            if (r6 != r0) goto L_0x009b
            return r0
        L_0x009b:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63840q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
