package qj1;

import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: qj1.bd */
public final class C12256bd extends C62660c {

    /* renamed from: p */
    public final C58124b f35336p;

    /* renamed from: q */
    public final LinearLayout f35337q;

    /* renamed from: r */
    public final View f35338r;

    /* renamed from: s */
    public final View f35339s;

    /* renamed from: t */
    public C32224a<C13598b0> f35340t;

    /* renamed from: qj1.bd$a */
    public static final class C12257a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f35341d;

        public C12257a(ViewGroup viewGroup) {
            this.f35341d = viewGroup;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f35341d.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += C75044y4.m89991c(this.f35341d.getContext());
        }
    }

    /* renamed from: qj1.bd$b */
    public static final class C12258b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12256bd f35342d;

        public C12258b(C12256bd bdVar) {
            this.f35342d = bdVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f35342d.mo11967Z0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.bd$c */
    public static final class C12259c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12256bd f35343d;

        public C12259c(C12256bd bdVar) {
            this.f35343d = bdVar;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.LOTTERY, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C12490l0 l0Var = (C12490l0) this.f35343d.mo87687E0(C12490l0.class);
            if (l0Var != null) {
                l0Var.f35933w.mo12530c();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.bd$d */
    public static final class C12260d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12256bd f35344d;

        public C12260d(C12256bd bdVar) {
            this.f35344d = bdVar;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.REDPACKET, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            C12490l0 l0Var = (C12490l0) this.f35344d.mo87687E0(C12490l0.class);
            if (l0Var != null) {
                l0Var.mo12144d1();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveOptionPanelPlugin$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.bd$e */
    public static final class C12261e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C12256bd f35345d;

        public C12261e(C12256bd bdVar) {
            this.f35345d = bdVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f35345d.f166287d.setVisibility(8);
            C32224a<C13598b0> aVar = this.f35345d.f35340t;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f35345d.f166287d.setVisibility(8);
            C32224a<C13598b0> aVar = this.f35345d.f35340t;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12256bd(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f35336p = bVar;
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(C0966R.C0970id.dqv);
        this.f35337q = linearLayout;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.dqw);
        this.f35338r = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.dqz);
        this.f35339s = findViewById2;
        if (!mo82893g0()) {
            viewGroup.post(new C12257a(viewGroup));
        }
        linearLayout.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        viewGroup.setOnClickListener(new C12258b(this));
        findViewById.setOnClickListener(new C12259c(this));
        findViewById2.setOnClickListener(new C12260d(this));
    }

    /* renamed from: Z0 */
    public final void mo11967Z0() {
        this.f35337q.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y).setDuration(200).setListener(new C12261e(this)).start();
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
        mo11967Z0();
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }
}
