package qj1;

import a14.C53872d1;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C54219z;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54795n5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import i50.C60251a;
import il1.C60526t5;
import il1.C8967f0;
import il1.C8986g0;
import il1.C8993g6;
import il1.C9023j0;
import il1.C9068n;
import il1.C9077o;
import il1.C9139v;
import il1.C9155w;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import nj3.C76912y0;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import p849e3.C107168a0;
import p849e3.C107179f0;
import p849e3.C107204q;
import p849e3.C107207u;
import rl1.C13017b;
import rl1.C13021d;
import rl1.C13022d0;
import rl1.C13044k;
import rl1.C13053n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sp1.C13764a;
import sx3.C64197v;
import te3.C49712hj1;
import us1.C14380b;
import wx3.C15601d;
import zj1.C16217b;

/* renamed from: qj1.l0 */
public final class C12490l0 extends C62660c {

    /* renamed from: A */
    public final C14380b f35922A;

    /* renamed from: B */
    public final C8993g6 f35923B;

    /* renamed from: C */
    public final C13601g f35924C;

    /* renamed from: D */
    public final C9023j0 f35925D;

    /* renamed from: p */
    public final C58124b f35926p;

    /* renamed from: q */
    public final String f35927q = "Finder.FinderLiveAnchorBottomOptionPlugin";

    /* renamed from: r */
    public final LinkedList<View> f35928r;

    /* renamed from: s */
    public final C13764a f35929s;

    /* renamed from: t */
    public final C8986g0 f35930t;

    /* renamed from: u */
    public final C60526t5 f35931u;

    /* renamed from: v */
    public final C8967f0 f35932v;

    /* renamed from: w */
    public final C13021d f35933w;

    /* renamed from: x */
    public final C9077o f35934x;

    /* renamed from: y */
    public final C9068n f35935y;

    /* renamed from: z */
    public final C9139v f35936z;

    /* renamed from: qj1.l0$a */
    public static final class C12491a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35937d;

        /* renamed from: e */
        public final /* synthetic */ int f35938e;

        /* renamed from: f */
        public final /* synthetic */ C12490l0 f35939f;

