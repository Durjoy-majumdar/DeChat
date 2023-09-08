package sb2;

import a14.C0000n0;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import d03.C58010a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import hb2.C59811e;
import iy3.C60641c;
import kotlin.ResultKt;
import la2.C99364n;
import m03.C61431n;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$refreshVideo$1", mo125469f = "MusicMvMakerFixEditUIC.kt", mo125470l = {543}, mo125471m = "invokeSuspend")
/* renamed from: sb2.y */
public final class C63874y extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f181063d;

    /* renamed from: e */
    public Object f181064e;

    /* renamed from: f */
    public long f181065f;

    /* renamed from: g */
    public int f181066g;

    /* renamed from: h */
    public final /* synthetic */ int f181067h;

    /* renamed from: i */
    public final /* synthetic */ MusicMvMakerFixEditUIC f181068i;

    /* renamed from: sb2.y$a */
    public static final class C63875a implements C61431n {

        /* renamed from: a */
        public long f181069a;

        /* renamed from: b */
        public final /* synthetic */ C59811e f181070b;

        /* renamed from: c */
        public final /* synthetic */ long f181071c;

        /* renamed from: d */
        public final /* synthetic */ RecyclerView.C16631z f181072d;

        /* renamed from: sb2.y$a$a */
        public static final class C63876a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C59811e f181073d;

            /* renamed from: e */
            public final /* synthetic */ C63875a f181074e;

            /* renamed from: f */
            public final /* synthetic */ long f181075f;

            /* renamed from: g */
            public final /* synthetic */ long f181076g;

            /* renamed from: h */
            public final /* synthetic */ RecyclerView.C16631z f181077h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63876a(C59811e eVar, C63875a aVar, long j, long j2, RecyclerView.C16631z zVar) {
                super(0);
                this.f181073d = eVar;
                this.f181074e = aVar;
                this.f181075f = j;
                this.f181076g = j2;
                this.f181077h = zVar;
            }

            public Object invoke() {
                if (this.f181073d.f170728h) {
                    int playPosition = C99364n.m129616h().mo138822a().getPlayPosition();
                    C59811e eVar = this.f181073d;
                    int i = eVar.f170726f;
                    int i2 = i - eVar.f170725e;
                    C59811e.C59820h hVar = eVar.f170731n;
                    C59811e.C59821i iVar = hVar instanceof C59811e.C59821i ? (C59811e.C59821i) hVar : null;
                    boolean z = true;
                    int i3 = 0;
                    if (iVar == null || !iVar.f170748f) {
                        z = false;
                    }
                    if (z) {
                        if (playPosition > i && ((long) playPosition) != this.f181074e.f181069a && eVar.f170729i) {
                            Log.m105918d("MicroMsg.Mv.MusicMvMakerFixEditUIC", "musicTimeMs:" + playPosition + ", lastPlayPos:" + this.f181074e.f181069a + ", item startMs:" + this.f181073d.f170725e + ", item endMs:" + this.f181073d.f170726f + ", loop");
                            C99364n.m129616h().mo138822a().mo32203a(this.f181073d.f170725e);
                        }
                        this.f181074e.f181069a = (long) playPosition;
                        if (i2 > 0) {
                            C59811e eVar2 = this.f181073d;
                            int i4 = eVar2.f170725e;
                            i3 = C60641c.m70921b((((float) (playPosition - i4)) * 100.0f) / ((float) (eVar2.f170726f - i4)));
                        }
                    } else {
                        if (i2 > 0) {
                            i3 = C60641c.m70921b((((float) (this.f181075f - this.f181076g)) * 100.0f) / ((float) i2));
                        }
                        if (this.f181074e.f181069a > this.f181075f && this.f181073d.f170729i) {
                            Log.m105918d("MicroMsg.Mv.MusicMvMakerFixEditUIC", "musicTimeMs:" + playPosition + ", lastPlayPos:" + this.f181074e.f181069a + ", timeMs:" + this.f181075f + ", startMs:" + this.f181076g);
                            C99364n.m129616h().mo138822a().mo32203a(this.f181073d.f170725e);
                        }
                        this.f181074e.f181069a = this.f181075f;
                    }
                    ((ProgressBar) this.f181077h.f44854d.findViewById(C0966R.C0970id.hr_)).setProgress(i3);
                }
                return C13598b0.f38549a;
            }
        }

        public C63875a(C59811e eVar, long j, RecyclerView.C16631z zVar) {
            this.f181070b = eVar;
            this.f181071c = j;
            this.f181072d = zVar;
        }

        /* renamed from: a */
        public void mo79982a(C58010a aVar, long j) {
            C61926c.m72668M(new C63876a(this.f181070b, this, j, this.f181071c, this.f181072d));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC$refreshVideo$1$tpMediaInfo$1", mo125469f = "MusicMvMakerFixEditUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.y$b */
    public static final class C63877b extends C91594j implements C32227p<C0000n0, C15601d<? super C58010a>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59811e f181078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63877b(C59811e eVar, C15601d<? super C63877b> dVar) {
            super(2, dVar);
            this.f181078d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63877b(this.f181078d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63877b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59811e.C59820h hVar = this.f181078d.f170731n;
            if (hVar != null) {
                return hVar.mo84773f();
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63874y(int i, MusicMvMakerFixEditUIC musicMvMakerFixEditUIC, C15601d<? super C63874y> dVar) {
        super(2, dVar);
        this.f181067h = i;
        this.f181068i = musicMvMakerFixEditUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63874y(this.f181067h, this.f181068i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63874y) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        r14 = r14.getPlayer();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r13.f181066g
            r2 = 1
            r3 = 0
            java.lang.String r4 = "MicroMsg.Mv.MusicMvMakerFixEditUIC"
            r5 = 0
            if (r1 == 0) goto L_0x0024
            if (r1 != r2) goto L_0x001c
            long r0 = r13.f181065f
            java.lang.Object r6 = r13.f181064e
            hb2.e r6 = (hb2.C59811e) r6
            java.lang.Object r7 = r13.f181063d
            androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.C16631z) r7
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x010c
        L_0x001c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0024:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "refreshVideo: "
            r14.append(r1)
            int r1 = r13.f181067h
            r14.append(r1)
            r1 = 32
            r14.append(r1)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r1 = r13.f181068i
            int r1 = r1.f163341p
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r4, r14, r1)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            int r1 = r14.f163341p
            if (r1 < 0) goto L_0x00b0
            j03.c r14 = r14.f163348w
            if (r14 == 0) goto L_0x0064
            j03.a r14 = r14.getPlayer()
            if (r14 == 0) goto L_0x0064
            boolean r14 = r14.isPlaying()
            if (r14 != r2) goto L_0x0064
            r14 = 1
            goto L_0x0065
        L_0x0064:
            r14 = 0
        L_0x0065:
            if (r14 == 0) goto L_0x00b0
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            java.util.ArrayList<hb2.e> r1 = r14.f163333e
            int r14 = r14.f163341p
            java.lang.Object r14 = r1.get(r14)
            java.lang.String r1 = "dataList[lastPos]"
            gy3.C87412m.m108593f(r14, r1)
            r10 = r14
            hb2.e r10 = (hb2.C59811e) r10
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            j03.c r14 = r14.f163348w
            if (r14 == 0) goto L_0x008b
            j03.a r14 = r14.getPlayer()
            if (r14 == 0) goto L_0x008b
            i03.a r14 = r14.getReportInfo()
            r11 = r14
            goto L_0x008c
        L_0x008b:
            r11 = r5
        L_0x008c:
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            j03.c r14 = r14.f163348w
            if (r14 == 0) goto L_0x009e
            g03.a r14 = r14.getEffector()
            if (r14 == 0) goto L_0x009e
            i03.b r14 = r14.getReportInfo()
            r12 = r14
            goto L_0x009f
        L_0x009e:
            r12 = r5
        L_0x009f:
            hb2.q r6 = hb2.C59833q.f170832a
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            androidx.appcompat.app.AppCompatActivity r7 = r14.getActivity()
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            te3.p23 r8 = r14.f163344s
            int r9 = r14.f163341p
            r6.mo84798j(r7, r8, r9, r10, r11, r12)
        L_0x00b0:
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            com.tencent.mm.view.recyclerview.WxRecyclerView r14 = r14.mo80476g3()
            int r1 = r13.f181067h
            androidx.recyclerview.widget.RecyclerView$z r7 = r14.mo17023I0(r1)
            if (r7 != 0) goto L_0x00c1
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x00c1:
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            java.util.ArrayList<hb2.e> r14 = r14.f163333e
            int r1 = r13.f181067h
            java.lang.Object r14 = r14.get(r1)
            java.lang.String r1 = "dataList[position]"
            gy3.C87412m.m108593f(r14, r1)
            r6 = r14
            hb2.e r6 = (hb2.C59811e) r6
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r14 = r13.f181068i
            int r1 = r13.f181067h
            r14.f163341p = r1
            boolean r14 = r6.f170729i
            if (r14 == 0) goto L_0x00ea
            la2.n r14 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r14 = r14.mo138822a()
            int r1 = r6.f170725e
            r14.mo32203a(r1)
        L_0x00ea:
            hb2.e$h r14 = r6.f170731n
            if (r14 == 0) goto L_0x00f3
            long r8 = r14.mo84772e()
            goto L_0x00f5
        L_0x00f3:
            r8 = 0
        L_0x00f5:
            a14.h0 r14 = a14.C53872d1.f151119c
            sb2.y$b r1 = new sb2.y$b
            r1.<init>(r6, r5)
            r13.f181063d = r7
            r13.f181064e = r6
            r13.f181065f = r8
            r13.f181066g = r2
            java.lang.Object r14 = a14.C53895h.m60469g(r14, r1, r13)
            if (r14 != r0) goto L_0x010b
            return r0
        L_0x010b:
            r0 = r8
        L_0x010c:
            d03.a r14 = (d03.C58010a) r14
            if (r14 != 0) goto L_0x0113
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        L_0x0113:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "refreshVideo mediaInfo:"
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            android.view.View r4 = r7.f44854d
            r8 = 2131316141(0x7f094dad, float:1.8250755E38)
            android.view.View r4 = r4.findViewById(r8)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r8 = r13.f181068i
            j03.c r8 = r8.f163348w
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x013e
            android.view.View r8 = (android.view.View) r8
            goto L_0x013f
        L_0x013e:
            r8 = r5
        L_0x013f:
            if (r8 == 0) goto L_0x0146
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x0147
        L_0x0146:
            r8 = r5
        L_0x0147:
            if (r8 == 0) goto L_0x0176
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r8 = r13.f181068i
            j03.c r8 = r8.f163348w
            boolean r9 = r8 instanceof android.view.View
            if (r9 == 0) goto L_0x0154
            android.view.View r8 = (android.view.View) r8
            goto L_0x0155
        L_0x0154:
            r8 = r5
        L_0x0155:
            if (r8 == 0) goto L_0x015c
            android.view.ViewParent r8 = r8.getParent()
            goto L_0x015d
        L_0x015c:
            r8 = r5
        L_0x015d:
            boolean r9 = r8 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0164
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0165
        L_0x0164:
            r8 = r5
        L_0x0165:
            if (r8 == 0) goto L_0x0176
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r9 = r13.f181068i
            j03.c r9 = r9.f163348w
            java.lang.String r10 = "null cannot be cast to non-null type android.view.View"
            gy3.C87412m.m108592e(r9, r10)
            android.view.View r9 = (android.view.View) r9
            r8.removeView(r9)
        L_0x0176:
            r4.removeAllViews()
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r8.<init>(r9, r9)
            r9 = 17
            r8.gravity = r9
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r9 = r13.f181068i
            j03.c r9 = r9.f163348w
            boolean r10 = r9 instanceof android.view.View
            if (r10 == 0) goto L_0x018e
            android.view.View r9 = (android.view.View) r9
            goto L_0x018f
        L_0x018e:
            r9 = r5
        L_0x018f:
            if (r9 == 0) goto L_0x0194
            r4.addView(r9, r8)
        L_0x0194:
            android.view.View r4 = r7.f44854d
            r8 = 2131310758(0x7f0938a6, float:1.8239837E38)
            android.view.View r4 = r4.findViewById(r8)
            android.widget.ProgressBar r4 = (android.widget.ProgressBar) r4
            r4.setProgress(r3)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r3 = r13.f181068i
            j03.c r3 = r3.f163348w
            if (r3 == 0) goto L_0x0212
            r3.mo81117b()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x01b2
            r5 = r3
            android.view.View r5 = (android.view.View) r5
        L_0x01b2:
            if (r5 != 0) goto L_0x01b5
            goto L_0x01b8
        L_0x01b5:
            r5.setKeepScreenOn(r2)
        L_0x01b8:
            j03.a r4 = r3.getPlayer()
            if (r4 == 0) goto L_0x01c1
            r4.mo85609g()
        L_0x01c1:
            r3.setMediaInfo(r14)
            j03.a r14 = r3.getPlayer()
            if (r14 != 0) goto L_0x01cb
            goto L_0x01ce
        L_0x01cb:
            r14.mo85614i(r2)
        L_0x01ce:
            j03.a r14 = r3.getPlayer()
            if (r14 == 0) goto L_0x01d7
            r14.setMute(r2)
        L_0x01d7:
            j03.a r14 = r3.getPlayer()
            if (r14 == 0) goto L_0x01e0
            r14.setLoop(r2)
        L_0x01e0:
            g03.a r14 = r3.getEffector()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14.mo84443e(r2)
            j03.a r14 = r3.getPlayer()
            if (r14 == 0) goto L_0x01f9
            int r2 = r6.f170726f
            int r4 = r6.f170725e
            int r2 = r2 - r4
            long r4 = (long) r2
            long r4 = r4 + r0
            r14.mo85603a(r0, r4)
        L_0x01f9:
            j03.a r14 = r3.getPlayer()
            if (r14 == 0) goto L_0x0202
            r14.mo85619m()
        L_0x0202:
            j03.a r14 = r3.getPlayer()
            if (r14 == 0) goto L_0x0212
            sb2.y$a r2 = new sb2.y$a
            r2.<init>(r6, r0, r7)
            r0 = 30
            r14.mo85620n(r2, r0)
        L_0x0212:
            rx3.b0 r14 = rx3.C13598b0.f38549a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63874y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
