package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import il1.C8993g6;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import rx3.C13598b0;
import zj1.C16217b;

/* renamed from: qj1.r2 */
public final class C12632r2 extends C62660c {

    /* renamed from: A */
    public C32224a<C13598b0> f36196A;

    /* renamed from: B */
    public final C8993g6 f36197B;

    /* renamed from: p */
    public final C58124b f36198p;

    /* renamed from: q */
    public final String f36199q = "FinderLiveAnchorMoreOptionPanelPlugin";

    /* renamed from: r */
    public final View f36200r;

    /* renamed from: s */
    public final View f36201s;

    /* renamed from: t */
    public final View f36202t;

    /* renamed from: u */
    public final View f36203u;

    /* renamed from: v */
    public final View f36204v;

    /* renamed from: w */
    public final View f36205w;

    /* renamed from: x */
    public final String f36206x;

    /* renamed from: y */
    public final String f36207y;

    /* renamed from: z */
    public final String f36208z;

    /* renamed from: qj1.r2$a */
    public static final class C12633a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f36209d;

        public C12633a(ViewGroup viewGroup) {
            this.f36209d = viewGroup;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f36209d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(this.f36209d.getContext());
        }
    }

    /* renamed from: qj1.r2$b */
    public static final class C12634b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12632r2 f36210d;

        public C12634b(C12632r2 r2Var) {
            this.f36210d = r2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36210d.mo12219Z0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r2$c */
    public static final class C12635c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12632r2 f36211d;

        public C12635c(C12632r2 r2Var) {
            this.f36211d = r2Var;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.DOCUMENT, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            this.f36211d.f36197B.mo9803d();
            this.f36211d.mo12219Z0();
            C16217b.f43438a.mo14745b(this.f36211d.f36206x, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r2$d */
    public static final class C12636d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12632r2 f36212d;

        public C12636d(C12632r2 r2Var) {
            this.f36212d = r2Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b bVar = this.f36212d.f36198p;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_ANCHOR_PROMOTE_SHOW, (Bundle) null, 2, (Object) null);
            }
            this.f36212d.mo12219Z0();
            C45795b A0 = this.f36212d.mo87684A0();
            if (A0 != null) {
                C7329b.m7473b(C7329b.f25441a, A0, 2, 0, (String) null, 0, 28, (Object) null);
            }
            C16217b.f43438a.mo14745b(this.f36212d.f36207y, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r2$e */
    public static final class C12637e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12632r2 f36213d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f36214e;

        public C12637e(C12632r2 r2Var, ViewGroup viewGroup) {
            this.f36213d = r2Var;
            this.f36214e = viewGroup;
        }

        public final void onClick(View view) {
            Class cls = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f36213d.mo12219Z0();
            if (((C54991o) this.f36213d.mo87696x0(cls)).f154275W3 != null) {
                C58124b.C7172a.m7372a(this.f36213d.f36198p, C58124b.C58125b.FINDER_LIVE_VOTING_SHOW, (Bundle) null, 2, (Object) null);
            } else {
                C39622i0 x0 = this.f36213d.mo87696x0(C55001u.class);
                ViewGroup viewGroup = this.f36214e;
                C12632r2 r2Var = this.f36213d;
                C55001u uVar = (C55001u) x0;
                C62042e eVar = C62042e.f176370a;
                Context context = viewGroup.getContext();
                C87412m.m108593f(context, "root.context");
                eVar.mo87012I0(context, uVar.f154420q.f182392d, uVar.f154416j, uVar.f154423t, ((C54991o) r2Var.mo87696x0(cls)).f154345o);
            }
            C16217b.f43438a.mo14745b(this.f36213d.f36208z, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.r2$f */
    public static final class C12638f extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C12632r2 f36215d;

        public C12638f(C12632r2 r2Var) {
            this.f36215d = r2Var;
        }

        public void onAnimationCancel(Animator animator) {
            this.f36215d.f166287d.setVisibility(8);
            C32224a<C13598b0> aVar = this.f36215d.f36196A;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f36215d.f166287d.setVisibility(8);
            C32224a<C13598b0> aVar = this.f36215d.f36196A;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12632r2(android.view.ViewGroup r22, d60.C58124b r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "root"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "statusMonitor"
            gy3.C87412m.m108594g(r2, r3)
            r3 = 0
            r0.<init>(r1, r2, r3)
            r0.f36198p = r2
            java.lang.String r4 = "FinderLiveAnchorMoreOptionPanelPlugin"
            r0.f36199q = r4
            r4 = 2131303060(0x7f091a94, float:1.8224224E38)
            android.view.View r4 = r1.findViewById(r4)
            r0.f36200r = r4
            r5 = 2131303057(0x7f091a91, float:1.8224218E38)
            android.view.View r5 = r1.findViewById(r5)
            r0.f36201s = r5
            r6 = 2131303063(0x7f091a97, float:1.822423E38)
            android.view.View r6 = r1.findViewById(r6)
            r0.f36202t = r6
            r7 = 2131312826(0x7f0940ba, float:1.8244031E38)
            android.view.View r11 = r1.findViewById(r7)
            r0.f36203u = r11
            r7 = 2131311525(0x7f093ba5, float:1.8241393E38)
            android.view.View r7 = r1.findViewById(r7)
            r0.f36204v = r7
            r8 = 2131316615(0x7f094f87, float:1.8251716E38)
            android.view.View r15 = r1.findViewById(r8)
            r0.f36205w = r15
            java.lang.String r10 = "anchorlive.bottom.tools.screenshare"
            r0.f36206x = r10
            java.lang.String r14 = "anchorlive.bottom.tools.link"
            r0.f36207y = r14
            java.lang.String r13 = "anchorlive.bottom.tools.vote"
            r0.f36208z = r13
            il1.g6 r8 = new il1.g6
            java.lang.String r9 = "null cannot be cast to non-null type android.view.ViewGroup"
            gy3.C87412m.m108592e(r4, r9)
            r9 = r4
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r8.<init>(r9, r2, r0)
            r0.f36197B = r8
            boolean r2 = r21.mo82893g0()
            if (r2 != 0) goto L_0x007b
            qj1.r2$a r2 = new qj1.r2$a
            r2.<init>(r1)
            r1.post(r2)
        L_0x007b:
            android.content.Context r2 = r22.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            float r2 = (float) r2
            r1.setTranslationY(r2)
            qj1.r2$b r2 = new qj1.r2$b
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            qj1.r2$c r2 = new qj1.r2$c
            r2.<init>(r0)
            r4.setOnClickListener(r2)
            qj1.r2$d r2 = new qj1.r2$d
            r2.<init>(r0)
            r5.setOnClickListener(r2)
            qj1.r2$e r2 = new qj1.r2$e
            r2.<init>(r0, r1)
            r6.setOnClickListener(r2)
            ok1.e r2 = ok1.C62042e.f176370a
            fj1.b r4 = r21.mo87684A0()
            boolean r4 = r2.mo87035Q0(r4)
            if (r4 != 0) goto L_0x00bf
            fj1.b r4 = r21.mo87684A0()
            boolean r2 = r2.mo87073d1(r4)
            if (r2 == 0) goto L_0x00c3
        L_0x00bf:
            r2 = 0
            r8.mo9802c(r2)
        L_0x00c3:
            zj1.b r2 = zj1.C16217b.f43438a
            android.content.Context r4 = r22.getContext()
            boolean r5 = r4 instanceof androidx.lifecycle.C0125s
            if (r5 == 0) goto L_0x00d1
            androidx.lifecycle.s r4 = (androidx.lifecycle.C0125s) r4
            r9 = r4
            goto L_0x00d2
        L_0x00d1:
            r9 = r3
        L_0x00d2:
            r12 = 0
            r4 = 0
            r5 = 24
            r6 = 0
            r8 = r2
            r20 = r13
            r13 = r4
            r4 = r14
            r14 = r5
            r5 = r15
            r15 = r6
            zj1.C16217b.m15108i(r8, r9, r10, r11, r12, r13, r14, r15)
            android.content.Context r6 = r22.getContext()
            boolean r8 = r6 instanceof androidx.lifecycle.C0125s
            if (r8 == 0) goto L_0x00ee
            androidx.lifecycle.s r6 = (androidx.lifecycle.C0125s) r6
            r13 = r6
            goto L_0x00ef
        L_0x00ee:
            r13 = r3
        L_0x00ef:
            r16 = 0
            r17 = 0
            r18 = 24
            r19 = 0
            r12 = r2
            r14 = r4
            r15 = r7
            zj1.C16217b.m15108i(r12, r13, r14, r15, r16, r17, r18, r19)
            android.content.Context r1 = r22.getContext()
            boolean r4 = r1 instanceof androidx.lifecycle.C0125s
            if (r4 == 0) goto L_0x0108
            r3 = r1
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
        L_0x0108:
            r13 = r3
            r16 = 0
            r17 = 0
            r18 = 24
            r19 = 0
            r12 = r2
            r14 = r20
            r15 = r5
            zj1.C16217b.m15108i(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12632r2.<init>(android.view.ViewGroup, d60.b):void");
    }

    /* renamed from: Z0 */
    public final void mo12219Z0() {
        mo12220a1(false);
        C16217b bVar = C16217b.f43438a;
        bVar.mo14746c(this.f36206x);
        bVar.mo14746c(this.f36207y);
        bVar.mo14746c(this.f36208z);
        this.f166287d.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(200).setListener(new C12638f(this)).start();
    }

    /* renamed from: a1 */
    public final void mo12220a1(boolean z) {
        C54991o oVar = (C54991o) mo87696x0(C54991o.class);
        oVar.f154286Z = z;
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", oVar.f154286Z);
        this.f36198p.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        mo12219Z0();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