        public C12491a(ViewGroup viewGroup, int i, C12490l0 l0Var) {
            this.f35937d = viewGroup;
            this.f35938e = i;
            this.f35939f = l0Var;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f35937d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f35938e + C75044y4.m89991c(this.f35937d.getContext());
            C58124b bVar = this.f35939f.f35926p;
            if (bVar != null) {
                C58124b.C7172a.m7372a(bVar, C58124b.C58125b.FINDER_LIVE_UPDATE_GAME_TIPS_LOCATION_MSG, (Bundle) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: qj1.l0$b */
    public static final class C12492b implements C107204q {

        /* renamed from: a */
        public final /* synthetic */ C12490l0 f35940a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f35941b;

        /* renamed from: c */
        public final /* synthetic */ int f35942c;

        public C12492b(C12490l0 l0Var, ViewGroup viewGroup, int i) {
            this.f35940a = l0Var;
            this.f35941b = viewGroup;
            this.f35942c = i;
        }

        /* renamed from: a */
        public final C107179f0 mo12075a(View view, C107179f0 f0Var) {
            if (!this.f35940a.mo82893g0() && !C62042e.f176370a.mo87073d1(this.f35940a.mo87684A0())) {
                int c = C75044y4.m89991c(this.f35941b.getContext());
                ViewGroup.LayoutParams layoutParams = this.f35941b.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f35942c + c;
                String str = this.f35940a.f35927q;
                Log.m105924i(str, "onApplyWindowInsets navigationHeight: " + c);
            }
            return C107207u.m145167h(view, f0Var);
        }
    }

    /* renamed from: qj1.l0$c */
    public static final class C12493c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12490l0 f35943d;

        /* renamed from: qj1.l0$c$a */
        public static final class C12494a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C12490l0 f35944d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C12494a(C12490l0 l0Var) {
                super(0);
                this.f35944d = l0Var;
            }

            public Object invoke() {
                this.f35944d.mo10792g(0);
                return C13598b0.f38549a;
            }
        }

        public C12493c(C12490l0 l0Var) {
            this.f35943d = l0Var;
        }

        public final void onClick(View view) {
            C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((C13022d0) this.f35943d.mo87696x0(C13022d0.class)).f37102r) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.LUCKDRAW, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar), (String) null, 4, (Object) null);
                this.f35943d.mo10792g(4);
                C12256bd bdVar = (C12256bd) this.f35943d.mo87687E0(C12256bd.class);
                if (bdVar != null) {
                    bdVar.f35340t = new C12494a(this.f35943d);
                    bdVar.f166287d.setVisibility(0);
                    bdVar.f35337q.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
                    ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.LOTTERY, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
                    ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.REDPACKET, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
                }
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8606g((C8777j5) c2, C54067f0.C0064m.REDPACKET, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar), (String) null, 4, (Object) null);
                this.f35943d.mo12144d1();
            }
            C16217b.f43438a.mo14745b(this.f35943d.f35932v.f28347g, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.l0$e */
    public static final class C12495e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C12490l0 f35945d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12495e(C12490l0 l0Var) {
            super(0);
            this.f35945d = l0Var;
        }

        public Object invoke() {
            this.f35945d.f35930t.mo9798a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.l0$f */
    public static final class C12496f extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35946d;

        /* renamed from: e */
        public final /* synthetic */ C12490l0 f35947e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12496f(ViewGroup viewGroup, C12490l0 l0Var) {
            super(0);
            this.f35946d = viewGroup;
            this.f35947e = l0Var;
        }

        public Object invoke() {
            View findViewById = this.f35946d.findViewById(C0966R.C0970id.i36);
            this.f35947e.f35928r.add(findViewById);
            findViewById.setOnClickListener(new C12514m0(this.f35947e));
            return findViewById;
        }
    }

    /* renamed from: qj1.l0$d */
    public /* synthetic */ class C12497d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35948a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[118] = 1;
            f35948a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12490l0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35926p = bVar;
        LinkedList<View> linkedList = new LinkedList<>();
        this.f35928r = linkedList;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.jjn);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.s…pping_entrance_container)");
        C13764a aVar = new C13764a((ViewGroup) findViewById, bVar, this);
        linkedList.add(aVar.f38868a);
        this.f35929s = aVar;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fou);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.link_entrance_container)");
        C8986g0 g0Var = new C8986g0((ViewGroup) findViewById2, bVar, this);
        linkedList.add(g0Var.f28392a);
        this.f35930t = g0Var;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.mtw);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.multi_stream_container)");
        C60526t5 t5Var = new C60526t5((ViewGroup) findViewById3, bVar, this);
        linkedList.add(t5Var.f172514a);
        this.f35931u = t5Var;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.ged);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…money_entrance_container)");
        C8967f0 f0Var = new C8967f0((ViewGroup) findViewById4, bVar, this);
        linkedList.add(f0Var.f28341a);
        this.f35932v = f0Var;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.g7p);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.lottery_entrance_container)");
        C13021d dVar = new C13021d((ViewGroup) findViewById5, bVar, this);
        linkedList.add(dVar.f37084a);
        this.f35933w = dVar;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.dh5);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.f…ve_camera_opt_click_area)");
        C9077o oVar = new C9077o((ViewGroup) findViewById6, bVar, this);
        linkedList.add(oVar.f28635a);
        this.f35934x = oVar;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.h6c);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.music_entrance_container)");
        C9068n nVar = new C9068n((ViewGroup) findViewById7, bVar, this);
        linkedList.add(nVar.f28612a);
        this.f35935y = nVar;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.dld);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.f…_team_entrance_container)");
        C9139v vVar = new C9139v((ViewGroup) findViewById8, bVar, this);
        linkedList.add(vVar.f28784a);
        this.f35936z = vVar;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.nhb);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.vote_entrance)");
        C14380b bVar2 = new C14380b((ViewGroup) findViewById9, bVar, this);
        linkedList.add(bVar2.f39942a);
        this.f35922A = bVar2;
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.j3g);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.s…share_entrance_container)");
        this.f35923B = new C8993g6((ViewGroup) findViewById10, bVar, this);
        this.f35924C = C36568h.m40985a(new C12496f(viewGroup, this));
        View findViewById11 = viewGroup.findViewById(C0966R.C0970id.gzw);
        C87412m.m108593f(findViewById11, "root.findViewById(R.id.m…ption_entrance_container)");
        this.f35925D = new C9023j0((ViewGroup) findViewById11, bVar, this);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (!mo82893g0() && !C62042e.f176370a.mo87073d1(mo87684A0())) {
            viewGroup.post(new C12491a(viewGroup, i, this));
        }
        C12492b bVar3 = new C12492b(this, viewGroup, i);
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        C107207u.C107213g.m145236u(viewGroup, bVar3);
        f0Var.f28344d.setOnClickListener(new C12493c(this));
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        C13021d dVar = this.f35933w;
        dVar.getClass();
        String str = "";
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", str) : null;
        if (string != null) {
            str = string;
        }
        if (C87412m.m108589b(str, "PORTRAIT_ACTION_GOTO_CREATE_LOTTERY")) {
            dVar.mo12529b();
        }
    }

    /* renamed from: Z0 */
    public final void mo12140Z0() {
        C61926c.m72668M(new C12495e(this));
    }

    /* renamed from: a1 */
    public final void mo12141a1() {
        boolean a = this.f35933w.mo12528a();
        int i = 0;
        if (this.f35932v.f28341a.getVisibility() == 0) {
            this.f35933w.mo12531d(8);
            return;
        }
        C13021d dVar = this.f35933w;
        if (!a) {
            i = 8;
        }
        dVar.mo12531d(i);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo12142b1() {
        int i;
        C54067f0.C0062l lVar = C54067f0.C0062l.LIVING;
        Class cls = C54108o.class;
        Class cls2 = C54991o.class;
        this.f35929s.mo13128f(true);
        this.f35930t.mo9799b();
        C9077o oVar = this.f35934x;
        if (oVar.f28635a.getVisibility() != 0 || oVar.f28641g) {
            oVar.f28641g = false;
            ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.FRAME, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
            C54991o oVar2 = (C54991o) FinderLiveService.f159376d.mo77630e(cls2);
            if (oVar2 != null && oVar2.mo75960G3()) {
                C16217b bVar = C16217b.f43438a;
                Context context = oVar.f28635a.getContext();
                C16217b.m15108i(bVar, context instanceof C0125s ? (C0125s) context : null, oVar.f28640f, oVar.f28642h, (View) null, oVar.f28643i, 8, (Object) null);
                Context context2 = oVar.f28635a.getContext();
                bVar.mo14754k(context2 instanceof C0125s ? (C0125s) context2 : null, "startlive.bottom.audiosetting", true);
            } else {
                C62889n0 n0Var = (C62889n0) oVar.f28637c.mo87687E0(C62889n0.class);
                if (n0Var != null && n0Var.mo87838s()) {
                    C16217b bVar2 = C16217b.f43438a;
                    Context context3 = oVar.f28635a.getContext();
                    C16217b.m15108i(bVar2, context3 instanceof C0125s ? (C0125s) context3 : null, oVar.f28639e, oVar.f28642h, (View) null, oVar.f28643i, 8, (Object) null);
                    Context context4 = oVar.f28635a.getContext();
                    bVar2.mo14754k(context4 instanceof C0125s ? (C0125s) context4 : null, "startlive.bottom.videosetting", true);
                }
            }
            C62889n0 n0Var2 = (C62889n0) oVar.f28637c.mo87687E0(C62889n0.class);
            if (n0Var2 != null) {
                n0Var2.f178466W0 = oVar.f28642h;
            }
            C16217b bVar3 = C16217b.f43438a;
            bVar3.mo14751g(oVar.f28639e);
            bVar3.mo14751g(oVar.f28640f);
        }
        C62042e eVar = C62042e.f176370a;
        if (eVar.mo87073d1(oVar.f28637c.mo87684A0()) || eVar.mo87035Q0(oVar.f28637c.mo87684A0())) {
            oVar.f28635a.setVisibility(8);
        } else {
            oVar.f28635a.setVisibility(0);
        }
        C9068n nVar = this.f35935y;
        boolean z = ((C54991o) nVar.f28614c.mo87696x0(cls2)).f154305d3;
        boolean z2 = C60251a.f171781k1 != null;
        boolean g = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC, false);
        boolean z3 = C32444a.f86189r.mo60266n().intValue() == 1;
        boolean z4 = g || z3;
        boolean z5 = eVar.mo86991B(nVar.f28614c.mo87684A0()) && eVar.mo87027N0();
        if ((z2 && z4 && !z) || !z5) {
            ((WeImageView) nVar.f28612a.findViewById(C0966R.C0970id.dtn)).setImageDrawable(C74933u4.m89768e(nVar.f28612a.getContext(), C0966R.raw.icon_song_filled, nVar.f28612a.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8)));
        }
        String str = nVar.f28615d;
        Log.m105924i(str, "checkVisible enableSingSongListFromBack: " + g + ", enableSwitch: " + z3 + ", isGameLive: " + z + ", isSecond: " + z2);
        if (z2) {
            if (z && (z5 || z4)) {
                nVar.mo9893a();
                nVar.f28612a.setVisibility(0);
            } else if (z4) {
                nVar.mo9893a();
                nVar.f28612a.setVisibility(0);
            } else {
                nVar.f28612a.setVisibility(8);
            }
        } else if (z5 || z4) {
            nVar.mo9893a();
            nVar.f28612a.setVisibility(0);
        } else {
            nVar.f28612a.setVisibility(8);
        }
        this.f35931u.mo85493a(true);
        boolean a = this.f35933w.mo12528a();
        C8967f0 f0Var = this.f35932v;
        if (((C54991o) f0Var.f28343c.mo87684A0().mo71262a(cls2)).mo75965J3()) {
            if (f0Var.f28341a.getVisibility() != 0 || f0Var.f28346f) {
                f0Var.f28346f = false;
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(a ? C54067f0.C0066n.LUCKDRAW : C54067f0.C0066n.REDPACKET, ((C54108o) C86312j.m106911c(cls)).Ex0(lVar));
                C16217b.f43438a.mo14751g(f0Var.f28347g);
            }
            f0Var.f28341a.setVisibility(0);
        } else {
            f0Var.f28341a.setVisibility(8);
        }
        mo12141a1();
        mo12143c1();
        LinkedList<View> linkedList = this.f35928r;
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            int i2 = 0;
            for (View visibility : linkedList) {
                if ((visibility.getVisibility() == 0) && (i2 = i2 + 1) < 0) {
                    C64197v.m75541j();
                    throw null;
                }
            }
            i = i2;
        } else {
            i = 0;
        }
        if (i > 0) {
            mo10792g(0);
        } else {
            mo10792g(8);
        }
    }

    /* renamed from: c1 */
    public final void mo12143c1() {
        int i;
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderLiveVotingSwitch", 0) == 1 && !C61926c.m72696u(((C54991o) mo87696x0(C54991o.class)).f154388y0, 131072);
        C62042e eVar = C62042e.f176370a;
        int i2 = 8;
        if (eVar.mo87035Q0(mo87684A0()) || eVar.mo87073d1(mo87684A0())) {
            C58739j4 j4Var = C58739j4.f168176a;
            if (!j4Var.mo83689R() || !z) {
                View view = (View) ((C36570n) this.f35924C).getValue();
                if (j4Var.mo83689R()) {
                    C45795b A0 = mo87684A0();
                    if (A0 != null) {
                        C7329b.m7473b(C7329b.f25441a, A0, 1, 0, (String) null, 0, 28, (Object) null);
                    }
                    i = 0;
                } else {
                    i = 8;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C14380b bVar = this.f35922A;
                if (z) {
                    i2 = 0;
                }
                bVar.mo13684a(i2);
                this.f35925D.mo9840a(false);
            } else {
                this.f35925D.mo9840a(true);
                View view3 = (View) ((C36570n) this.f35924C).getValue();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f35922A.mo13684a(8);
            }
            this.f35923B.mo9802c(false);
        } else if (C58739j4.f168176a.mo83689R() || z) {
            View view5 = (View) ((C36570n) this.f35924C).getValue();
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35922A.mo13684a(8);
            this.f35925D.mo9840a(true);
            this.f35923B.mo9802c(false);
        } else {
            View view7 = (View) ((C36570n) this.f35924C).getValue();
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorBottomOptionPlugin", "checkPromoteAndVoteOptionsVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f35922A.mo13684a(8);
            this.f35925D.mo9840a(false);
            this.f35923B.mo9802c(true);
        }
    }

    /* renamed from: d1 */
    public final void mo12144d1() {
        C54795n5 D0;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f).intValue();
        if (intValue != 0 && intValue != 1) {
            C76912y0.makeText(this.f166287d.getContext(), (CharSequence) this.f166287d.getContext().getResources().getString(C0966R.string.dur), 0).show();
        } else if ((this.f166287d.getContext() instanceof Activity) && (D0 = mo14476D0()) != null) {
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            D0.mo75717U((Activity) context);
        }
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12145e1() {
        /*
            r17 = this;
            r0 = r17
            il1.g0 r1 = r0.f35930t
            ak1.f0$y r2 = ak1.C54067f0.C54087y.LINKMIC_ICON_READDOT_EXPOSE
            java.lang.Class<ak1.o> r3 = ak1.C54108o.class
            java.lang.Class<cl1.d0> r4 = cl1.C54963d0.class
            qj1.c r5 = r1.f28394c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r4)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.f154073p
            java.lang.String r6 = r1.f28395d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "updateApplyLinkInfo newApplyCount:"
            r7.append(r8)
            qj1.c r8 = r1.f28394c
            androidx.lifecycle.i0 r8 = r8.mo87696x0(r4)
            cl1.d0 r8 = (cl1.C54963d0) r8
            int r8 = r8.mo75908O3()
            r7.append(r8)
            java.lang.String r8 = ", curLinkUser:"
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            android.widget.TextView r5 = r1.f28397f
            r6 = 8
            r5.setVisibility(r6)
            android.view.View r5 = r1.f28399h
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15.mo10233c(r6)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget"
            java.lang.String r10 = "updateApplyLinkInfo"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r5
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            r6 = 0
            java.lang.Object r7 = r15.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r5.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget"
            java.lang.String r9 = "updateApplyLinkInfo"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r5
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            qj1.c r5 = r1.f28394c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r4)
            cl1.d0 r5 = (cl1.C54963d0) r5
            int r5 = r5.mo75909P3()
            r7 = 0
            r8 = -1
            if (r5 <= 0) goto L_0x00f5
            android.view.View r4 = r1.f28399h
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r9)
            java.lang.Object[] r10 = r5.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget"
            java.lang.String r12 = "updateApplyLinkInfo"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r4
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMicEntranceWidget"
            java.lang.String r11 = "updateApplyLinkInfo"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.o r3 = (ak1.C54108o) r3
            android.widget.TextView r4 = r1.f28400i
            java.lang.CharSequence r4 = r4.getText()
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x00f1
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
        L_0x00f1:
            r3.Xx0(r2, r7, r8, r8)
            goto L_0x0144
        L_0x00f5:
            qj1.c r5 = r1.f28394c
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r4)
            cl1.d0 r5 = (cl1.C54963d0) r5
            int r5 = r5.mo75908O3()
            if (r5 <= 0) goto L_0x0144
            android.widget.TextView r5 = r1.f28397f
            ok1.e r9 = ok1.C62042e.f176370a
            qj1.c r10 = r1.f28394c
            androidx.lifecycle.i0 r4 = r10.mo87696x0(r4)
            cl1.d0 r4 = (cl1.C54963d0) r4
            int r4 = r4.mo75908O3()
            r9.getClass()
            if (r4 > 0) goto L_0x011b
            java.lang.String r4 = "0"
            goto L_0x0126
        L_0x011b:
            r9 = 100
            if (r4 >= r9) goto L_0x0124
            java.lang.String r4 = java.lang.String.valueOf(r4)
            goto L_0x0126
        L_0x0124:
            java.lang.String r4 = "..."
        L_0x0126:
            r5.setText(r4)
            android.widget.TextView r4 = r1.f28397f
            r4.setVisibility(r6)
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.o r3 = (ak1.C54108o) r3
            android.widget.TextView r4 = r1.f28397f
            java.lang.CharSequence r4 = r4.getText()
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0141
            r7 = r4
            java.lang.String r7 = (java.lang.String) r7
        L_0x0141:
            r3.Xx0(r2, r7, r8, r8)
        L_0x0144:
            r1.mo9798a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C12490l0.mo12145e1():void");
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
        C9139v vVar = this.f35936z;
        ((C54991o) vVar.f28786c.mo87684A0().mo71262a(C54991o.class)).f154290Z3.observe(vVar.f28786c, new C9155w(vVar));
    }

    /* renamed from: k0 */
    public void mo8400k0(int i, int i2, Intent intent) {
        C13053n nVar;
        String str = this.f35927q;
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult requestCode:");
        sb.append(i);
        sb.append(",resultCode is ok:");
        sb.append(i2 == -1);
        Log.m105924i(str, sb.toString());
        C13021d dVar = this.f35933w;
        dVar.getClass();
        if (i == 1002 && i2 == -1) {
            Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1)) : null;
            String str2 = dVar.f37087d;
            Log.m105924i(str2, "onActivityResult Source:" + valueOf);
            C58124b.C7172a.m7372a(dVar.f37085b, C58124b.C58125b.FINDER_LIVE_CREATE_LOTTERY_SUCCESS, (Bundle) null, 2, (Object) null);
            C11207i.m11065a(dVar.f37086c, C53872d1.f151119c, (C53934p0) null, new C13017b(dVar, (C15601d<? super C13017b>) null), 2, (Object) null);
            if (valueOf != null && valueOf.intValue() == 0 && (nVar = dVar.f37089f) != null) {
                nVar.mo12558d();
            }
        }
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12497d.f35948a[bVar.ordinal()] == 1) {
            this.f35930t.mo9799b();
            this.f35931u.mo85493a(true);
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        Class cls = C54991o.class;
        super.mo3211w0();
        C13053n nVar = this.f35933w.f37089f;
        if (nVar != null) {
            nVar.f28738f = null;
            nVar.mo12558d();
            nVar.f37181q.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
            C13044k kVar = nVar.f37190z;
            kVar.f37154e = null;
            kVar.f37155f = null;
            RecyclerView.C16622o oVar = nVar.f37189y;
            if (oVar != null) {
                nVar.f37185u.mo17096l1(oVar);
            }
        }
        C9139v vVar = this.f35936z;
        C54991o oVar2 = (C54991o) vVar.f28786c.mo87696x0(cls);
        oVar2.f154302c4.postValue("");
        C54219z<Boolean> zVar = oVar2.f154290Z3;
        Boolean bool = Boolean.FALSE;
        zVar.postValue(bool);
        oVar2.f154294a4 = null;
        oVar2.f154306d4 = "";
        vVar.f28784a.setVisibility(8);
        C13764a aVar = this.f35929s;
        aVar.getClass();
        C16217b.f43438a.mo14746c(aVar.f38878k);
        C13053n nVar2 = this.f35933w.f37089f;
        if (nVar2 != null) {
            nVar2.f28738f = null;
            nVar2.mo12558d();
            nVar2.f37181q.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
            C13044k kVar2 = nVar2.f37190z;
            kVar2.f37154e = null;
            kVar2.f37155f = null;
            RecyclerView.C16622o oVar3 = nVar2.f37189y;
            if (oVar3 != null) {
                nVar2.f37185u.mo17096l1(oVar3);
            }
        }
        C9139v vVar2 = this.f35936z;
        C54991o oVar4 = (C54991o) vVar2.f28786c.mo87696x0(cls);
        oVar4.f154302c4.postValue("");
        oVar4.f154290Z3.postValue(bool);
        oVar4.f154294a4 = null;
        oVar4.f154306d4 = "";
        vVar2.f28784a.setVisibility(8);
    }
}
