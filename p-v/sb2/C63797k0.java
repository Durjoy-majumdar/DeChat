package sb2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.SurfaceTexture;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvSliderSeekBar;
import d03.C58010a;
import di3.C7335d;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59811e;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import o40.C61926c;
import p707tz.C65000f;
import rx3.C13598b0;
import rx3.C36570n;
import sb2.C63774j0;
import sx3.C26236u;
import u23.C65003a;
import ub2.C111151r0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerItemEditUIC$setVideoData$1", mo125469f = "MusicMvMakerItemEditUIC.kt", mo125470l = {219}, mo125471m = "invokeSuspend")
/* renamed from: sb2.k0 */
public final class C63797k0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f180859d;

    /* renamed from: e */
    public final /* synthetic */ C63774j0 f180860e;

    /* renamed from: f */
    public final /* synthetic */ C59811e f180861f;

    /* renamed from: sb2.k0$a */
    public static final class C63798a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180862d;

        /* renamed from: e */
        public final /* synthetic */ C59811e f180863e;

        public C63798a(C63774j0 j0Var, C59811e eVar) {
            this.f180862d = j0Var;
            this.f180863e = eVar;
        }

        public final void run() {
            int paddingStart = this.f180862d.mo88578e3().getPaddingStart();
            int width = this.f180862d.mo88578e3().getWidth() - (paddingStart * 2);
            C63774j0 j0Var = this.f180862d;
            j0Var.f180827v = (((float) width) * 1.0f) / ((float) j0Var.f180826u);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((C36570n) j0Var.f180819n).getValue();
            C63774j0 j0Var2 = this.f180862d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(-((int) (((float) j0Var2.f180824s) * j0Var2.f180827v))));
            aVar.mo10233c(0);
            C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerItemEditUIC$setVideoData$1$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            C59811e.C59820h hVar = this.f180863e.f170731n;
            boolean z = hVar instanceof C59811e.C59821i;
            if (z) {
                C59811e.C59821i iVar = z ? (C59811e.C59821i) hVar : null;
                if (iVar != null) {
                    C63774j0 j0Var3 = this.f180862d;
                    j0Var3.getClass();
                    Class cls = C65000f.class;
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(IFinderVlogFinderService::class.java)");
                    C65003a jt02 = ((C65000f) C86312j.m106911c(cls)).jt0(C65000f.C65001a.m76631a((C65000f) c, iVar.f170744b, false, 2, (Object) null));
                    long j = j0Var3.f180825t;
                    jt02.f187125e = j;
                    jt02.f187121a = 80;
                    jt02.f187122b = 120;
                    jt02.f187126f = (j0Var3.f180827v * ((float) j)) / (((((float) j0Var3.f180806C) * 1.0f) / ((float) 120)) * ((float) 80));
                    jt02.mo89218f();
                    j0Var3.mo88577d3().f180833e = ((C65000f) C86312j.m106911c(cls)).mo89201rK();
                    C63774j0.C63776b d3 = j0Var3.mo88577d3();
                    List b = C26236u.m33719b(jt02);
                    d3.getClass();
                    d3.f180832d.clear();
                    d3.f180832d.addAll(b);
                    d3.notifyDataSetChanged();
                }
            } else {
                boolean z2 = hVar instanceof C59811e.C59817e;
                if (z2) {
                    C59811e.C59817e eVar = z2 ? (C59811e.C59817e) hVar : null;
                    if (eVar != null) {
                        C63774j0 j0Var4 = this.f180862d;
                        C53895h.m60466d(j0Var4.f180808E, (C66212f) null, (C53934p0) null, new C63812m0(j0Var4, eVar, (C15601d<? super C63812m0>) null), 3, (Object) null);
                    }
                }
            }
            MusicMvSliderSeekBar g3 = this.f180862d.mo88580g3();
            g3.getClass();
            g3.post(new C111151r0(g3, width, paddingStart, width));
            this.f180862d.mo88580g3().mo151143f(true, (float) paddingStart);
            this.f180862d.mo88580g3().mo151143f(true, (float) (paddingStart + width));
        }
    }

    /* renamed from: sb2.k0$b */
    public static final class C63799b extends C87413o implements C32226l<SurfaceTexture, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63774j0 f180864d;

        /* renamed from: e */
        public final /* synthetic */ C59811e f180865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63799b(C63774j0 j0Var, C59811e eVar) {
            super(1);
            this.f180864d = j0Var;
            this.f180865e = eVar;
        }

        public Object invoke(Object obj) {
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            C61926c.m72668M(new C63806l0(this.f180864d, this.f180865e));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerItemEditUIC$setVideoData$1$tpMediaInfo$1", mo125469f = "MusicMvMakerItemEditUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.k0$c */
    public static final class C63800c extends C91594j implements C32227p<C0000n0, C15601d<? super C58010a>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C59811e f180866d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63800c(C59811e eVar, C15601d<? super C63800c> dVar) {
            super(2, dVar);
            this.f180866d = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63800c(this.f180866d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63800c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C59811e.C59820h hVar = this.f180866d.f170731n;
            if (hVar != null) {
                return hVar.mo84773f();
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63797k0(C63774j0 j0Var, C59811e eVar, C15601d<? super C63797k0> dVar) {
        super(2, dVar);
        this.f180860e = j0Var;
        this.f180861f = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C63797k0(this.f180860e, this.f180861f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63797k0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0104, code lost:
        if (gy3.C87412m.m108589b(((hb2.C59811e.C59821i) r8).f170744b, ((hb2.C59811e.C59821i) r9).f170744b) != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011d, code lost:
        if (gy3.C87412m.m108589b(r1.mo84760a(), r7.mo84760a()) != false) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f180859d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001a
            if (r2 != r4) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r18
            goto L_0x002f
        L_0x0012:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001a:
            kotlin.ResultKt.throwOnFailure(r18)
            a14.h0 r2 = a14.C53872d1.f151119c
            sb2.k0$c r5 = new sb2.k0$c
            hb2.e r6 = r0.f180861f
            r5.<init>(r6, r3)
            r0.f180859d = r4
            java.lang.Object r2 = a14.C53895h.m60469g(r2, r5, r0)
            if (r2 != r1) goto L_0x002f
            return r1
        L_0x002f:
            d03.a r2 = (d03.C58010a) r2
            if (r2 != 0) goto L_0x0036
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0036:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "setVideoData:"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "MicroMsg.Mv.MusicMvMakerItemEditUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            sb2.j0 r1 = r0.f180860e
            r6 = 0
            r1.f180805B = r6
            r7 = -1
            r1.f180807D = r7
            hb2.e r7 = r0.f180861f
            r1.f180828w = r7
            hb2.e$g r7 = r7.f170730j
            r8 = 2
            if (r7 == 0) goto L_0x006c
            android.widget.ImageView r1 = r1.mo88581i3()
            java.lang.String r9 = "thumbView"
            gy3.C87412m.m108593f(r1, r9)
            r7.mo84764a(r1, r3)
        L_0x006c:
            hb2.e r1 = r0.f180861f
            int r7 = r1.f170726f
            int r1 = r1.f170725e
            int r7 = r7 - r1
            int r1 = nb2.C61645c0.m72363c(r7)
            hb2.e r7 = r0.f180861f
            hb2.e$h r7 = r7.f170731n
            if (r7 == 0) goto L_0x0087
            long r9 = r7.getDurationMs()
            int r7 = (int) r9
            int r7 = nb2.C61645c0.m72361a(r7)
            goto L_0x0088
        L_0x0087:
            r7 = 0
        L_0x0088:
            sb2.j0 r9 = r0.f180860e
            rx3.g r9 = r9.f180817i
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            sb2.j0 r10 = r0.f180860e
            androidx.appcompat.app.AppCompatActivity r10 = r10.getActivity()
            r11 = 2131833329(0x7f1131f1, float:1.9299737E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r12 = new java.lang.Integer
            r12.<init>(r7)
            r8[r6] = r12
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            r8[r4] = r7
            java.lang.String r1 = r10.getString(r11, r8)
            r9.setText(r1)
            bl3.r r1 = bl3.C39818r.f106831a
            sb2.j0 r7 = r0.f180860e
            androidx.appcompat.app.AppCompatActivity r7 = r7.getActivity()
            bl3.r$a r1 = r1.mo62444c(r7)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC> r7 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r7)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMakerFixEditUIC r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMakerFixEditUIC) r1
            hb2.e r7 = r0.f180861f
            r1.getClass()
            java.lang.String r8 = "itemData"
            gy3.C87412m.m108594g(r7, r8)
            java.util.ArrayList<hb2.e> r8 = r1.f163333e
            int r8 = r8.indexOf(r7)
            r9 = -1
            if (r8 != r9) goto L_0x00dc
            goto L_0x0120
        L_0x00dc:
            java.util.ArrayList<hb2.e> r1 = r1.f163333e
            int r8 = r8 + r9
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r8)
            hb2.e r1 = (hb2.C59811e) r1
            if (r1 != 0) goto L_0x00e8
            goto L_0x0120
        L_0x00e8:
            hb2.e$h r8 = r1.f170731n
            boolean r9 = r8 instanceof hb2.C59811e.C59821i
            if (r9 == 0) goto L_0x0107
            hb2.e$h r9 = r7.f170731n
            boolean r10 = r9 instanceof hb2.C59811e.C59821i
            if (r10 == 0) goto L_0x0107
            if (r8 == 0) goto L_0x0120
            if (r9 == 0) goto L_0x0120
            hb2.e$i r8 = (hb2.C59811e.C59821i) r8
            java.lang.String r7 = r8.f170744b
            hb2.e$i r9 = (hb2.C59811e.C59821i) r9
            java.lang.String r8 = r9.f170744b
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0107:
            boolean r8 = r8 instanceof hb2.C59811e.C59817e
            if (r8 == 0) goto L_0x0120
            hb2.e$h r8 = r7.f170731n
            boolean r8 = r8 instanceof hb2.C59811e.C59817e
            if (r8 == 0) goto L_0x0120
            java.lang.String r8 = r1.mo84760a()
            java.lang.String r7 = r7.mo84760a()
            boolean r7 = gy3.C87412m.m108589b(r8, r7)
            if (r7 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r1 = r3
        L_0x0121:
            hb2.e r7 = r0.f180861f
            hb2.e$h r8 = r7.f170731n
            if (r8 == 0) goto L_0x017d
            sb2.j0 r9 = r0.f180860e
            long r10 = r8.mo84772e()
            if (r1 == 0) goto L_0x0132
            hb2.e$h r12 = r1.f170731n
            goto L_0x0133
        L_0x0132:
            r12 = r3
        L_0x0133:
            if (r12 == 0) goto L_0x0169
            hb2.e$h r12 = r1.f170731n
            gy3.C87412m.m108591d(r12)
            long r12 = r12.mo84772e()
            int r14 = r1.f170726f
            int r15 = r1.f170725e
            int r14 = r14 - r15
            long r14 = (long) r14
            long r12 = r12 + r14
            int r14 = r7.f170726f
            int r15 = r7.f170725e
            int r14 = r14 - r15
            long r14 = (long) r14
            long r12 = r12 + r14
            hb2.e$h r14 = r1.f170731n
            gy3.C87412m.m108591d(r14)
            long r14 = r14.getDurationMs()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0169
            hb2.e$h r10 = r1.f170731n
            gy3.C87412m.m108591d(r10)
            long r10 = r10.mo84772e()
            int r12 = r1.f170726f
            int r1 = r1.f170725e
            int r12 = r12 - r1
            long r12 = (long) r12
            long r10 = r10 + r12
        L_0x0169:
            r9.f180824s = r10
            int r1 = r7.f170726f
            int r7 = r7.f170725e
            int r1 = r1 - r7
            long r10 = (long) r1
            r9.f180826u = r10
            long r7 = r8.getDurationMs()
            r9.f180825t = r7
            long r7 = r9.f180824s
            r9.f180807D = r7
        L_0x017d:
            sb2.j0 r1 = r0.f180860e
            androidx.recyclerview.widget.RecyclerView r1 = r1.mo88578e3()
            sb2.k0$a r7 = new sb2.k0$a
            sb2.j0 r8 = r0.f180860e
            hb2.e r9 = r0.f180861f
            r7.<init>(r8, r9)
            r1.post(r7)
            sb2.j0 r1 = r0.f180860e
            r1.mo88583k3()
            sb2.j0 r1 = r0.f180860e
            android.widget.ImageView r1 = r1.mo88581i3()
            r1.setVisibility(r6)
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01a6
            r1.mo81117b()
        L_0x01a6:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01af
            r1.setMediaInfo(r2)
        L_0x01af:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01be
            g03.a r1 = r1.getEffector()
            if (r1 == 0) goto L_0x01be
            r1.mo84448i()
        L_0x01be:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01c8
            j03.a r3 = r1.getPlayer()
        L_0x01c8:
            if (r3 != 0) goto L_0x01cb
            goto L_0x01ce
        L_0x01cb:
            r3.mo85614i(r4)
        L_0x01ce:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01dd
            j03.a r1 = r1.getPlayer()
            if (r1 == 0) goto L_0x01dd
            r1.setMute(r4)
        L_0x01dd:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x01ec
            j03.a r1 = r1.getPlayer()
            if (r1 == 0) goto L_0x01ec
            r1.setLoop(r4)
        L_0x01ec:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            r2 = 0
            if (r1 == 0) goto L_0x01fe
            g03.a r1 = r1.getEffector()
            if (r1 == 0) goto L_0x01fe
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1.mo84443e(r3)
        L_0x01fe:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x021a
            j03.a r1 = r1.getPlayer()
            if (r1 == 0) goto L_0x021a
            sb2.j0 r3 = r0.f180860e
            long r3 = r3.f180824s
            hb2.e r6 = r0.f180861f
            int r7 = r6.f170726f
            int r6 = r6.f170725e
            int r7 = r7 - r6
            long r6 = (long) r7
            long r6 = r6 + r3
            r1.mo85603a(r3, r6)
        L_0x021a:
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x0229
            j03.a r1 = r1.getPlayer()
            if (r1 == 0) goto L_0x0229
            r1.mo85619m()
        L_0x0229:
            sb2.j0 r1 = r0.f180860e
            com.tencent.mm.plugin.mv.ui.view.MusicMvSliderSeekBar r1 = r1.mo88580g3()
            r1.setCursorPos(r2)
            sb2.j0 r1 = r0.f180860e
            j03.c r1 = r1.f180823r
            if (r1 == 0) goto L_0x0247
            j03.a r1 = r1.getPlayer()
            if (r1 == 0) goto L_0x0247
            sb2.j0 r2 = r0.f180860e
            sb2.j0$m r2 = r2.f180809F
            r3 = 30
            r1.mo85620n(r2, r3)
        L_0x0247:
            sb2.j0 r1 = r0.f180860e
            j03.c r2 = r1.f180823r
            if (r2 != 0) goto L_0x024e
            goto L_0x0258
        L_0x024e:
            sb2.k0$b r3 = new sb2.k0$b
            hb2.e r4 = r0.f180861f
            r3.<init>(r1, r4)
            r2.setOnFrameAvailable(r3)
        L_0x0258:
            sb2.j0 r1 = r0.f180860e
            android.graphics.Bitmap r2 = r1.f180830y
            r1.f180804A = r2
            int r2 = r1.f180829x
            r1.f180831z = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setVideoData, firstRenderTime:"
            r1.append(r2)
            sb2.j0 r2 = r0.f180860e
            int r2 = r2.f180829x
            r1.append(r2)
            java.lang.String r2 = ", firstRenderFrame:"
            r1.append(r2)
            sb2.j0 r2 = r0.f180860e
            android.graphics.Bitmap r2 = r2.f180830y
            r1.append(r2)
            java.lang.String r2 = ", backFirstRenderTime:"
            r1.append(r2)
            sb2.j0 r2 = r0.f180860e
            int r2 = r2.f180831z
            r1.append(r2)
            java.lang.String r2 = ", backFirstFrame:"
            r1.append(r2)
            sb2.j0 r2 = r0.f180860e
            android.graphics.Bitmap r2 = r2.f180804A
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            sb2.j0 r1 = r0.f180860e
            sb2.C63774j0.m75027c3(r1)
            sb2.j0 r1 = r0.f180860e
            sb2.j0$m r1 = r1.f180809F
            r2 = 0
            r1.f180845a = r2
            la2.n r1 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
            hb2.e r2 = r0.f180861f
            int r2 = r2.f170725e
            r1.mo32203a(r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63797k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
