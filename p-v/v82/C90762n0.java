package v82;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.multitalk.p078ui.MultiTalkMainUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v82.n0 */
public final class C90762n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111456j0 f260656d;

    /* renamed from: v82.n0$a */
    public static final class C90763a implements C85878m2.C85879a {

        /* renamed from: a */
        public final /* synthetic */ C111456j0 f260657a;

        public C90763a(C111456j0 j0Var) {
            this.f260657a = j0Var;
        }

        /* renamed from: a */
        public void mo4167a() {
            this.f260657a.mo163153d().setBackgroundResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4168b() {
            this.f260657a.mo163153d().setBackgroundResource(C0966R.raw.icons_outlined_merge);
        }
    }

    public C90762n0(C111456j0 j0Var) {
        this.f260656d = j0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$initButtonSplit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MultiTalkMainUI multiTalkMainUI = this.f260656d.f333691a;
        multiTalkMainUI.f314901u = true;
        C85878m2.m106216e(multiTalkMainUI.getTaskId(), new C90763a(this.f260656d));
        if (C85875k4.m106199o0()) {
            C85861e4.m106119f(this.f260656d.f333691a, true, true, (C85861e4.C85862a) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$initButtonSplit$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
