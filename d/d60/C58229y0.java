package d60;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i60.C60253g;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import y50.C66519j0;
import zt3.C119157j;

/* renamed from: d60.y0 */
public final class C58229y0 extends C58121a implements View.OnClickListener {

    /* renamed from: f */
    public final C58124b f166745f;

    /* renamed from: g */
    public final View f166746g;

    /* renamed from: h */
    public final TextView f166747h;

    /* renamed from: i */
    public final Button f166748i;

    /* renamed from: j */
    public final RecyclerView f166749j;

    /* renamed from: n */
    public final ViewGroup f166750n;

    /* renamed from: o */
    public final View f166751o;

    /* renamed from: p */
    public final C60253g f166752p;

    /* renamed from: q */
    public final C58241z1 f166753q = new C58241z1();

    /* renamed from: d60.y0$a */
    public static final class C58230a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58229y0 f166754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58230a(C58229y0 y0Var) {
            super(0);
            this.f166754d = y0Var;
        }

        public Object invoke() {
            C58229y0 y0Var = this.f166754d;
            y0Var.f166748i.setEnabled(!y0Var.f166752p.f171786f.isEmpty());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.y0$b */
    public static final class C58231b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C58229y0 f166755d;

        public C58231b(C58229y0 y0Var) {
            this.f166755d = y0Var;
        }

        public void onAnimationEnd(Animator animator) {
            C58124b.C7172a.m7372a(this.f166755d.f166745f, C58124b.C58125b.HIDE_SHARE_LIST, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58229y0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        ViewGroup viewGroup2 = viewGroup;
        C58124b bVar2 = bVar;
        C87412m.m108594g(viewGroup2, "root");
        C87412m.m108594g(bVar2, "statusMonitor");
        this.f166745f = bVar2;
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.fyv);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_share_rooms_loading)");
        this.f166746g = findViewById;
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.fyo);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.live_share_rooms_empty_tip)");
        TextView textView = (TextView) findViewById2;
        this.f166747h = textView;
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.fym);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.live_share_rooms_close_btn)");
        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.fyp);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…e_share_rooms_finish_btn)");
        Button button = (Button) findViewById4;
        this.f166748i = button;
        View findViewById5 = viewGroup2.findViewById(C0966R.C0970id.fyu);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.live_share_rooms_list_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f166749j = recyclerView;
        View findViewById6 = viewGroup2.findViewById(C0966R.C0970id.fyn);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.l…share_rooms_content_area)");
        ViewGroup viewGroup3 = (ViewGroup) findViewById6;
        this.f166750n = viewGroup3;
        View findViewById7 = viewGroup2.findViewById(C0966R.C0970id.fyl);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.l…e_share_rooms_blank_area)");
        this.f166751o = findViewById7;
        C60253g gVar = new C60253g();
        this.f166752p = gVar;
        gVar.f171787g = new C58230a(this);
        recyclerView.setAdapter(gVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext()));
        viewGroup3.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "<init>", "(Landroid/view/ViewGroup;Lcom/tencent/mm/live/plugin/ILiveStatus;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(8);
        recyclerView.setVisibility(8);
        ((ViewGroup) findViewById3).setOnClickListener(this);
        button.setOnClickListener(this);
        findViewById7.setOnClickListener(this);
    }

    /* renamed from: j0 */
    public String mo82894j0() {
        return C58229y0.class.getSimpleName();
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        mo82970x0();
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        boolean z = true;
        if ((valueOf == null || valueOf.intValue() != C0966R.C0970id.fym) && (valueOf == null || valueOf.intValue() != C0966R.C0970id.fyl)) {
            z = false;
        }
        if (z) {
            mo82970x0();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fyp) {
            for (String h : this.f166752p.f171786f) {
                C66519j0.f191358d.mo90604h(h);
            }
            C58124b.C7172a.m7372a(this.f166745f, C58124b.C58125b.HIDE_SHARE_LIST, (Bundle) null, 2, (Object) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveShareRoomsPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 11) {
            mo10792g(0);
            this.f166748i.setEnabled(false);
            this.f166752p.f171786f.clear();
            this.f166750n.post(new C58240z0(this));
            C58241z1 z1Var = this.f166753q;
            C58123a1 a1Var = new C58123a1(this);
            z1Var.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C58232y1(a1Var));
        } else if (ordinal == 31) {
            mo10792g(8);
        }
    }

    /* renamed from: x0 */
    public final void mo82970x0() {
        ViewPropertyAnimator translationY = this.f166750n.animate().translationY((float) C75044y4.m89990b(this.f166287d.getContext()).y);
        translationY.setListener(new C58231b(this));
        translationY.start();
    }
}
