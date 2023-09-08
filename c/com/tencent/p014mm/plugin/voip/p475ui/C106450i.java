package com.tencent.p014mm.plugin.voip.p475ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.plugin.voip.ui.i */
public class C106450i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ NewVoipVideoFragment f317984d;

    public C106450i(NewVoipVideoFragment newVoipVideoFragment) {
        this.f317984d = newVoipVideoFragment;
    }

    public void onClick(View view) {
        VoIPFuncIconLayout voIPFuncIconLayout;
        View view2;
        View view3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z = true;
        char c = 4;
        C115669n.INSTANCE.mo160131h(11079, 4);
        C106476z zVar = this.f317984d.f317913D;
        if (zVar != null) {
            VoIPFuncIconLayout voIPFuncIconLayout2 = zVar.f318034d;
            if (!(voIPFuncIconLayout2 != null && voIPFuncIconLayout2.isShown())) {
                c = 0;
            }
            int i = c == 0 ? 0 : 8;
            if (i == 0) {
                C106444e0 e0Var = this.f317984d.f317911B;
                if (!(e0Var == null || (view3 = e0Var.f317976b) == null)) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI", "showUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/voip/ui/VoIPTopControlUI", "showUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C106476z zVar2 = this.f317984d.f317913D;
                if (!(zVar2 == null || (view2 = zVar2.f318036f) == null)) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view5 = view2;
                    C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI", "showUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI", "showUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f317984d.f317808M.setImportantForAccessibility(1);
                NewVoipVideoFragment newVoipVideoFragment = this.f317984d;
                newVoipVideoFragment.f317808M.setContentDescription(newVoipVideoFragment.getString(C0966R.string.kj8));
                this.f317984d.mo152977f0();
            } else {
                C106444e0 e0Var2 = this.f317984d.f317911B;
                if (e0Var2 != null) {
                    e0Var2.mo152998a();
                }
                this.f317984d.f317808M.setImportantForAccessibility(1);
                NewVoipVideoFragment newVoipVideoFragment2 = this.f317984d;
                newVoipVideoFragment2.f317808M.setContentDescription(newVoipVideoFragment2.getString(C0966R.string.kjd));
            }
            View view6 = this.f317984d.f317925p;
            if (view6 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(i));
                View view7 = view6;
                C117292a.m165358d(view7, aVar3.mo10232b(), "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view7, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view8 = this.f317984d.f317926q;
            if (view8 != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(Integer.valueOf(i));
                View view9 = view8;
                C117292a.m165358d(view9, aVar4.mo10232b(), "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f317984d.f317810P.setVisibility(i);
            C106476z zVar3 = this.f317984d.f317913D;
            if (zVar3 != null) {
                VoIPFuncIconLayout voIPFuncIconLayout3 = zVar3.f318034d;
                if (voIPFuncIconLayout3 != null) {
                    voIPFuncIconLayout3.setVisibility(i);
                }
                VoIPFuncIconLayout voIPFuncIconLayout4 = zVar3.f318035e;
                if (voIPFuncIconLayout4 != null) {
                    voIPFuncIconLayout4.setVisibility(i);
                }
                C106440b0 b0Var = zVar3.f318037g;
                if (!(b0Var == null || (voIPFuncIconLayout = b0Var.f317968g) == null)) {
                    voIPFuncIconLayout.setVisibility(i);
                }
            }
            NewVoipVideoFragment newVoipVideoFragment3 = this.f317984d;
            if (i != 0) {
                z = false;
            }
            if (!z) {
                newVoipVideoFragment3.getActivity().getWindow().setFlags(1024, 1024);
            } else {
                newVoipVideoFragment3.getActivity().getWindow().clearFlags(1024);
            }
            if (C90188n0.m112865a()) {
                this.f317984d.f317815S.setVisibility(i);
                this.f317984d.f317817T.setVisibility(i);
                this.f317984d.f317819U.setVisibility(i);
                this.f317984d.f317821V.setVisibility(i);
                this.f317984d.f317823W.setVisibility(i);
                this.f317984d.f317825X.setVisibility(i);
                this.f317984d.f317827Y.setVisibility(i);
            }
            if (c == 0) {
                this.f317984d.mo152897l0();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/NewVoipVideoFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
