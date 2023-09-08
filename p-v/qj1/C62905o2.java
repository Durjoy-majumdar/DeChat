package qj1;

import al1.C54130j;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import cl1.C0668l;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fh1.C8083t2;
import fy3.C32224a;
import gi1.C59463a;
import gi1.C59464c;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import o40.C61926c;
import ok1.C62042e;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.o2 */
public final class C62905o2 extends C62660c {

    /* renamed from: A */
    public AnimatorSet f178509A;

    /* renamed from: B */
    public ValueAnimator f178510B;

    /* renamed from: C */
    public ValueAnimator f178511C;

    /* renamed from: p */
    public final C58124b f178512p;

    /* renamed from: q */
    public final String f178513q = "Finder.FinderLiveAnchorLiveStatePlugin";

    /* renamed from: r */
    public final ViewGroup f178514r;

    /* renamed from: s */
    public final ViewGroup f178515s;

    /* renamed from: t */
    public final ViewGroup f178516t;

    /* renamed from: u */
    public final TextView f178517u;

    /* renamed from: v */
    public final PAGView f178518v;

    /* renamed from: w */
    public final ViewGroup f178519w;

    /* renamed from: x */
    public final PAGView f178520x;

    /* renamed from: y */
    public final WeImageView f178521y;

    /* renamed from: z */
    public int f178522z;

    /* renamed from: qj1.o2$a */
    public static final class C62906a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62905o2 f178523d;

