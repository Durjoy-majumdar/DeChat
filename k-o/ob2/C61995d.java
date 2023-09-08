package ob2;

import a14.C0000n0;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.vlog.model.C57468y;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import i03.C60241d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import p707tz.C65000f;
import rx3.C13598b0;
import sb2.C63830o0;
import sx3.C36907w;
import te3.C64621p23;
import u23.C65003a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.free.MusicMvFlexPreviewTrackUIC$initBgTrackView$4", mo125469f = "MusicMvFlexPreviewTrackUIC.kt", mo125470l = {300}, mo125471m = "invokeSuspend")
/* renamed from: ob2.d */
public final class C61995d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f176243d;

    /* renamed from: e */
    public final /* synthetic */ C64621p23 f176244e;

    /* renamed from: f */
    public final /* synthetic */ C61999g f176245f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.free.MusicMvFlexPreviewTrackUIC$initBgTrackView$4$tracks$1", mo125469f = "MusicMvFlexPreviewTrackUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ob2.d$a */
    public static final class C61996a extends C91594j implements C32227p<C0000n0, C15601d<? super List<? extends C65003a>>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C61999g f176246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61996a(C61999g gVar, C15601d<? super C61996a> dVar) {
            super(2, dVar);
            this.f176246d = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61996a(this.f176246d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61996a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C65003a aVar;
            Class cls = C65000f.class;
            ResultKt.throwOnFailure(obj);
            LinkedList<C60241d> d3 = ((C63830o0) C39818r.f106831a.mo62444c(this.f176246d.getActivity()).mo75002a(C63830o0.class)).mo88627d3();
            ArrayList<C60241d> arrayList = new ArrayList<>();
            for (T next : d3) {
                if (!((C60241d) next).f165941m) {
                    arrayList.add(next);
                }
            }
            C61999g gVar = this.f176246d;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (C60241d dVar : arrayList) {
                if (dVar.f165933e || dVar.mo85229a()) {
                    String str = dVar.f165948t;
                    C87412m.m108593f(str, "mediaInfo.path");
                    C57468y MF = ((C65000f) C86312j.m106911c(cls)).mo89171MF(str, dVar.mo85229a());
                    MF.mo81190d(dVar.f165944p);
                    MF.mo81188b(dVar.f165944p + dVar.f165943o);
                    MF.mo81191e(dVar.f165942n);
                    MF.mo81187a(dVar.f165942n + dVar.f165943o);
                    aVar = dVar.mo85229a() ? ((C65000f) C86312j.m106911c(cls)).mo89185bt(MF) : ((C65000f) C86312j.m106911c(cls)).jt0(MF);
                } else {
                    aVar = ((C65000f) C86312j.m106911c(cls)).mo89204uV(dVar);
                }
                long j = dVar.f165944p;
                aVar.f187124d = j;
                aVar.f187125e = j + dVar.f165943o;
                aVar.f187121a = gVar.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6);
                aVar.f187122b = gVar.getResources().getDimensionPixelSize(C0966R.dimen.f3755d6);
                arrayList2.add(aVar);
            }
            return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61995d(C64621p23 p232, C61999g gVar, C15601d<? super C61995d> dVar) {
        super(2, dVar);
        this.f176244e = p232;
        this.f176245f = gVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61995d(this.f176244e, this.f176245f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61995d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r0 = r0.f183456e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f176243d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            if (r1 != r2) goto L_0x000e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x002b
        L_0x000e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0016:
            kotlin.ResultKt.throwOnFailure(r10)
            a14.h0 r10 = a14.C53872d1.f151119c
            ob2.d$a r1 = new ob2.d$a
            ob2.g r4 = r9.f176245f
            r1.<init>(r4, r3)
            r9.f176243d = r2
            java.lang.Object r10 = a14.C53895h.m60469g(r10, r1, r9)
            if (r10 != r0) goto L_0x002b
            return r0
        L_0x002b:
            java.util.List r10 = (java.util.List) r10
            te3.p23 r0 = r9.f176244e
            te3.hb1 r0 = r0.f184744i
            if (r0 == 0) goto L_0x0040
            te3.kb1 r0 = r0.f183456e
            if (r0 == 0) goto L_0x0040
            int r0 = r0.f183918u
            long r0 = (long) r0
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r0)
            goto L_0x0041
        L_0x0040:
            r4 = r3
        L_0x0041:
            if (r4 == 0) goto L_0x0104
            ob2.g r0 = r9.f176245f
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r0.f176250d
            java.lang.String r1 = "tracksEditView"
            if (r0 == 0) goto L_0x0100
            long r4 = r4.longValue()
            java.lang.String r6 = "tracks"
            gy3.C87412m.m108594g(r10, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "update: "
            r6.append(r7)
            int r7 = r10.size()
            r6.append(r7)
            java.lang.String r7 = " tracks, songDuration="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = ", thumbDuration="
            r6.append(r7)
            int r7 = r0.f163704f
            float r7 = (float) r7
            float r8 = r0.getWidthPerMills()
            float r7 = r7 / r8
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.MvTracksEditView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r0.f163708j = r10
            r0.f163719x = r4
            vb2.c r6 = r0.f163716u
            r6.f188661o = r4
            r0.mo80656b()
            vb2.b r4 = r0.f163715t
            long r5 = r0.f163720y
            r4.mo89648a(r5)
            r0.mo80659e()
            vb2.g r4 = r0.f163718w
            java.util.LinkedList<java.lang.Integer> r4 = r4.f188694q
            r4.clear()
            androidx.appcompat.widget.AppCompatImageView r4 = r0.f163703e
            r5 = 0
            r4.setVisibility(r5)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f163702d
            r4.mo17035V0()
            vb2.d r0 = r0.f163705g
            r0.notifyDataSetChanged()
            ob2.g r0 = r9.f176245f
            java.util.Iterator r10 = r10.iterator()
            r4 = 0
        L_0x00bc:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00fd
            java.lang.Object r6 = r10.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x00f9
            u23.a r6 = (u23.C65003a) r6
            com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r6 = r0.f176250d
            if (r6 == 0) goto L_0x00f5
            java.util.LinkedList<te3.mb1> r8 = r0.f176254h
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r8.get(r4)
            te3.mb1 r8 = (te3.C64550mb1) r8
            java.lang.String r8 = r8.f184268q
            if (r8 == 0) goto L_0x00e7
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r8 = 0
            goto L_0x00e8
        L_0x00e7:
            r8 = 1
        L_0x00e8:
            r8 = r8 ^ r2
            r6.mo80657c(r4, r8)
            r4 = r7
            goto L_0x00bc
        L_0x00ee:
            java.lang.String r10 = "trackList"
            gy3.C87412m.m108603p(r10)
            throw r3
        L_0x00f5:
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x00f9:
            sx3.C64197v.m75542k()
            throw r3
        L_0x00fd:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        L_0x0100:
            gy3.C87412m.m108603p(r1)
            throw r3
        L_0x0104:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Couldn't get the duration of song"
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ob2.C61995d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
