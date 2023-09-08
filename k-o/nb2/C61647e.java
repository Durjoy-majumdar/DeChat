package nb2;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar;
import com.tencent.p014mm.plugin.p081mv.p082ui.adapter.MusicLyricLayoutManager;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import jb2.C46461j;
import je1.C46523h2;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nq1.C61888c;
import ob0.C47350c;
import p529fv.C59325i;
import p529fv.C59326j;
import p599lr.C61381b;
import p640ox.C77049b;
import qc0.C101093a;
import qq1.C63317a;
import rq1.C63488a;
import sb2.C13643k1;
import sb2.C63756e;
import sb2.C63807m;
import sb2.C63849t0;
import sn0.C90259e;
import sx3.C110826x0;
import te3.C49031co1;
import te3.C64263bo1;
import te3.C64488kb1;
import te3.C64793w23;
import tr1.C14063b;
import ub2.C65306q0;
import wp1.C15585f;

/* renamed from: nb2.e */
public final class C61647e extends C60896i<C61646d> {

    /* renamed from: e */
    public final AppCompatActivity f175299e;

    /* renamed from: f */
    public final C13643k1 f175300f = new C13643k1();

    /* renamed from: g */
    public boolean f175301g;

    /* renamed from: h */
    public final Runnable f175302h = new C61650c(this);

    /* renamed from: i */
    public boolean f175303i;

    /* renamed from: j */
    public boolean f175304j;

    /* renamed from: nb2.e$a */
    public final class C61648a implements Runnable {

        /* renamed from: d */
        public final View f175305d;

        /* renamed from: e */
        public final C59822f f175306e;

        /* renamed from: f */
        public final /* synthetic */ C61647e f175307f;