        public C62906a(C62905o2 o2Var) {
            this.f178523d = o2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLiveStatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C8083t2 t2Var = (C8083t2) this.f178523d.mo87685B0(C8083t2.class);
            if (t2Var != null) {
                t2Var.mo9165F3();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLiveStatePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.o2$b */
    public static final class C62907b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C62905o2 f178524d;

        public C62907b(C62905o2 o2Var) {
            this.f178524d = o2Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WeImageView weImageView = this.f178524d.f178521y;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            weImageView.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: qj1.o2$c */
    public static final class C62908c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C62905o2 f178525d;

        public C62908c(C62905o2 o2Var) {
            this.f178525d = o2Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            WeImageView weImageView = this.f178525d.f178521y;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            weImageView.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: qj1.o2$d */
    public static final class C62909d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62905o2 f178526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62909d(C62905o2 o2Var) {
            super(0);
            this.f178526d = o2Var;
        }

        public Object invoke() {
            Class cls = C54963d0.class;
            Log.m105924i(this.f178526d.f178513q, "checkPkAnchorAudioTip curLinkMicUser:" + ((C54963d0) this.f178526d.mo87696x0(cls)).f154073p);
            C54130j jVar = ((C54963d0) this.f178526d.mo87696x0(cls)).f154073p;
            if (jVar != null) {
                C62905o2 o2Var = this.f178526d;
                if (jVar.f152012p) {
                    o2Var.f178522z |= 2;
                } else {
                    o2Var.f178522z &= -3;
                }
                o2Var.mo87852c1((LinkedHashMap<String, Rect>) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.o2$e */
    public static final class C62910e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62905o2 f178527d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62910e(C62905o2 o2Var) {
            super(0);
            this.f178527d = o2Var;
        }

        public Object invoke() {
            C54130j jVar;
            if (C61926c.m72696u(this.f178527d.f178522z, 2) && (jVar = ((C54963d0) this.f178527d.mo87696x0(C54963d0.class)).f154073p) != null) {
                C62905o2 o2Var = this.f178527d;
                if (jVar.f152010n) {
                    o2Var.f178520x.setVisibility(4);
                    o2Var.f178520x.stop();
                } else {
                    o2Var.f178520x.setVisibility(0);
                    o2Var.f178520x.play();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62905o2(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178512p = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.mqm);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.f…_live_audio_mode_barrier)");
        this.f178514r = (ViewGroup) findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.o6s);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.f…n_info_audio_mode_layout)");
        this.f178515s = (ViewGroup) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.djr);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.f…on_info_audio_mode_group)");
        this.f178516t = (ViewGroup) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.djx);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.f…ommon_info_audio_mode_tv)");
        this.f178517u = (TextView) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.djs);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.f…mon_info_audio_mode_icon)");
        PAGView pAGView = (PAGView) findViewById5;
        this.f178518v = pAGView;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.dju);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…info_audio_mode_pk_group)");
        this.f178519w = (ViewGroup) findViewById6;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.djw);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.f…on_info_audio_mode_pk_tv)");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.djv);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.f…_info_audio_mode_pk_icon)");
        PAGView pAGView2 = (PAGView) findViewById8;
        this.f178520x = pAGView2;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.djz);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.f…ive_common_info_mute_tip)");
        WeImageView weImageView = (WeImageView) findViewById9;
        this.f178521y = weImageView;
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.1f}).setDuration(800);
        duration.addUpdateListener(new C62907b(this));
        this.f178510B = duration;
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.1f, 1.0f}).setDuration(800);
        duration2.addUpdateListener(new C62908c(this));
        this.f178511C = duration2;
        pAGView.setComposition(PAGFile.Load(viewGroup.getContext().getAssets(), "finder_live_link_mic_wave.pag"));
        pAGView.setRepeatCount(-1);
        pAGView2.setComposition(PAGFile.Load(viewGroup.getContext().getAssets(), "finder_live_link_mic_wave.pag"));
        pAGView2.setRepeatCount(-1);
        weImageView.setOnClickListener(new C62906a(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{this.f178510B, this.f178511C});
        this.f178509A = animatorSet;
    }

    /* renamed from: Z0 */
    public final void mo87849Z0() {
        if (!C61926c.m72696u(this.f178522z, 4) || !C62042e.f176370a.mo87030O0()) {
            this.f178521y.setVisibility(8);
            AnimatorSet animatorSet = this.f178509A;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = this.f178509A;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                return;
            }
            return;
        }
        this.f178521y.setVisibility(0);
        AnimatorSet animatorSet3 = this.f178509A;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
        }
        AnimatorSet animatorSet4 = this.f178509A;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new C62930q2(this));
        }
        AnimatorSet animatorSet5 = this.f178509A;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
        this.f178518v.setVisibility(8);
        this.f178518v.stop();
    }

    /* renamed from: a1 */
    public final void mo87850a1() {
        C61926c.m72668M(new C62909d(this));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87851b1() {
        String str = this.f178513q;
        Log.m105924i(str, "checkPkAnchorAudioVolume business(LiveLinkMicSlice::class.java).curLinkMicUser:" + ((C54963d0) mo87696x0(C54963d0.class)).f154073p);
        C61926c.m72668M(new C62910e(this));
    }

    /* renamed from: c1 */
    public final void mo87852c1(LinkedHashMap<String, Rect> linkedHashMap) {
        boolean z;
        Class cls = C54963d0.class;
        C59464c value = ((C54963d0) mo87696x0(cls)).f154077t.getValue();
        if (value != null && value.f169898c == 1) {
            Iterator<T> it = value.f169896a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C59463a aVar = (C59463a) it.next();
                if (C87412m.m108589b(aVar.mo84561a(), ((C55001u) mo87696x0(C55001u.class)).f154419p.f182319n)) {
                    if (aVar.f169895b.f169903g == 2) {
                        z = true;
                    }
                }
            }
        }
        z = false;
        if (z) {
            this.f178516t.setVisibility(8);
            this.f178519w.setVisibility(8);
            this.f178521y.setVisibility(8);
            AnimatorSet animatorSet = this.f178509A;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            AnimatorSet animatorSet2 = this.f178509A;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                return;
            }
            return;
        }
        if ((linkedHashMap != null && linkedHashMap.size() == 1) || ((C54963d0) mo87696x0(cls)).mo75929l3().isEmpty()) {
            this.f178516t.setVisibility(8);
            this.f178519w.setVisibility(8);
            this.f178521y.setVisibility(8);
            mo87849Z0();
            return;
        }
        if (!C61926c.m72696u(this.f178522z, 1) || C61926c.m72696u(this.f178522z, 4)) {
            this.f178516t.setVisibility(8);
        } else {
            this.f178516t.setVisibility(0);
            if (C61926c.m72696u(this.f178522z, 1)) {
                this.f178517u.setVisibility(0);
            } else {
                this.f178517u.setVisibility(8);
                this.f178518v.setVisibility(4);
                this.f178518v.stop();
            }
        }
        mo87849Z0();
        if (C61926c.m72696u(this.f178522z, 2)) {
            this.f178519w.setVisibility(0);
            return;
        }
        this.f178519w.setVisibility(8);
        this.f178520x.setVisibility(4);
        this.f178520x.stop();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C0668l) mo87696x0(C0668l.class)).mo632i3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11992m0(java.util.LinkedHashMap<java.lang.String, android.graphics.Rect> r6) {
        /*
            r5 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.String r1 = "micUserMap"
            gy3.C87412m.m108594g(r6, r1)
            androidx.lifecycle.i0 r1 = r5.mo87696x0(r0)
            cl1.d0 r1 = (cl1.C54963d0) r1
            al1.j r1 = r1.f154073p
            java.lang.String r2 = r5.f178513q
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onMicUserChanged: curLinkMicUser:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", micUserMap:"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0036
            boolean r4 = r1.f152004h
            if (r4 != r2) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x0054
            java.lang.String r2 = r1.f151997a
            boolean r2 = r6.containsKey(r2)
            if (r2 != 0) goto L_0x0042
            goto L_0x0054
        L_0x0042:
            boolean r1 = r1.f152012p
            if (r1 == 0) goto L_0x004d
            int r1 = r5.f178522z
            r1 = r1 | 2
            r5.f178522z = r1
            goto L_0x005a
        L_0x004d:
            int r1 = r5.f178522z
            r1 = r1 & -3
            r5.f178522z = r1
            goto L_0x005a
        L_0x0054:
            int r1 = r5.f178522z
            r1 = r1 & -3
            r5.f178522z = r1
        L_0x005a:
            r5.mo87852c1(r6)
            androidx.lifecycle.i0 r6 = r5.mo87696x0(r0)
            cl1.d0 r6 = (cl1.C54963d0) r6
            boolean r6 = r6.mo75912T3()
            r0 = 0
            if (r6 != 0) goto L_0x00b3
            java.lang.Class<cl1.c0> r6 = cl1.C54949c0.class
            androidx.lifecycle.i0 r6 = r5.mo87696x0(r6)
            cl1.c0 r6 = (cl1.C54949c0) r6
            boolean r6 = r6.mo75866g3()
            if (r6 == 0) goto L_0x0079
            goto L_0x00b3
        L_0x0079:
            android.view.ViewGroup r6 = r5.f178515s
            if (r6 == 0) goto L_0x011d
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r1 = r5.f178514r
            boolean r6 = gy3.C87412m.m108589b(r6, r1)
            if (r6 != 0) goto L_0x011d
            android.view.ViewGroup r6 = r5.f178515s
            if (r6 == 0) goto L_0x0092
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0093
        L_0x0092:
            r6 = r0
        L_0x0093:
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x009a
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x009a:
            if (r0 == 0) goto L_0x00a1
            android.view.ViewGroup r6 = r5.f178515s
            r0.removeView(r6)
        L_0x00a1:
            android.view.ViewGroup r6 = r5.f178514r
            if (r6 == 0) goto L_0x00a8
            r6.removeAllViews()
        L_0x00a8:
            android.view.ViewGroup r6 = r5.f178514r
            if (r6 == 0) goto L_0x011d
            android.view.ViewGroup r0 = r5.f178515s
            r6.addView(r0)
            goto L_0x011d
        L_0x00b3:
            java.lang.Class<ii1.e> r6 = ii1.C60291e.class
            qj1.c r6 = r5.mo87687E0(r6)
            ii1.e r6 = (ii1.C60291e) r6
            if (r6 == 0) goto L_0x011d
            li1.a r6 = r6.mo85276Z0()
            boolean r1 = r6.mo85558f()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00ec
        L_0x00c8:
            com.tencent.mm.view.ratio.RatioLayout r1 = r6.mo85556d()
            int r1 = r1.getChildCount()
        L_0x00d0:
            if (r3 >= r1) goto L_0x00ec
            com.tencent.mm.view.ratio.RatioLayout r2 = r6.mo85556d()
            android.view.View r2 = r2.getChildAt(r3)
            boolean r4 = r2 instanceof oi1.C62028a
            if (r4 == 0) goto L_0x00e1
            oi1.a r2 = (oi1.C62028a) r2
            goto L_0x00e2
        L_0x00e1:
            r2 = r0
        L_0x00e2:
            if (r2 == 0) goto L_0x00e9
            android.view.ViewGroup r6 = r2.getAnchorAudioModeLayout()
            goto L_0x00ed
        L_0x00e9:
            int r3 = r3 + 1
            goto L_0x00d0
        L_0x00ec:
            r6 = r0
        L_0x00ed:
            if (r6 == 0) goto L_0x011d
            android.view.ViewGroup r1 = r5.f178515s
            if (r1 == 0) goto L_0x011d
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 != 0) goto L_0x011d
            android.view.ViewGroup r1 = r5.f178515s
            if (r1 == 0) goto L_0x0106
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x0107
        L_0x0106:
            r1 = r0
        L_0x0107:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x010e
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x010e:
            if (r0 == 0) goto L_0x0115
            android.view.ViewGroup r1 = r5.f178515s
            r0.removeView(r1)
        L_0x0115:
            r6.removeAllViews()
            android.view.ViewGroup r0 = r5.f178515s
            r6.addView(r0)
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62905o2.mo11992m0(java.util.LinkedHashMap):void");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        int i;
        Class cls = C54991o.class;
        C87412m.m108594g(bVar, "status");
        super.mo3210u0(bVar, bundle);
        int ordinal = bVar.ordinal();
        if (ordinal != 7) {
            if (ordinal != 27) {
                boolean z = false;
                if (ordinal == 169) {
                    if (bundle != null) {
                        z = bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
                    }
                    if (z) {
                        int i2 = this.f178522z;
                        Pattern pattern = C61926c.f176038a;
                        i = i2 | 1;
                    } else {
                        int i3 = this.f178522z;
                        Pattern pattern2 = C61926c.f176038a;
                        i = i3 & -2;
                    }
                    this.f178522z = i;
                    mo87852c1((LinkedHashMap<String, Rect>) null);
                } else if (ordinal == 173 && C62042e.f176370a.mo87030O0()) {
                    if (bundle != null) {
                        z = bundle.getBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", false);
                    }
                    ((C54991o) mo87696x0(cls)).f154274W2 = z;
                    this.f178522z = z ? this.f178522z | 4 : this.f178522z & -5;
                    mo87852c1((LinkedHashMap<String, Rect>) null);
                }
            } else {
                mo10792g(8);
            }
        } else if (C62042e.f176370a.mo87030O0()) {
            this.f178522z = ((C54991o) mo87696x0(cls)).f154274W2 ? this.f178522z | 4 : this.f178522z & -5;
            mo87852c1((LinkedHashMap<String, Rect>) null);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        AnimatorSet animatorSet = this.f178509A;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f178509A;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }
}
