package il1;

import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import lc3.C10485b;
import o40.C61926c;
import qj1.C12632r2;
import qj1.C62660c;
import rx3.C13598b0;
import zj1.C16217b;

/* renamed from: il1.j0 */
public final class C9023j0 {

    /* renamed from: a */
    public final ViewGroup f28495a;

    /* renamed from: b */
    public final C58124b f28496b;

    /* renamed from: c */
    public final C62660c f28497c;

    /* renamed from: d */
    public boolean f28498d = true;

    /* renamed from: e */
    public final View f28499e;

    /* renamed from: f */
    public final String f28500f;

    /* renamed from: il1.j0$a */
    public static final class C9024a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9023j0 f28501d;

        /* renamed from: il1.j0$a$a */
        public static final class C9025a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C9025a f28502d = new C9025a();

            public C9025a() {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                return C13598b0.f38549a;
            }
        }

        public C9024a(C9023j0 j0Var) {
            this.f28501d = j0Var;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMoreOptionEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.MOREFUNCTION, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C12632r2 r2Var = (C12632r2) this.f28501d.f28497c.mo87687E0(C12632r2.class);
            if (r2Var != null) {
                r2Var.f36196A = C9025a.f28502d;
                String str = r2Var.f36199q;
                StringBuilder sb = new StringBuilder();
                sb.append("promote is open: ");
                C58739j4 j4Var = C58739j4.f168176a;
                sb.append(j4Var.mo83689R());
                Log.m105924i(str, sb.toString());
                if (j4Var.mo83689R()) {
                    View view2 = r2Var.f36201s;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C16217b.f43438a.mo14751g(r2Var.f36207y);
                } else {
                    View view3 = r2Var.f36201s;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderLiveVotingSwitch", 0) == 1;
                boolean u = C61926c.m72696u(((C54991o) r2Var.mo87696x0(C54991o.class)).f154388y0, 131072);
                if (!z || u) {
                    View view5 = r2Var.f36202t;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View view7 = r2Var.f36202t;
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view8 = view7;
                    C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorMoreOptionPanelPlugin", "checkItemVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C16217b.f43438a.mo14751g(r2Var.f36208z);
                }
                C16217b.f43438a.mo14751g(r2Var.f36206x);
                r2Var.f166287d.setVisibility(0);
                r2Var.mo12220a1(true);
                r2Var.f166287d.animate().translationY(0.0f).setDuration(200).setListener((Animator.AnimatorListener) null).start();
            }
            C16217b.f43438a.mo14745b(this.f28501d.f28500f, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMoreOptionEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9023j0(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f28495a = viewGroup;
        this.f28496b = bVar;
        this.f28497c = cVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.on6);
        this.f28499e = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.on4);
        this.f28500f = "anchorlive.bottom.tools";
        viewGroup.setOnClickListener(new C9024a(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.tools", findViewById, (View) null, textView, 8, (Object) null);
    }

    /* renamed from: a */
    public final void mo9840a(boolean z) {
        Class cls = C54108o.class;
        ViewGroup viewGroup = this.f28495a;
        int i = 0;
        if (z) {
            if (viewGroup.getVisibility() != 0) {
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.MOREFUNCTION, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
                if (this.f28498d) {
                    C16217b.f43438a.mo14751g(this.f28500f);
                    this.f28498d = false;
                }
            }
            C45795b A0 = this.f28497c.mo87684A0();
            if (A0 != null) {
                C7329b.m7473b(C7329b.f25441a, A0, 1, 0, (String) null, 0, 28, (Object) null);
            }
        } else {
            i = 8;
        }
        viewGroup.setVisibility(i);
    }
}