        public C61648a(C61647e eVar, View view, C59822f fVar) {
            C87412m.m108594g(view, "view");
            C87412m.m108594g(fVar, "mv");
            this.f175307f = eVar;
            this.f175305d = view;
            this.f175306e = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
            if (r7 == false) goto L_0x006e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.Class<sb2.m> r0 = sb2.C63807m.class
                android.view.View r1 = r10.f175305d
                if (r1 == 0) goto L_0x0101
                nb2.e r2 = r10.f175307f
                r3 = 2
                int[] r3 = new int[r3]     // Catch:{ all -> 0x0101 }
                r1.getLocationInWindow(r3)     // Catch:{ all -> 0x0101 }
                r4 = 0
                r5 = r3[r4]     // Catch:{ all -> 0x0101 }
                java.lang.String r6 = "MicroMsg.Mv.MvItemConvert"
                if (r5 <= 0) goto L_0x00e8
                r5 = 1
                r7 = r3[r5]     // Catch:{ all -> 0x0101 }
                if (r7 > 0) goto L_0x001c
                goto L_0x00e8
            L_0x001c:
                boolean r3 = r2.f175301g     // Catch:{ all -> 0x0101 }
                if (r3 == 0) goto L_0x0027
                java.lang.String r0 = "has show, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x0101 }
                goto L_0x0101
            L_0x0027:
                bl3.r r3 = bl3.C39818r.f106831a     // Catch:{ all -> 0x0101 }
                androidx.appcompat.app.AppCompatActivity r7 = r2.f175299e     // Catch:{ all -> 0x0101 }
                bl3.r$a r7 = r3.mo62444c(r7)     // Catch:{ all -> 0x0101 }
                java.lang.Class<sb2.o> r8 = sb2.C63816o.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r8)     // Catch:{ all -> 0x0101 }
                sb2.o r7 = (sb2.C63816o) r7     // Catch:{ all -> 0x0101 }
                boolean r7 = r7.f180919r     // Catch:{ all -> 0x0101 }
                if (r7 == 0) goto L_0x003d
                goto L_0x0101
            L_0x003d:
                androidx.appcompat.app.AppCompatActivity r7 = r2.f175299e     // Catch:{ all -> 0x0101 }
                bl3.r$a r7 = r3.mo62444c(r7)     // Catch:{ all -> 0x0101 }
                androidx.lifecycle.i0 r7 = r7.mo75002a(r0)     // Catch:{ all -> 0x0101 }
                sb2.m r7 = (sb2.C63807m) r7     // Catch:{ all -> 0x0101 }
                com.tencent.mm.plugin.finder.view.e1 r8 = r7.f180878d     // Catch:{ all -> 0x0101 }
                if (r8 == 0) goto L_0x0055
                boolean r8 = r8.mo79924b()     // Catch:{ all -> 0x0101 }
                if (r8 != r5) goto L_0x0055
                r8 = 1
                goto L_0x0056
            L_0x0055:
                r8 = 0
            L_0x0056:
                if (r8 != 0) goto L_0x006d
                lq1.e r7 = r7.f180879e     // Catch:{ all -> 0x0101 }
                if (r7 == 0) goto L_0x006a
                com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer r7 = r7.f174510a     // Catch:{ all -> 0x0101 }
                if (r7 == 0) goto L_0x0065
                boolean r7 = r7.mo82541i()     // Catch:{ all -> 0x0101 }
                goto L_0x0066
            L_0x0065:
                r7 = 0
            L_0x0066:
                if (r7 != r5) goto L_0x006a
                r7 = 1
                goto L_0x006b
            L_0x006a:
                r7 = 0
            L_0x006b:
                if (r7 == 0) goto L_0x006e
            L_0x006d:
                r4 = 1
            L_0x006e:
                if (r4 == 0) goto L_0x0072
                goto L_0x0101
            L_0x0072:
                f40.o r4 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0101 }
                com.tencent.mm.storage.v1 r4 = r4.mo121142i()     // Catch:{ all -> 0x0101 }
                com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MUSIC_MV_SHOW_TIPS_POPUP_WINDOW_BOOLEAN_SYNC     // Catch:{ all -> 0x0101 }
                java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0101 }
                java.lang.Object r4 = r4.mo119685f(r7, r8)     // Catch:{ all -> 0x0101 }
                java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0101 }
                boolean r4 = gy3.C87412m.m108589b(r4, r8)     // Catch:{ all -> 0x0101 }
                if (r4 == 0) goto L_0x0090
                java.lang.String r0 = "has showed MusicMvTipsPopup window"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x0101 }
                goto L_0x0101
            L_0x0090:
                androidx.appcompat.app.AppCompatActivity r4 = r2.f175299e     // Catch:{ all -> 0x0101 }
                bl3.r$a r4 = r3.mo62444c(r4)     // Catch:{ all -> 0x0101 }
                androidx.lifecycle.i0 r0 = r4.mo75002a(r0)     // Catch:{ all -> 0x0101 }
                sb2.m r0 = (sb2.C63807m) r0     // Catch:{ all -> 0x0101 }
                ub2.q0 r0 = r0.f180881g     // Catch:{ all -> 0x0101 }
                hb2.f r4 = r10.f175306e     // Catch:{ all -> 0x0101 }
                r0.getClass()     // Catch:{ all -> 0x0101 }
                java.lang.String r9 = "musicMv"
                gy3.C87412m.m108594g(r4, r9)     // Catch:{ all -> 0x0101 }
                r0.f187975o = r4     // Catch:{ all -> 0x0101 }
                androidx.appcompat.app.AppCompatActivity r4 = r2.f175299e     // Catch:{ all -> 0x0101 }
                bl3.r$a r3 = r3.mo62444c(r4)     // Catch:{ all -> 0x0101 }
                java.lang.Class<sb2.t0> r4 = sb2.C63849t0.class
                androidx.lifecycle.i0 r3 = r3.mo75002a(r4)     // Catch:{ all -> 0x0101 }
                sb2.t0 r3 = (sb2.C63849t0) r3     // Catch:{ all -> 0x0101 }
                androidx.appcompat.app.AppCompatActivity r4 = r2.f175299e     // Catch:{ all -> 0x0101 }
                android.text.SpannableString r3 = r3.mo88640e3(r4)     // Catch:{ all -> 0x0101 }
                android.widget.TextView r4 = r0.f187971h     // Catch:{ all -> 0x0101 }
                r4.setText(r3)     // Catch:{ all -> 0x0101 }
                r3 = 10000(0x2710, double:4.9407E-320)
                r0.f187976p = r3     // Catch:{ all -> 0x0101 }
                androidx.appcompat.app.AppCompatActivity r3 = r2.f175299e     // Catch:{ all -> 0x0101 }
                r4 = 4
                kg3.C76577a.m92151b(r3, r4)     // Catch:{ all -> 0x0101 }
                r0.mo89416c(r1)     // Catch:{ all -> 0x0101 }
                r0.mo89415b()     // Catch:{ all -> 0x0101 }
                r2.f175301g = r5     // Catch:{ all -> 0x0101 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0101 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x0101 }
                r0.mo119677K(r7, r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r0 = "show MusicMvTipsPopup window"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ all -> 0x0101 }
                goto L_0x0101
            L_0x00e8:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r0.<init>()     // Catch:{ all -> 0x0101 }
                java.lang.String r1 = "invalid pos("
                r0.append(r1)     // Catch:{ all -> 0x0101 }
                r0.append(r3)     // Catch:{ all -> 0x0101 }
                java.lang.String r1 = "), return"
                r0.append(r1)     // Catch:{ all -> 0x0101 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0101 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ all -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb2.C61647e.C61648a.run():void");
        }
    }

    /* renamed from: nb2.e$b */
    public final class C61649b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: d */
        public final C60905o f175308d;

        /* renamed from: e */
        public final C61646d f175309e;

        /* renamed from: f */
        public final /* synthetic */ C61647e f175310f;

        public C61649b(C61647e eVar, C60905o oVar, C61646d dVar, int i) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(dVar, "item");
            this.f175310f = eVar;
            this.f175308d = oVar;
            this.f175309e = dVar;
        }

        /* renamed from: a */
        public final WeImageView mo86596a(C60905o oVar, ViewGroup viewGroup) {
            WeImageView weImageView = new WeImageView(oVar.f173499A);
            weImageView.setVisibility(4);
            int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3757d9);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension, dimension);
            layoutParams.gravity = 17;
            weImageView.setLayoutParams(layoutParams);
            weImageView.setImageResource(C0966R.raw.finder_full_like);
            weImageView.setIconColor(oVar.f173499A.getResources().getColor(C0966R.color.Red_90));
            viewGroup.addView(weImageView);
            return weImageView;
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            Log.m105924i("MicroMsg.Mv.MvItemConvert", "onDoubleTap");
            if (C59822f.f170752A.mo84780e(this.f175309e.f175298d)) {
                ViewGroup viewGroup = (ViewGroup) this.f175308d.f44854d.findViewById(C0966R.C0970id.ehb);
                C60905o oVar = this.f175308d;
                C87412m.m108593f(viewGroup, "fullScreenTapLayout");
                C14063b.m13416d(C14063b.f39453a, mo86596a(oVar, viewGroup), 1.4f, motionEvent, true, viewGroup.getY(), 0, (C32224a) null, 96, (Object) null);
                C61646d dVar = this.f175309e;
                if (!dVar.f175298d.f170766n) {
                    C61647e.m72365j(this.f175310f, this.f175308d, dVar, 2);
                    this.f175310f.mo86593p(this.f175308d, this.f175309e);
                }
            }
            if (this.f175310f.f175303i) {
                ViewGroup viewGroup2 = (ViewGroup) this.f175308d.f44854d.findViewById(C0966R.C0970id.ehb);
                C60905o oVar2 = this.f175308d;
                C87412m.m108593f(viewGroup2, "fullScreenTapLayout");
                C14063b.m13416d(C14063b.f39453a, mo86596a(oVar2, viewGroup2), 1.4f, motionEvent, true, viewGroup2.getY(), 0, (C32224a) null, 96, (Object) null);
                C61647e eVar = this.f175310f;
                C60905o oVar3 = this.f175308d;
                C39622i0 a = C39818r.f106831a.mo62444c(eVar.f175299e).mo75002a(C63756e.class);
                C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
                eVar.mo86588k(oVar3, (C63756e) a, true);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C39818r rVar = C39818r.f106831a;
            C65306q0 q0Var = ((C63807m) rVar.mo62444c(this.f175310f.f175299e).mo75002a(C63807m.class)).f180881g;
            if (q0Var.isShowing()) {
                q0Var.dismiss();
            }
            C59822f fVar = this.f175309e.f175298d;
            C87412m.m108594g(fVar, "musicMv");
            int i = fVar.f170768p;
            boolean z = true;
            if (!(i == 1 || i == 4)) {
                z = false;
            }
            if (z) {
                this.f175308d.f44854d.performHapticFeedback(0, 2);
                ((C63849t0) rVar.mo62444c(this.f175310f.f175299e).mo75002a(C63849t0.class)).mo88638c3(this.f175308d, this.f175309e.f175298d, 3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [android.view.View] */
        /* JADX WARNING: type inference failed for: r14v20, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onSingleTapConfirmed(android.view.MotionEvent r14) {
            /*
                r13 = this;
                java.lang.Class<sb2.e> r14 = sb2.C63756e.class
                java.lang.String r0 = "MicroMsg.Mv.MvItemConvert"
                java.lang.String r1 = "onSingleTapConfirmed"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                bl3.r r1 = bl3.C39818r.f106831a
                nb2.e r2 = r13.f175310f
                androidx.appcompat.app.AppCompatActivity r2 = r2.f175299e
                bl3.r$a r2 = r1.mo62444c(r2)
                androidx.lifecycle.i0 r2 = r2.mo75002a(r14)
                sb2.e r2 = (sb2.C63756e) r2
                boolean r2 = r2.f180752t
                r3 = 0
                if (r2 == 0) goto L_0x0043
                nb2.e r0 = r13.f175310f
                androidx.appcompat.app.AppCompatActivity r0 = r0.f175299e
                bl3.r$a r0 = r1.mo62444c(r0)
                androidx.lifecycle.i0 r14 = r0.mo75002a(r14)
                sb2.e r14 = (sb2.C63756e) r14
                r14.f180752t = r3
                nb2.e r14 = r13.f175310f
                jq3.o r0 = r13.f175308d
                nb2.d r1 = r13.f175309e
                r14.mo86592o(r0, r1)
                nb2.e r14 = r13.f175310f
                jq3.o r0 = r13.f175308d
                nb2.d r1 = r13.f175309e
                r14.mo86589l(r0, r1)
                goto L_0x0194
            L_0x0043:
                nb2.e r2 = r13.f175310f
                jq3.o r4 = r13.f175308d
                r2.getClass()
                java.lang.Class<te3.w23> r5 = te3.C64793w23.class
                java.lang.Class<ox.b> r6 = p640ox.C77049b.class
                androidx.appcompat.app.AppCompatActivity r7 = r2.f175299e
                bl3.r$a r7 = r1.mo62444c(r7)
                androidx.lifecycle.i0 r14 = r7.mo75002a(r14)
                java.lang.String r7 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
                gy3.C87412m.m108593f(r14, r7)
                sb2.e r14 = (sb2.C63756e) r14
                androidx.appcompat.app.AppCompatActivity r7 = r2.f175299e
                bl3.r$a r7 = r1.mo62444c(r7)
                java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC> r8 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC.class
                androidx.lifecycle.i0 r7 = r7.mo75002a(r8)
                java.lang.String r8 = "UICProvider.of(activity)…vSongInfoUIC::class.java)"
                gy3.C87412m.m108593f(r7, r8)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r7 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC) r7
                la2.n r8 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r8 = r8.mo138822a()
                boolean r8 = r8.mo32206f()
                r9 = 1
                r10 = 2131309855(0x7f09351f, float:1.8238006E38)
                r11 = 0
                r12 = 7
                if (r8 == 0) goto L_0x00fd
                java.lang.String r1 = "onSingleTap, stop music"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                qc0.C101093a.m132485g()
                hb2.q r0 = hb2.C59833q.f170832a
                androidx.appcompat.app.AppCompatActivity r1 = r2.f175299e
                te3.kb1 r14 = r14.f180744i
                r8 = 2
                r0.mo84799k(r1, r14, r8)
                di3.d r14 = di3.C86312j.m106911c(r6)
                ox.b r14 = (p640ox.C77049b) r14
                androidx.appcompat.app.AppCompatActivity r0 = r2.f175299e
                pe3.a r14 = r14.Wi0(r0, r12, r5)
                te3.w23 r14 = (te3.C64793w23) r14
                if (r14 != 0) goto L_0x00aa
                goto L_0x00b0
            L_0x00aa:
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                r14.f186043q = r0
            L_0x00b0:
                di3.d r14 = di3.C86312j.m106911c(r6)
                ox.b r14 = (p640ox.C77049b) r14
                androidx.appcompat.app.AppCompatActivity r0 = r2.f175299e
                pe3.a r14 = r14.Wi0(r0, r12, r5)
                te3.w23 r14 = (te3.C64793w23) r14
                if (r14 == 0) goto L_0x00c8
                int r14 = r14.f186045s
                int r14 = r14 + r9
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                goto L_0x00c9
            L_0x00c8:
                r14 = r11
            L_0x00c9:
                di3.d r0 = di3.C86312j.m106911c(r6)
                ox.b r0 = (p640ox.C77049b) r0
                androidx.appcompat.app.AppCompatActivity r1 = r2.f175299e
                pe3.a r0 = r0.Wi0(r1, r12, r5)
                te3.w23 r0 = (te3.C64793w23) r0
                if (r0 != 0) goto L_0x00da
                goto L_0x00e0
            L_0x00da:
                int r14 = r14.intValue()
                r0.f186045s = r14
            L_0x00e0:
                r7.mo80493j3()
                r7.mo80494k3()
                r7.mo80488d3()
                android.view.View r14 = r4.f44854d
                android.view.View r14 = r14.findViewById(r10)
                boolean r0 = r14 instanceof m03.C61426c
                if (r0 == 0) goto L_0x00f6
                r11 = r14
                m03.c r11 = (m03.C61426c) r11
            L_0x00f6:
                if (r11 == 0) goto L_0x0194
                r11.pause()
                goto L_0x0194
            L_0x00fd:
                la2.n r8 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r8 = r8.mo138822a()
                boolean r8 = r8.mo32211k()
                if (r8 == 0) goto L_0x012c
                androidx.appcompat.app.AppCompatActivity r8 = r2.f175299e
                bl3.r$a r1 = r1.mo62444c(r8)
                java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC> r8 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC.class
                androidx.lifecycle.i0 r1 = r1.mo75002a(r8)
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC r1 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC) r1
                int r8 = r4.mo17363j()
                r1.mo80451K3(r8)
                la2.n r1 = la2.C99364n.m129616h()
                com.tencent.mm.plugin.music.player.base.g r1 = r1.mo138822a()
                r1.resume()
                goto L_0x0137
            L_0x012c:
                qc0.m r1 = qc0.C101093a.m132480b()
                la2.n r8 = la2.C99364n.m129616h()
                r8.mo138826e(r1)
            L_0x0137:
                r7.mo80489e3()
                r7.mo80490f3()
                r7.mo80492i3()
                android.view.View r1 = r4.f44854d
                android.view.View r1 = r1.findViewById(r10)
                boolean r4 = r1 instanceof m03.C61426c
                if (r4 == 0) goto L_0x014d
                r11 = r1
                m03.c r11 = (m03.C61426c) r11
            L_0x014d:
                if (r11 == 0) goto L_0x0152
                r11.resume()
            L_0x0152:
                hb2.q r1 = hb2.C59833q.f170832a
                androidx.appcompat.app.AppCompatActivity r4 = r2.f175299e
                te3.kb1 r14 = r14.f180744i
                r1.mo84799k(r4, r14, r9)
                di3.d r14 = di3.C86312j.m106911c(r6)
                ox.b r14 = (p640ox.C77049b) r14
                androidx.appcompat.app.AppCompatActivity r1 = r2.f175299e
                pe3.a r14 = r14.Wi0(r1, r12, r5)
                te3.w23 r14 = (te3.C64793w23) r14
                if (r14 == 0) goto L_0x0194
                long r1 = r14.f186043q
                r4 = 0
                int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0194
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "accumulate pauseTime:"
                r4.append(r5)
                r4.append(r1)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                long r4 = r14.f186042p
                long r4 = r4 + r1
                r14.f186042p = r4
                r0 = -1
                r14.f186043q = r0
            L_0x0194:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: nb2.C61647e.C61649b.onSingleTapConfirmed(android.view.MotionEvent):boolean");
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: nb2.e$c */
    public static final class C61650c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61647e f175311d;

        public C61650c(C61647e eVar) {
            this.f175311d = eVar;
        }

        public final void run() {
            ((MusicMvSongInfoUIC) C39818r.f106831a.mo62444c(this.f175311d.f175299e).mo75002a(MusicMvSongInfoUIC.class)).mo80490f3();
        }
    }

    /* renamed from: nb2.e$d */
    public static final class C61651d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61646d f175312d;

        public C61651d(C61646d dVar) {
            this.f175312d = dVar;
        }

        public final void onClick(View view) {
            FinderItem d;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Long l = this.f175312d.f175298d.f170753a;
            if (!(l == null || (d = C15585f.f42211a.mo14341d(l.longValue())) == null)) {
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12413f(d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: nb2.e$e */
    public static final class C61652e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C61647e f175313d;

        public C61652e(C61647e eVar) {
            this.f175313d = eVar;
        }

        public final void onClick(View view) {
            C59325i N30;
            Class cls = C59326j.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initSongInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(this.f175313d.f175299e, 7, C64793w23.class);
            if (w232 != null) {
                w232.f186051y = 3;
            }
            C101093a.m132490l();
            ((C59326j) C86312j.m106911c(cls)).mo84428H4(true);
            C59326j jVar = (C59326j) C86312j.m106911c(cls);
            if (!(jVar == null || (N30 = jVar.N30()) == null)) {
                N30.mo84426q(false);
            }
            this.f175313d.f175299e.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initSongInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C61647e(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f175299e = appCompatActivity;
    }

    /* renamed from: j */
    public static final void m72365j(C61647e eVar, C60905o oVar, C61646d dVar, int i) {
        C61647e eVar2 = eVar;
        C61646d dVar2 = dVar;
        eVar.getClass();
        C39622i0 a = C39818r.f106831a.mo62444c(eVar2.f175299e).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar3 = (C63756e) a;
        Log.m105924i("MicroMsg.Mv.MvItemConvert", "likeMvClick " + dVar2.f175298d.f170755c + ' ' + dVar2.f175298d.f170756d + ' ' + dVar2.f175298d.f170768p);
        C59822f fVar = dVar2.f175298d;
        int i2 = fVar.f170768p;
        if (i2 == 1) {
            boolean z = !fVar.f170766n;
            fVar.f170766n = z;
            if (z) {
                fVar.f170763k++;
            } else {
                fVar.f170763k--;
            }
            eVar.mo86593p(oVar, dVar);
            C59822f fVar2 = dVar2.f175298d;
            Long l = fVar2.f170755c;
            String str = fVar2.f170756d;
            if (l != null && str != null) {
                long longValue = l.longValue();
                C59833q qVar = C59833q.f170832a;
                AppCompatActivity appCompatActivity = eVar2.f175299e;
                C64488kb1 kb12 = eVar3.f180744i;
                C59822f fVar3 = dVar2.f175298d;
                qVar.mo84796h(appCompatActivity, kb12, fVar3, fVar3.f170766n ? 1 : 2, i);
                C86709a0.m107524d().mo123460f(new C46461j(longValue, str, dVar2.f175298d.f170766n));
            }
        } else if (i2 == 4) {
            boolean z2 = !fVar.f170766n;
            fVar.f170766n = z2;
            if (z2) {
                fVar.f170763k++;
            } else {
                fVar.f170763k--;
            }
            eVar.mo86593p(oVar, dVar);
            FinderObject finderObject = dVar2.f175298d.f170772t;
            String str2 = null;
            Long valueOf = finderObject != null ? Long.valueOf(finderObject.f164794id) : null;
            FinderObject finderObject2 = dVar2.f175298d.f170772t;
            if (finderObject2 != null) {
                str2 = finderObject2.objectNonceId;
            }
            if (valueOf != null && str2 != null) {
                C86709a0.m107524d().mo123460f(new C46461j(valueOf.longValue(), str2, dVar2.f175298d.f170766n));
                C59833q qVar2 = C59833q.f170832a;
                AppCompatActivity appCompatActivity2 = eVar2.f175299e;
                C64488kb1 kb13 = eVar3.f180744i;
                C59822f fVar4 = dVar2.f175298d;
                qVar2.mo84796h(appCompatActivity2, kb13, fVar4, fVar4.f170766n ? 1 : 2, i);
            }
        }
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.bj5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r12 != false) goto L_0x0070;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r38, jq3.C9493c r39, int r40, int r41, boolean r42, java.util.List r43) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r40
            r3 = r39
            nb2.d r3 = (nb2.C61646d) r3
            java.lang.Class<sb2.e> r4 = sb2.C63756e.class
            java.lang.Class<sb2.o> r5 = sb2.C63816o.class
            java.lang.String r6 = "holder"
            gy3.C87412m.m108594g(r1, r6)
            java.lang.String r6 = "item"
            gy3.C87412m.m108594g(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onBindViewHolder, position:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.Mv.MvItemConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.lang.String r6 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r11 = 1
            if (r43 == 0) goto L_0x0070
            boolean r12 = r43.isEmpty()
            if (r12 != 0) goto L_0x0070
            java.util.Iterator r12 = r43.iterator()
        L_0x0044:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006d
            java.lang.Object r13 = r12.next()
            java.lang.String r14 = "hideFullLyric"
            boolean r14 = gy3.C87412m.m108589b(r13, r14)
            if (r14 == 0) goto L_0x0058
            r12 = 1
            goto L_0x006e
        L_0x0058:
            java.lang.String r14 = "UniComponent"
            boolean r14 = gy3.C87412m.m108589b(r13, r14)
            if (r14 == 0) goto L_0x0062
            r0.f175303i = r11
        L_0x0062:
            java.lang.String r14 = "NotPermittedSong"
            boolean r13 = gy3.C87412m.m108589b(r13, r14)
            if (r13 == 0) goto L_0x0044
            r0.f175304j = r11
            goto L_0x0044
        L_0x006d:
            r12 = 0
        L_0x006e:
            if (r12 == 0) goto L_0x015b
        L_0x0070:
            android.view.View r12 = r1.f44854d
            r13 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r12 = r12.findViewById(r13)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r12.setTag(r10)
            bl3.r r13 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r14 = r0.f175299e
            bl3.r$a r13 = r13.mo62444c(r14)
            androidx.lifecycle.i0 r13 = r13.mo75002a(r4)
            gy3.C87412m.m108593f(r13, r6)
            sb2.e r13 = (sb2.C63756e) r13
            te3.kb1 r14 = r13.f180744i
            java.lang.String r14 = r14.f183912o
            if (r14 == 0) goto L_0x009e
            int r14 = r14.length()
            if (r14 != 0) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            r14 = 0
            goto L_0x009f
        L_0x009e:
            r14 = 1
        L_0x009f:
            if (r14 != 0) goto L_0x0132
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "initCover songInfo albumUlr:"
            r14.append(r15)
            te3.kb1 r15 = r13.f180744i
            java.lang.String r15 = r15.f183912o
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            te3.kb1 r13 = r13.f180744i
            java.lang.String r13 = r13.f183912o
            gy3.C87412m.m108591d(r13)
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            ma2.t r15 = ma2.C61454t.f174766a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r8 = "thumb_"
            r10.append(r8)
            java.nio.charset.Charset r8 = z04.C119027c.f356488a
            byte[] r8 = r13.getBytes(r8)
            java.lang.String r11 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r8, r11)
            java.lang.String r8 = p823sg.C90193h.m112878f(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = r15.mo86430b(r8)
            r14.<init>((java.lang.String) r8)
            java.lang.String r8 = r14.mo119971i()
            java.lang.String r10 = "VFSFile(MusicFileNameUti…Array())}\")).absolutePath"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "initCover save Path:"
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r10)
            hc0.c$b r10 = new hc0.c$b
            r10.<init>()
            r11 = 1
            r10.f59346b = r11
            r10.f59345a = r11
            r10.f59350f = r8
            java.lang.Object[] r8 = new java.lang.Object[r11]
            r11 = 0
            r8[r11] = r13
            r10.f59368x = r8
            r12.setTag(r13)
            gc0.a r8 = gc0.C20828a.m22825b()
            hc0.c r10 = r10.mo32666a()
            nb2.g r11 = new nb2.g
            r11.<init>(r0, r12)
            r12 = 0
            r8.mo32520i(r13, r12, r10, r11)
            goto L_0x015b
        L_0x0132:
            te3.s23 r8 = r13.f180749q
            java.lang.String r8 = r8.f141283d
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x015b
            hc0.c$b r8 = new hc0.c$b
            r8.<init>()
            r10 = 1
            r8.f59345a = r10
            r8.f59353i = r10
            hc0.c r8 = r8.mo32666a()
            gc0.a r10 = gc0.C20828a.m22825b()
            te3.s23 r11 = r13.f180749q
            java.lang.String r11 = r11.f141283d
            nb2.h r13 = new nb2.h
            r13.<init>(r12)
            r12 = 0
            r10.mo32520i(r11, r12, r8, r13)
        L_0x015b:
            bl3.r r8 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r10 = r0.f175299e
            bl3.r$a r10 = r8.mo62444c(r10)
            androidx.lifecycle.i0 r10 = r10.mo75002a(r5)
            sb2.o r10 = (sb2.C63816o) r10
            boolean r10 = r10.f180919r
            hb2.f r11 = r3.f175298d
            boolean r11 = r11.f170770r
            r12 = 2131309901(0x7f09354d, float:1.8238099E38)
            r13 = 8
            if (r11 == 0) goto L_0x01c0
            if (r10 != 0) goto L_0x01c0
            android.view.View r10 = r1.f44854d
            android.view.View r10 = r10.findViewById(r12)
            if (r10 != 0) goto L_0x0182
            goto L_0x020a
        L_0x0182:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r11.mo10233c(r9)
            java.lang.Object[] r15 = r11.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initDeleteStatus"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r10
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r15 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r16 = "initDeleteStatus"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x020a
        L_0x01c0:
            android.view.View r10 = r1.f44854d
            android.view.View r10 = r10.findViewById(r12)
            if (r10 != 0) goto L_0x01c9
            goto L_0x020a
        L_0x01c9:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            r11.mo10233c(r12)
            java.lang.Object[] r15 = r11.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initDeleteStatus"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r10
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r15 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r16 = "initDeleteStatus"
            java.lang.String r17 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x020a:
            android.view.View r10 = r1.f44854d
            r11 = 2131299734(0x7f090d96, float:1.8217478E38)
            android.view.View r10 = r10.findViewById(r11)
            if (r10 == 0) goto L_0x021d
            nb2.j r11 = new nb2.j
            r11.<init>(r1)
            r10.setOnClickListener(r11)
        L_0x021d:
            java.lang.Class<ny.h> r10 = p629ny.C76979h.class
            java.lang.Class<sb2.m> r11 = sb2.C63807m.class
            android.view.View r12 = r1.f44854d
            r14 = 2131309903(0x7f09354f, float:1.8238103E38)
            android.view.View r12 = r12.findViewById(r14)
            android.view.View r15 = r1.f44854d
            r14 = 2131315921(0x7f094cd1, float:1.8250309E38)
            android.view.View r15 = r15.findViewById(r14)
            android.view.View r14 = r1.f44854d
            r13 = 2131305107(0x7f092293, float:1.8228376E38)
            android.view.View r14 = r14.findViewById(r13)
            androidx.appcompat.app.AppCompatActivity r13 = r0.f175299e
            bl3.r$a r13 = r8.mo62444c(r13)
            androidx.lifecycle.i0 r4 = r13.mo75002a(r4)
            gy3.C87412m.m108593f(r4, r6)
            sb2.e r4 = (sb2.C63756e) r4
            hb2.f$a r6 = hb2.C59822f.f170752A
            hb2.f r13 = r3.f175298d
            boolean r13 = r6.mo84780e(r13)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r24 = r6
            java.lang.String r6 = "UICProvider.of(activity)…sicMvInfoUIC::class.java)"
            r25 = r2
            if (r13 == 0) goto L_0x04b5
            hb2.f r13 = r3.f175298d
            boolean r13 = r13.f170778z
            if (r13 != 0) goto L_0x04b5
            java.lang.String r13 = "is normal mv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r16 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r13.mo10233c(r2)
            java.lang.Object[] r17 = r13.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r19 = "initMvInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r15
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 0
            java.lang.Object r13 = r13.mo10231a(r2)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r2 = r13.intValue()
            r15.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            androidx.appcompat.app.AppCompatActivity r2 = r0.f175299e
            bl3.r$a r2 = r8.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r11)
            gy3.C87412m.m108593f(r2, r6)
            sb2.m r2 = (sb2.C63807m) r2
            androidx.appcompat.app.AppCompatActivity r6 = r0.f175299e
            bl3.r$a r6 = r8.mo62444c(r6)
            androidx.lifecycle.i0 r6 = r6.mo75002a(r5)
            sb2.o r6 = (sb2.C63816o) r6
            r13 = 1
            r6.f180921t = r13
            r0.mo86593p(r1, r3)
            android.view.View r6 = r1.f44854d
            r13 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r6 = r6.findViewById(r13)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            android.view.View r13 = r1.f44854d
            r15 = 2131297502(0x7f0904de, float:1.821295E38)
            android.view.View r13 = r13.findViewById(r15)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            android.view.View r15 = r1.f44854d
            r26 = r5
            r5 = 2131300002(0x7f090ea2, float:1.8218021E38)
            android.view.View r5 = r15.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            nb2.s r15 = new nb2.s
            r15.<init>(r0, r1, r3)
            r13.setOnClickListener(r15)
            r0.mo86591n(r1, r3)
            nb2.t r15 = new nb2.t
            r15.<init>(r0, r3, r1)
            r5.setOnClickListener(r15)
            boolean r15 = r4.f180750r
            if (r15 == 0) goto L_0x0331
            hb2.f r15 = r3.f175298d
            java.lang.Long r15 = r15.f170755c
            r27 = r14
            hb2.f r14 = r4.f180743h
            java.lang.Long r14 = r14.f170755c
            boolean r14 = gy3.C87412m.m108589b(r15, r14)
            if (r14 == 0) goto L_0x0333
            hb2.f r14 = r3.f175298d
            java.lang.String r14 = r14.f170756d
            hb2.f r15 = r4.f180743h
            java.lang.String r15 = r15.f170756d
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 == 0) goto L_0x0333
            android.view.View r14 = r1.f44854d
            nb2.u r15 = new nb2.u
            r15.<init>(r0, r3, r4, r1)
            r14.post(r15)
            goto L_0x0333
        L_0x0331:
            r27 = r14
        L_0x0333:
            hb2.f r4 = r3.f175298d
            java.lang.String r14 = "musicMv"
            gy3.C87412m.m108594g(r4, r14)
            int r4 = r4.f170768p
            r14 = 1
            if (r4 != r14) goto L_0x0341
            goto L_0x0344
        L_0x0341:
            r14 = 4
            if (r4 != r14) goto L_0x0346
        L_0x0344:
            r4 = 1
            goto L_0x0347
        L_0x0346:
            r4 = 0
        L_0x0347:
            if (r4 == 0) goto L_0x0354
            r4 = 0
            r6.setVisibility(r4)
            r13.setVisibility(r4)
            r5.setVisibility(r4)
            goto L_0x0364
        L_0x0354:
            java.lang.String r4 = "can't share mv"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            r4 = 8
            r6.setVisibility(r4)
            r13.setVisibility(r4)
            r5.setVisibility(r4)
        L_0x0364:
            boolean r4 = r0.f175301g
            if (r4 != 0) goto L_0x0384
            android.view.View r4 = r1.f44854d
            r5 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            nb2.e$a r4 = new nb2.e$a
            java.lang.String r5 = "forwardLL"
            gy3.C87412m.m108593f(r6, r5)
            hb2.f r5 = r3.f175298d
            r4.<init>(r0, r6, r5)
            r13 = 10000(0x2710, double:4.9407E-320)
            r6.postDelayed(r4, r13)
        L_0x0384:
            nb2.v r4 = new nb2.v
            r4.<init>(r0, r3, r1)
            r6.setOnClickListener(r4)
            android.view.View r4 = r1.f44854d
            r5 = 2131309909(0x7f093555, float:1.8238115E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x03c0
            hb2.f r5 = r3.f175298d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f170762j
            if (r5 == 0) goto L_0x03b8
            hc0.c$b r6 = new hc0.c$b
            r6.<init>()
            r13 = 1
            r6.f59346b = r13
            r6.f59345a = r13
            r6.f59364t = r13
            hc0.c r6 = r6.mo32666a()
            gc0.a r13 = gc0.C20828a.m22825b()
            java.lang.String r5 = r5.headUrl
            r13.mo32519h(r5, r4, r6)
        L_0x03b8:
            nb2.w r5 = new nb2.w
            r5.<init>(r3, r2)
            r4.setOnClickListener(r5)
        L_0x03c0:
            android.view.View r4 = r1.f44854d
            r5 = 2131309910(0x7f093556, float:1.8238117E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x03ec
            hb2.f r5 = r3.f175298d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f170762j
            if (r5 == 0) goto L_0x03e4
            di3.d r6 = di3.C86312j.m106911c(r10)
            ny.h r6 = (p629ny.C76979h) r6
            androidx.appcompat.app.AppCompatActivity r10 = r0.f175299e
            java.lang.String r5 = r5.nickname
            android.text.SpannableString r5 = r6.mo107057T1(r10, r5)
            r4.setText(r5)
        L_0x03e4:
            nb2.x r5 = new nb2.x
            r5.<init>(r3, r2)
            r4.setOnClickListener(r5)
        L_0x03ec:
            android.view.View r4 = r1.f44854d
            r5 = 2131309913(0x7f093559, float:1.8238123E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            hb2.f r5 = r3.f175298d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f170762j
            if (r5 == 0) goto L_0x0400
            java.lang.String r10 = r5.username
            goto L_0x0401
        L_0x0400:
            r10 = 0
        L_0x0401:
            r4.setTag(r10)
            androidx.appcompat.app.AppCompatActivity r5 = r0.f175299e
            bl3.r$a r5 = r8.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r11)
            sb2.m r5 = (sb2.C63807m) r5
            r5.getClass()
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r5 = r5.f180883i
            int r6 = r4.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
            r10.<init>(r4)
            r5.put(r6, r10)
            android.view.View r4 = r1.f44854d
            r5 = 2131313463(0x7f094337, float:1.8245323E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0450
            hb2.f r5 = r3.f175298d
            int r5 = r5.f170764l
            if (r5 <= 0) goto L_0x0440
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.setText(r5)
            goto L_0x0450
        L_0x0440:
            androidx.appcompat.app.AppCompatActivity r5 = r0.f175299e
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131829879(0x7f112477, float:1.929274E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setText(r5)
        L_0x0450:
            android.view.View r4 = r1.f44854d
            r5 = 2131314777(0x7f094859, float:1.8247989E38)
            android.view.View r4 = r4.findViewById(r5)
            if (r4 == 0) goto L_0x0463
            nb2.y r5 = new nb2.y
            r5.<init>(r2, r3)
            r4.setOnClickListener(r5)
        L_0x0463:
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.ViewGroup$LayoutParams r2 = r27.getLayoutParams()
            r5 = r25
            gy3.C87412m.m108592e(r2, r5)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r4 = r1.f173499A
            r5 = 16
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r2.bottomMargin = r4
            goto L_0x09ac
        L_0x04b5:
            r26 = r5
            r27 = r14
            r5 = r25
            boolean r2 = r0.f175303i
            r13 = 2131315922(0x7f094cd2, float:1.825031E38)
            if (r2 == 0) goto L_0x0841
            java.lang.String r2 = "show UinComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r16 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            r2.mo10233c(r14)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r14 = r15
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r15 = 0
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r15 = r12
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r19 = "initMvInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r14
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r15 = 0
            java.lang.Object r2 = r2.mo10231a(r15)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r14.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.f44854d
            android.view.View r2 = r2.findViewById(r13)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r14 = r1.f44854d
            r15 = 2131315919(0x7f094ccf, float:1.8250305E38)
            android.view.View r14 = r14.findViewById(r15)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            android.view.View r15 = r1.f44854d
            r13 = 2131315920(0x7f094cd0, float:1.8250307E38)
            android.view.View r13 = r15.findViewById(r13)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            android.view.View r15 = r1.f44854d
            r23 = r5
            r5 = 2131315922(0x7f094cd2, float:1.825031E38)
            android.view.View r5 = r15.findViewById(r5)
            k20.a r15 = new k20.a
            r15.<init>()
            r36 = r10
            r16 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r10 = java.lang.Float.valueOf(r16)
            r15.mo10233c(r10)
            java.lang.Object[] r29 = r15.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r31 = "initMvInfo"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setAlpha"
            java.lang.String r35 = "(F)V"
            r28 = r5
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r10 = 0
            java.lang.Object r15 = r15.mo10231a(r10)
            java.lang.Float r15 = (java.lang.Float) r15
            float r10 = r15.floatValue()
            r5.setAlpha(r10)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r16 = r5
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r5 = r1.f44854d
            r10 = 2131315919(0x7f094ccf, float:1.8250305E38)
            android.view.View r5 = r5.findViewById(r10)
            k20.a r10 = new k20.a
            r10.<init>()
            r28 = r6
            r15 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r15)
            r10.mo10233c(r6)
            java.lang.Object[] r16 = r10.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r15 = r5
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = 0
            java.lang.Object r10 = r10.mo10231a(r6)
            java.lang.Float r10 = (java.lang.Float) r10
            float r6 = r10.floatValue()
            r5.setAlpha(r6)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r5 = r1.f44854d
            r6 = 2131315920(0x7f094cd0, float:1.8250307E38)
            android.view.View r5 = r5.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            r6.mo10233c(r10)
            java.lang.Object[] r16 = r6.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r15 = r5
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r10 = 0
            java.lang.Object r6 = r6.mo10231a(r10)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r5.setAlpha(r6)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            r5 = 0
            r0.mo86594q(r1, r4, r5)
            android.view.View r5 = r1.f44854d
            r6 = 2131306194(0x7f0926d2, float:1.823058E38)
            android.view.View r5 = r5.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            boolean r6 = r4.f180734F
            r10 = 2131756063(0x7f10041f, float:1.9143023E38)
            if (r6 == 0) goto L_0x0678
            r5.setImageResource(r10)
            android.view.View r6 = r1.f44854d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131099897(0x7f0600f9, float:1.781216E38)
            int r6 = r6.getColor(r10)
            r5.setIconColor(r6)
            goto L_0x068b
        L_0x0678:
            r5.setImageResource(r10)
            android.view.View r6 = r1.f44854d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131099940(0x7f060124, float:1.7812247E38)
            int r6 = r6.getColor(r10)
            r5.setIconColor(r6)
        L_0x068b:
            android.view.View r5 = r1.f44854d
            r6 = 2131307277(0x7f092b0d, float:1.8232777E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            int r6 = r4.f180731C
            if (r6 <= 0) goto L_0x06ae
            er1.w3 r15 = er1.C58784w3.f168295a
            r17 = 0
            r18 = 0
            r19 = 6
            r20 = 0
            r16 = r6
            java.lang.String r6 = er1.C58784w3.m68430G(r15, r16, r17, r18, r19, r20)
            r5.setText(r6)
            goto L_0x06be
        L_0x06ae:
            android.view.View r6 = r1.f44854d
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131833310(0x7f1131de, float:1.9299698E38)
            java.lang.String r6 = r6.getString(r10)
            r5.setText(r6)
        L_0x06be:
            android.view.View r5 = r1.f44854d
            r6 = 2131313464(0x7f094338, float:1.8245326E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x06e7
            int r6 = r4.f180733E
            if (r6 <= 0) goto L_0x06d7
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r5.setText(r6)
            goto L_0x06e7
        L_0x06d7:
            androidx.appcompat.app.AppCompatActivity r6 = r0.f175299e
            android.content.res.Resources r6 = r6.getResources()
            r10 = 2131829879(0x7f112477, float:1.929274E38)
            java.lang.String r6 = r6.getString(r10)
            r5.setText(r6)
        L_0x06e7:
            nb2.z r5 = new nb2.z
            r5.<init>(r0, r1, r4)
            r14.setOnClickListener(r5)
            nb2.l r5 = new nb2.l
            r5.<init>(r0, r1, r4)
            r13.setOnClickListener(r5)
            nb2.m r5 = new nb2.m
            r5.<init>(r0, r3, r1)
            r2.setOnClickListener(r5)
            boolean r2 = r4.f180750r
            if (r2 == 0) goto L_0x071a
            java.lang.String r2 = r4.f180730B
            java.lang.String r5 = r4.f180735G
            boolean r2 = gy3.C87412m.m108589b(r2, r5)
            if (r2 == 0) goto L_0x0717
            android.view.View r2 = r1.f44854d
            nb2.n r5 = new nb2.n
            r5.<init>(r0, r4, r1)
            r2.post(r5)
        L_0x0717:
            r2 = 0
            r4.f180750r = r2
        L_0x071a:
            hb2.f r2 = r3.f175298d
            r4 = r24
            boolean r2 = r4.mo84780e(r2)
            if (r2 == 0) goto L_0x09ac
            hb2.f r2 = r3.f175298d
            boolean r2 = r2.f170778z
            if (r2 == 0) goto L_0x09ac
            java.lang.String r2 = "is mv with beat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r2 = r1.f44854d
            r4 = 2131313436(0x7f09431c, float:1.8245269E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r4 = r1.f44854d
            r5 = 2131297502(0x7f0904de, float:1.821295E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.View r5 = r1.f44854d
            r6 = 2131300002(0x7f090ea2, float:1.8218021E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 8
            r2.setVisibility(r6)
            r4.setVisibility(r6)
            r5.setVisibility(r6)
            androidx.appcompat.app.AppCompatActivity r2 = r0.f175299e
            bl3.r$a r2 = r8.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r11)
            r4 = r28
            gy3.C87412m.m108593f(r2, r4)
            sb2.m r2 = (sb2.C63807m) r2
            android.view.View r4 = r1.f44854d
            r5 = 2131309909(0x7f093555, float:1.8238115E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L_0x07db
            hb2.f r5 = r3.f175298d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f170762j
            if (r5 == 0) goto L_0x07d3
            hc0.c$b r6 = new hc0.c$b
            r6.<init>()
            r9 = 1
            r6.f59346b = r9
            r6.f59345a = r9
            r6.f59364t = r9
            hc0.c r6 = r6.mo32666a()
            gc0.a r9 = gc0.C20828a.m22825b()
            java.lang.String r5 = r5.headUrl
            r9.mo32519h(r5, r4, r6)
        L_0x07d3:
            nb2.o r5 = new nb2.o
            r5.<init>(r3, r2)
            r4.setOnClickListener(r5)
        L_0x07db:
            android.view.View r4 = r1.f44854d
            r5 = 2131309910(0x7f093556, float:1.8238117E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0807
            hb2.f r5 = r3.f175298d
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f170762j
            if (r5 == 0) goto L_0x07ff
            di3.d r6 = di3.C86312j.m106911c(r36)
            ny.h r6 = (p629ny.C76979h) r6
            androidx.appcompat.app.AppCompatActivity r9 = r0.f175299e
            java.lang.String r5 = r5.nickname
            android.text.SpannableString r5 = r6.mo107057T1(r9, r5)
            r4.setText(r5)
        L_0x07ff:
            nb2.p r5 = new nb2.p
            r5.<init>(r3, r2)
            r4.setOnClickListener(r5)
        L_0x0807:
            android.view.View r4 = r1.f44854d
            r5 = 2131309913(0x7f093559, float:1.8238123E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 8
            r4.setVisibility(r5)
            android.view.View r4 = r1.f44854d
            r5 = 2131314777(0x7f094859, float:1.8247989E38)
            android.view.View r4 = r4.findViewById(r5)
            if (r4 == 0) goto L_0x082a
            nb2.q r5 = new nb2.q
            r5.<init>(r2, r3)
            r4.setOnClickListener(r5)
        L_0x082a:
            android.view.ViewGroup$LayoutParams r2 = r27.getLayoutParams()
            r4 = r23
            gy3.C87412m.m108592e(r2, r4)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r4 = r1.f173499A
            r5 = 16
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r2.bottomMargin = r4
            goto L_0x09ac
        L_0x0841:
            r14 = r15
            boolean r2 = r0.f175304j
            if (r2 == 0) goto L_0x0927
            java.lang.String r2 = "showOnlyForward"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r19 = "initMvInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r14
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r14.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.view.View r2 = r1.f44854d
            r4 = 2131315922(0x7f094cd2, float:1.825031E38)
            android.view.View r2 = r2.findViewById(r4)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r5 = r1.f44854d
            android.view.View r4 = r5.findViewById(r4)
            k20.a r5 = new k20.a
            r5.<init>()
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r5.mo10233c(r6)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r12 = "initMvInfo"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setAlpha"
            java.lang.String r16 = "(F)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r4.setAlpha(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r11 = "initMvInfo"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setAlpha"
            java.lang.String r15 = "(F)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            nb2.r r4 = new nb2.r
            r4.<init>(r0, r3, r1)
            r2.setOnClickListener(r4)
            goto L_0x09ac
        L_0x0927:
            java.lang.String r2 = "none, show uniComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r4)
            java.lang.Object[] r16 = r2.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r12
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12.setVisibility(r2)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r17 = "initMvInfo"
            java.lang.String r18 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r9)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r19 = "initMvInfo"
            java.lang.String r20 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r14
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r14.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert"
            java.lang.String r18 = "initMvInfo"
            java.lang.String r19 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x09ac:
            r2 = r40
            r0.mo86590m(r1, r3, r2)
            androidx.appcompat.app.AppCompatActivity r4 = r0.f175299e
            bl3.r$a r4 = r8.mo62444c(r4)
            java.lang.Class<sb2.b> r5 = sb2.C63741b.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            java.lang.String r5 = "UICProvider.of(activity)…vChattingUIC::class.java)"
            gy3.C87412m.m108593f(r4, r5)
            sb2.b r4 = (sb2.C63741b) r4
            android.view.View r5 = r1.f44854d
            r6 = 2131299984(0x7f090e90, float:1.8217985E38)
            android.view.View r5 = r5.findViewById(r6)
            if (r5 != 0) goto L_0x09d1
            goto L_0x0a82
        L_0x09d1:
            android.view.View r5 = r1.f44854d
            r6 = 2131310523(0x7f0937bb, float:1.823936E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.view.View r6 = r1.f44854d
            r9 = 2131316010(0x7f094d2a, float:1.825049E38)
            android.view.View r6 = r6.findViewById(r9)
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.View r9 = r1.f44854d
            r10 = 2131299979(0x7f090e8b, float:1.8217975E38)
            android.view.View r9 = r9.findViewById(r10)
            com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView r9 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView) r9
            android.view.View r10 = r1.f44854d
            r11 = 2131299362(0x7f090c22, float:1.8216723E38)
            android.view.View r10 = r10.findViewById(r11)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            hb2.o r11 = hb2.C59830o.f170808a
            java.lang.String r11 = "onlineUserTv"
            gy3.C87412m.m108593f(r5, r11)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r11 = hb2.C59830o.f170822o
            int r12 = r5.hashCode()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r5)
            r11.put(r12, r13)
            java.lang.String r5 = "userEnterTipsTv"
            gy3.C87412m.m108593f(r6, r5)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.TextView>> r5 = hb2.C59830o.f170823p
            int r11 = r6.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r6)
            r5.put(r11, r12)
            java.lang.String r5 = "commentAreaRv"
            gy3.C87412m.m108593f(r9, r5)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView>> r5 = hb2.C59830o.f170824q
            int r6 = r9.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r9)
            r5.put(r6, r11)
            java.util.ArrayList<com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView$a> r5 = hb2.C59830o.f170821n
            r9.mo80544c(r5)
            java.lang.String r5 = "chattingMinFooter"
            gy3.C87412m.m108593f(r10, r5)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<android.widget.LinearLayout>> r5 = hb2.C59830o.f170825r
            int r6 = r10.hashCode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r10)
            r5.put(r6, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isMvWithBeat:"
            r5.append(r6)
            hb2.f r6 = r3.f175298d
            boolean r6 = r6.f170778z
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            nb2.i r5 = new nb2.i
            r5.<init>(r4)
            r9.setViewEventListener(r5)
        L_0x0a82:
            r0.mo86589l(r1, r3)
            android.view.View r4 = r1.f44854d
            r5 = 2131305317(0x7f092365, float:1.8228801E38)
            android.view.View r4 = r4.findViewById(r5)
            android.view.GestureDetector r5 = new android.view.GestureDetector
            androidx.appcompat.app.AppCompatActivity r6 = r0.f175299e
            nb2.e$b r7 = new nb2.e$b
            r7.<init>(r0, r1, r3, r2)
            r5.<init>(r6, r7)
            nb2.k r6 = new nb2.k
            r6.<init>(r5)
            r4.setOnTouchListener(r6)
            r0.mo86592o(r1, r3)
            androidx.appcompat.app.AppCompatActivity r4 = r0.f175299e
            bl3.r$a r4 = r8.mo62444c(r4)
            r5 = r26
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            java.lang.String r6 = "UICProvider.of(activity)…icMvLyricUIC::class.java)"
            gy3.C87412m.m108593f(r4, r6)
            sb2.o r4 = (sb2.C63816o) r4
            boolean r4 = r4.f180919r
            sb2.k1 r6 = new sb2.k1
            r6.<init>()
            if (r4 == 0) goto L_0x0b02
            android.view.View r4 = r1.f44854d
            r6.mo13035a(r4)
            r4 = 5
            java.lang.Integer[] r4 = new java.lang.Integer[r4]
            r7 = 2131308811(0x7f09310b, float:1.8235888E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 0
            r4[r9] = r7
            r7 = 2131309903(0x7f09354f, float:1.8238103E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r4[r9] = r7
            r7 = 2
            r9 = 2131305107(0x7f092293, float:1.8228376E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r7] = r9
            r7 = 3
            r9 = 2131305921(0x7f0925c1, float:1.8230026E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r7] = r9
            r7 = 2131315921(0x7f094cd1, float:1.8250309E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 4
            r4[r9] = r7
            java.util.Set r4 = sx3.C110826x0.m151017e(r4)
            r6.mo13036b(r4)
        L_0x0b02:
            if (r2 == 0) goto L_0x0b05
            goto L_0x0b18
        L_0x0b05:
            androidx.appcompat.app.AppCompatActivity r2 = r0.f175299e
            bl3.r$a r2 = r8.mo62444c(r2)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r5)
            sb2.o r2 = (sb2.C63816o) r2
            android.view.View r1 = r1.f44854d
            hb2.f r3 = r3.f175298d
            r2.mo88611j3(r1, r3)
        L_0x0b18:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb2.C61647e.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        ((MusicMainSeekBar) oVar.f44854d.findViewById(C0966R.C0970id.f358704gl0)).setOnSeekBarChange(new C61641a0(this, oVar));
        RecyclerView recyclerView2 = (RecyclerView) oVar.f44854d.findViewById(C0966R.C0970id.gju);
        if (recyclerView2 != null) {
            Context context = oVar.f44854d.getContext();
            C87412m.m108593f(context, "holder.itemView.context");
            recyclerView2.setLayoutManager(new MusicLyricLayoutManager(context, 0, false, 6, (C8480h) null));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (recyclerView2 != null ? recyclerView2.getLayoutParams() : null);
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = (int) ((((float) this.f175299e.getResources().getDisplayMetrics().heightPixels) * 0.37f) - ((float) C76577a.m92151b(oVar.f44854d.getContext(), 15)));
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: k */
    public final void mo86588k(C60905o oVar, C63756e eVar, boolean z) {
        WeImageView weImageView = (WeImageView) oVar.f44854d.findViewById(C0966R.C0970id.m25);
        int i = 1;
        boolean z2 = !eVar.f180734F;
        if (!z || z2) {
            eVar.f180734F = z2;
            if (z2) {
                weImageView.setImageResource(C0966R.raw.icons_filled_like);
                weImageView.setIconColor(oVar.f44854d.getResources().getColor(C0966R.color.f2966ao));
                C63488a.f180084a.mo88342a(eVar.f180744i, 1, 1);
            } else {
                weImageView.setImageResource(C0966R.raw.icons_filled_like);
                weImageView.setIconColor(oVar.f44854d.getResources().getColor(C0966R.color.f2975b6));
                C63488a.f180084a.mo88342a(eVar.f180744i, 2, 1);
            }
            TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.m36);
            if (z2) {
                int i2 = eVar.f180731C + 1;
                eVar.f180731C = i2;
                textView.setText(C58784w3.m68430G(C58784w3.f168295a, i2, false, false, 6, (Object) null));
            } else {
                int i3 = eVar.f180731C;
                if (i3 <= 1 || z2) {
                    textView.setText(oVar.f44854d.getResources().getString(C0966R.string.h2i));
                } else {
                    int i4 = i3 - 1;
                    eVar.f180731C = i4;
                    textView.setText(C58784w3.m68430G(C58784w3.f168295a, i4, false, false, 6, (Object) null));
                }
            }
            C61888c cVar = new C61888c(new C63317a(eVar.f180729A, eVar.f180730B));
            if (!z2) {
                i = 2;
            }
            C47350c.C47352b bVar = new C47350c.C47352b();
            C64263bo1 bo12 = new C64263bo1();
            C63317a aVar = cVar.f175991i;
            bo12.f182303f = aVar.f179669a;
            bo12.f182304g = aVar.f179670b;
            C64488kb1 kb12 = aVar.f179676h;
            bo12.f182309o = kb12 != null ? C58739j4.f168176a.mo83710g0(kb12) : null;
            bo12.f182301d = C46523h2.f125330a.mo71859a(6989);
            bo12.f182302e = System.currentTimeMillis();
            bo12.f182307j = i;
            bVar.f127066a = bo12;
            bVar.f127067b = new C49031co1();
            bVar.f127068c = "/cgi-bin/micromsg-bin/finderunilike";
            bVar.f127069d = 6989;
            cVar.mo123453j(bVar.mo72403a());
            cVar.mo9225i();
        }
    }

    /* renamed from: l */
    public final void mo86589l(C60905o oVar, C61646d dVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        if (!((C63756e) C39818r.f106831a.mo62444c(this.f175299e).mo75002a(C63756e.class)).f180752t) {
            int i = dVar.f175298d.f170768p;
            if (i == 1) {
                View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.g3e);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
                if (findViewById2 != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 2) {
                View findViewById3 = oVar.f44854d.findViewById(C0966R.C0970id.g3e);
                if (findViewById3 != null) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById4 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
                if (findViewById4 != null) {
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view4 = findViewById4;
                    C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (i == 3) {
                View findViewById5 = oVar.f44854d.findViewById(C0966R.C0970id.g3e);
                if (findViewById5 != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view5 = findViewById5;
                    C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById6 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
                if (findViewById6 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    View view6 = findViewById6;
                    C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById7 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
                if (findViewById7 != null) {
                    findViewById7.setOnClickListener(new C61651d(dVar));
                }
            } else if (i == 4) {
                View findViewById8 = oVar.f44854d.findViewById(C0966R.C0970id.g3e);
                if (findViewById8 != null) {
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                    aVar7.mo10233c(8);
                    View view7 = findViewById8;
                    C117292a.m165358d(view7, aVar7.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View findViewById9 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
                if (findViewById9 != null) {
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                    aVar8.mo10233c(8);
                    View view8 = findViewById9;
                    C117292a.m165358d(view8, aVar8.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById9.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else {
            View findViewById10 = oVar.f44854d.findViewById(C0966R.C0970id.g3e);
            if (findViewById10 != null) {
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar9.mo10233c(8);
                View view9 = findViewById10;
                C117292a.m165358d(view9, aVar9.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById10.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById11 = oVar.f44854d.findViewById(C0966R.C0970id.g3a);
            if (findViewById11 != null) {
                C9556a aVar10 = new C9556a();
                ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                aVar10.mo10233c(8);
                View view10 = findViewById11;
                C117292a.m165358d(view10, aVar10.mo10232b(), "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById11.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert", "initLocalPostStats", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/convert/MvConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x03e6, code lost:
        if ((r5.length() > 0) == true) goto L_0x03ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86590m(jq3.C60905o r31, nb2.C61646d r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            java.lang.Class<sb2.e> r3 = sb2.C63756e.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r2, r4)
            bl3.r r4 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r5 = r0.f175299e
            bl3.r$a r5 = r4.mo62444c(r5)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r3)
            java.lang.String r6 = "UICProvider.of(activity)…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            sb2.e r5 = (sb2.C63756e) r5
            androidx.appcompat.app.AppCompatActivity r6 = r0.f175299e
            bl3.r$a r6 = r4.mo62444c(r6)
            java.lang.Class<com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC> r7 = com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            java.lang.String r7 = "UICProvider.of(activity)…vSongInfoUIC::class.java)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC r6 = (com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC) r6
            android.view.View r7 = r1.f44854d
            r8 = 2131309075(0x7f093213, float:1.8236424E38)
            android.view.View r7 = r7.findViewById(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            android.view.View r8 = r1.f44854d
            r9 = 2131308859(0x7f09313b, float:1.8235985E38)
            android.view.View r8 = r8.findViewById(r9)
            com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar r8 = (com.tencent.p014mm.plugin.music.p080ui.view.MusicMainSeekBar) r8
            android.view.View r9 = r1.f44854d
            r10 = 2131308811(0x7f09310b, float:1.8235888E38)
            android.view.View r9 = r9.findViewById(r10)
            androidx.recyclerview.widget.RecyclerView r9 = (androidx.recyclerview.widget.RecyclerView) r9
            android.view.View r10 = r1.f44854d
            r11 = 2131308810(0x7f09310a, float:1.8235886E38)
            android.view.View r10 = r10.findViewById(r11)
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView r10 = (com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvLyricPreludeView) r10
            la2.n r11 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r11 = r11.mo138822a()
            boolean r11 = r11.mo32206f()
            java.lang.String r12 = "mediaIconIv"
            gy3.C87412m.m108593f(r7, r12)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.ui.widget.imageview.WeImageView>> r12 = r6.f163383s
            int r13 = r7.hashCode()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            r14.<init>(r7)
            r12.put(r13, r14)
            la2.n r7 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r7 = r7.mo138822a()
            int r7 = r7.getPlayPosition()
            la2.n r12 = la2.C99364n.m129616h()
            com.tencent.mm.plugin.music.player.base.g r12 = r12.mo138822a()
            int r12 = r12.getDuration()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "initSongInfo, isPlayingMusic:"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = ", playPosition:"
            r13.append(r11)
            r13.append(r7)
            java.lang.String r11 = ", duration:"
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            java.lang.String r13 = "MicroMsg.Mv.MvItemConvert"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            if (r7 <= 0) goto L_0x00d0
            if (r12 <= 0) goto L_0x00d0
            r8.setProgress(r7)
            r8.setMaxProgress(r12)
        L_0x00d0:
            java.lang.String r7 = "seekBar"
            gy3.C87412m.m108593f(r8, r7)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar>> r7 = r6.f163380p
            int r11 = r8.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r8)
            r7.put(r11, r12)
            java.lang.String r7 = "lyricRecycler"
            gy3.C87412m.m108593f(r9, r7)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView>> r7 = r6.f163381q
            int r8 = r9.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r9)
            r7.put(r8, r11)
            java.lang.String r7 = "lyricPreludeView"
            gy3.C87412m.m108593f(r10, r7)
            java.util.HashMap<java.lang.Integer, java.lang.ref.WeakReference<com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView>> r7 = r6.f163382r
            int r8 = r10.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r10)
            r7.put(r8, r9)
            android.view.View r7 = r1.f44854d
            r8 = 2131299726(0x7f090d8e, float:1.8217462E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r8 = 200(0xc8, float:2.8E-43)
            com.tencent.p014mm.sdk.platformtools.Util.expandViewTouchArea(r7, r8, r8, r8, r8)
            nb2.e$e r8 = new nb2.e$e
            r8.<init>(r0)
            r7.setOnClickListener(r8)
            android.view.View r1 = r1.f44854d
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r1, r7)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            te3.kb1 r5 = r5.f180744i
            hb2.f r2 = r2.f175298d
            java.lang.Class<fv.o> r7 = p529fv.C59327o.class
            java.lang.String r8 = "songInfo"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.String r8 = "musicMv"
            gy3.C87412m.m108594g(r2, r8)
            r6.f163371d = r5
            java.lang.String r8 = "MicroMsg.Mv.MusicMvSongInfoUIC"
            java.lang.String r9 = "update"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r8 = 2131314189(0x7f09460d, float:1.8246796E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131314190(0x7f09460e, float:1.8246798E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r10 = r5.f183904d
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x016f
            r10 = r11
        L_0x016f:
            r9.setContentDescription(r10)
            r9.setText(r10)
            java.lang.String r9 = r5.f183905e
            if (r9 != 0) goto L_0x017a
            goto L_0x017b
        L_0x017a:
            r11 = r9
        L_0x017b:
            r8.setContentDescription(r11)
            r8.setText(r11)
            android.content.Context r9 = r1.getContext()
            java.lang.String r10 = "parent.context"
            gy3.C87412m.m108593f(r9, r10)
            bl3.r$a r9 = r4.mo62443b(r9)
            androidx.lifecycle.i0 r9 = r9.mo75002a(r3)
            sb2.e r9 = (sb2.C63756e) r9
            te3.v23 r9 = r9.f180756x
            r14 = 1
            if (r9 == 0) goto L_0x01b9
            java.lang.String r11 = r9.f143267d
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01b9
            int r9 = r9.f143269f
            if (r9 != r14) goto L_0x01b9
            android.app.Activity r9 = r6.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131101230(0x7f06062e, float:1.7814864E38)
            int r9 = r9.getColor(r11)
            r8.setTextColor(r9)
            goto L_0x01cb
        L_0x01b9:
            android.app.Activity r9 = r6.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131099704(0x7f060038, float:1.7811769E38)
            int r9 = r9.getColor(r11)
            r8.setTextColor(r9)
        L_0x01cb:
            android.content.Context r9 = r1.getContext()
            gy3.C87412m.m108593f(r9, r10)
            bl3.r$a r4 = r4.mo62443b(r9)
            androidx.lifecycle.i0 r3 = r4.mo75002a(r3)
            java.lang.String r4 = "UICProvider.of(parent.co…sicMvDataUIC::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            sb2.e r3 = (sb2.C63756e) r3
            r4 = 100
            r9 = 30
            r15 = 0
            com.tencent.p014mm.sdk.platformtools.Util.expandViewTouchArea(r8, r15, r9, r4, r9)
            sb2.c1 r4 = new sb2.c1
            r4.<init>(r8)
            r8.setOnTouchListener(r4)
            sb2.d1 r4 = new sb2.d1
            r4.<init>(r1, r2, r3, r6)
            r8.setOnClickListener(r4)
            r4 = 2131315634(0x7f094bb2, float:1.8249727E38)
            android.view.View r4 = r1.findViewById(r4)
            if (r4 == 0) goto L_0x0212
            sb2.e1 r13 = new sb2.e1
            r8 = r13
            r9 = r33
            r10 = r6
            r11 = r1
            r12 = r2
            r15 = r13
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r4.setOnClickListener(r15)
        L_0x0212:
            r4 = 2131314180(0x7f094604, float:1.8246778E38)
            android.view.View r15 = r1.findViewById(r4)
            if (r15 == 0) goto L_0x022b
            sb2.f1 r13 = new sb2.f1
            r8 = r13
            r9 = r33
            r10 = r6
            r11 = r1
            r12 = r2
            r2 = r13
            r13 = r3
            r8.<init>(r9, r10, r11, r12, r13)
            r15.setOnClickListener(r2)
        L_0x022b:
            java.lang.String r2 = r5.f183907g
            r3 = 2131300468(0x7f091074, float:1.8218966E38)
            android.view.View r8 = r1.findViewById(r3)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            if (r2 == 0) goto L_0x0241
            int r9 = r2.length()
            if (r9 != 0) goto L_0x023f
            goto L_0x0241
        L_0x023f:
            r9 = 0
            goto L_0x0242
        L_0x0241:
            r9 = 1
        L_0x0242:
            if (r9 == 0) goto L_0x0245
            goto L_0x0293
        L_0x0245:
            if (r8 != 0) goto L_0x0248
            goto L_0x0293
        L_0x0248:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            f40.o r12 = f40.C86709a0.m107535s()
            java.lang.String r12 = r12.f251806d
            r11.append(r12)
            java.lang.String r12 = "music/cover/"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.String r11 = "mv_app_icon/"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.append(r10)
            r9.append(r2)
            java.lang.String r2 = ".png"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r9 != 0) goto L_0x0295
            java.lang.String r2 = "MicroMsg.Mv.MvLogic"
            java.lang.String r8 = "appId icon isnot exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
        L_0x0293:
            r2 = 0
            goto L_0x02af
        L_0x0295:
            hc0.c$b r9 = new hc0.c$b
            r9.<init>()
            r9.f59345a = r14
            r9.f59353i = r14
            hc0.c r9 = r9.mo32666a()
            gc0.a r10 = gc0.C20828a.m22825b()
            lb2.g r11 = new lb2.g
            r11.<init>()
            r10.mo32520i(r2, r8, r9, r11)
            r2 = 1
        L_0x02af:
            r8 = 8
            if (r2 == 0) goto L_0x0345
            android.view.View r2 = r1.findViewById(r3)
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            r10.mo10233c(r9)
            java.lang.Object[] r16 = r10.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r18 = "update"
            java.lang.String r19 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setAlpha"
            java.lang.String r22 = "(F)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = 0
            java.lang.Object r10 = r10.mo10231a(r9)
            java.lang.Float r10 = (java.lang.Float) r10
            float r9 = r10.floatValue()
            r2.setAlpha(r9)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r17 = "update"
            java.lang.String r18 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setAlpha"
            java.lang.String r21 = "(F)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r2 = r1.findViewById(r3)
            k20.a r9 = new k20.a
            r9.<init>()
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.mo10233c(r11)
            java.lang.Object[] r23 = r9.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r25 = "update"
            java.lang.String r26 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r2
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r10 = 0
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r23 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r24 = "update"
            java.lang.String r25 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x038c
        L_0x0345:
            android.view.View r2 = r1.findViewById(r3)
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r9.mo10233c(r10)
            java.lang.Object[] r16 = r9.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r18 = "update"
            java.lang.String r19 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r10 = 0
            java.lang.Object r9 = r9.mo10231a(r10)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r17 = "update"
            java.lang.String r18 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x038c:
            qc0.m r2 = qc0.C101093a.m132480b()
            r9 = 0
            if (r2 == 0) goto L_0x0396
            java.lang.String r2 = r2.f295954P
            goto L_0x0397
        L_0x0396:
            r2 = r9
        L_0x0397:
            if (r2 == 0) goto L_0x03bb
            di3.d r2 = di3.C86312j.m106911c(r7)
            fv.o r2 = (p529fv.C59327o) r2
            qc0.m r10 = qc0.C101093a.m132480b()
            if (r10 == 0) goto L_0x03a7
            java.lang.String r9 = r10.f295954P
        L_0x03a7:
            java.lang.Integer r2 = r2.Z30(r9)
            if (r2 != 0) goto L_0x03bb
            di3.d r2 = di3.C86312j.m106911c(r7)
            fv.o r2 = (p529fv.C59327o) r2
            sb2.g1 r7 = new sb2.g1
            r7.<init>(r6, r1)
            r2.mo84014Ib(r7)
        L_0x03bb:
            r6.f163375h = r1
            r6.mo80495l3(r1)
            java.lang.String r2 = r5.f183907g
            java.lang.String r7 = "wx122a2d4c4b5f211e"
            boolean r2 = z04.C112551y.m153809i(r7, r2, r14)
            java.lang.Class<ym.l> r7 = p763ym.C79138l.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ym.l r7 = (p763ym.C79138l) r7
            android.app.Activity r6 = r6.getContext()
            java.lang.String r5 = r5.f183907g
            java.lang.String r5 = r7.mo74012l5(r6, r5)
            if (r5 == 0) goto L_0x03e9
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x03e5
            r6 = 1
            goto L_0x03e6
        L_0x03e5:
            r6 = 0
        L_0x03e6:
            if (r6 != r14) goto L_0x03e9
            goto L_0x03ea
        L_0x03e9:
            r14 = 0
        L_0x03ea:
            r6 = 2131300469(0x7f091075, float:1.8218969E38)
            if (r14 == 0) goto L_0x048b
            if (r2 == 0) goto L_0x03f3
            goto L_0x048b
        L_0x03f3:
            android.view.View r2 = r1.findViewById(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            r7 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r4.mo10233c(r9)
            java.lang.Object[] r16 = r4.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r18 = "update"
            java.lang.String r19 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            r7 = 0
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r16 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r17 = "update"
            java.lang.String r18 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r9 = r1.findViewById(r6)
            k20.a r2 = new k20.a
            r2.<init>()
            r4 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r7)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r25 = "update"
            java.lang.String r26 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r9
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 0
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r9.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r11 = "update"
            java.lang.String r12 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r1.findViewById(r6)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r5)
            goto L_0x0516
        L_0x048b:
            android.view.View r2 = r1.findViewById(r6)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r7)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r12 = "update"
            java.lang.String r13 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r7 = 0
            java.lang.Object r5 = r5.mo10231a(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r11 = "update"
            java.lang.String r12 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r2 = r1.findViewById(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r5)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r19 = "update"
            java.lang.String r20 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r2
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r18 = "update"
            java.lang.String r19 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x0516:
            android.view.View r2 = r1.findViewById(r6)
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0572
            android.view.View r2 = r1.findViewById(r3)
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0572
            r2 = 2131314185(0x7f094609, float:1.8246788E38)
            android.view.View r1 = r1.findViewById(r2)
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r2.mo10233c(r3)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r12 = "update"
            java.lang.String r13 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC"
            java.lang.String r11 = "update"
            java.lang.String r12 = "(Landroid/view/ViewGroup;ILcom/tencent/mm/protocal/protobuf/FinderMVSongInfo;Lcom/tencent/mm/plugin/mv/model/MusicMv;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0572:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb2.C61647e.mo86590m(jq3.o, nb2.d, int):void");
    }

    /* renamed from: n */
    public final void mo86591n(C60905o oVar, C61646d dVar) {
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.bje);
        int i = dVar.f175298d.f170765m;
        if (i > 0) {
            textView.setText(C58784w3.m68430G(C58784w3.f168295a, i, false, false, 6, (Object) null));
        } else {
            textView.setText(this.f175299e.getResources().getString(C0966R.string.d3n));
        }
    }

    /* renamed from: o */
    public final void mo86592o(C60905o oVar, C61646d dVar) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(dVar, "item");
        Set e = C110826x0.m151017e(Integer.valueOf(C0966R.C0970id.mm_), Integer.valueOf(C0966R.C0970id.beu), Integer.valueOf(C0966R.C0970id.f358312ed0), Integer.valueOf(C0966R.C0970id.edp));
        if (((C63756e) C39818r.f106831a.mo62444c(this.f175299e).mo75002a(C63756e.class)).f180752t) {
            C13643k1 k1Var = this.f175300f;
            k1Var.mo13035a(oVar.f44854d);
            k1Var.mo13036b(e);
            this.f175300f.f38657b.clear();
            return;
        }
        C13643k1 k1Var2 = this.f175300f;
        k1Var2.mo13035a(oVar.f44854d);
        k1Var2.mo13037c(e);
        this.f175300f.f38657b.clear();
    }

    /* renamed from: p */
    public final void mo86593p(C60905o oVar, C61646d dVar) {
        WeImageView weImageView = (WeImageView) oVar.f44854d.findViewById(C0966R.C0970id.f1x);
        if (dVar.f175298d.f170766n) {
            weImageView.setImageResource(C0966R.raw.icons_filled_like);
            weImageView.setIconColor(oVar.f44854d.getResources().getColor(C0966R.color.f2966ao));
        } else {
            weImageView.setImageResource(C0966R.raw.icons_filled_like);
            weImageView.setIconColor(oVar.f44854d.getResources().getColor(C0966R.color.f2975b6));
        }
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.fnp);
        int i = dVar.f175298d.f170763k;
        if (i > 0) {
            textView.setText(C58784w3.m68430G(C58784w3.f168295a, i, false, false, 6, (Object) null));
        } else {
            textView.setText(oVar.f44854d.getResources().getString(C0966R.string.h2i));
        }
        Log.m105924i("MicroMsg.Mv.MvItemConvert", "updateLikeStatus isLike:" + dVar.f175298d.f170766n + " likeCount:" + dVar.f175298d.f170763k);
    }

    /* renamed from: q */
    public final void mo86594q(C60905o oVar, C63756e eVar, Integer num) {
        if (num != null) {
            ((TextView) oVar.f44854d.findViewById(C0966R.C0970id.lxm)).setText(C58784w3.m68430G(C58784w3.f168295a, num.intValue(), false, false, 6, (Object) null));
            return;
        }
        TextView textView = (TextView) oVar.f44854d.findViewById(C0966R.C0970id.lxm);
        int i = eVar.f180732D;
        if (i > 0) {
            textView.setText(C58784w3.m68430G(C58784w3.f168295a, i, false, false, 6, (Object) null));
        } else {
            textView.setText(this.f175299e.getResources().getString(C0966R.string.d3n));
        }
    }
}
