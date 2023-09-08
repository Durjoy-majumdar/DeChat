package qk1;

import com.tencent.p014mm.p136ui.contact.C74551q1;
import com.tencent.p014mm.p136ui.contact.MMBaseSelectContactUI;
import gl3.C75922b;
import gy3.C87412m;
import java.util.List;
import p240sx.C77804m;
import p240sx.C77805n;
import p418rx.C77578g;

/* renamed from: qk1.l2 */
public final class C77359l2 extends C74551q1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77359l2(MMBaseSelectContactUI mMBaseSelectContactUI, List<String> list, boolean z) {
        super(mMBaseSelectContactUI, list, z, 0);
        C87412m.m108594g(mMBaseSelectContactUI, "selectContactUI");
    }

    /* renamed from: d */
    public C75922b mo103610d(int i, int i2) {
        C77360t1 t1Var = new C77360t1(i2);
        t1Var.f225558B = this.f219055d.getActivity().getResources().getString(i);
        return t1Var;
    }

    /* renamed from: f */
    public C75922b mo103611f(int i) {
        C77355e2 e2Var = new C77355e2(i);
        C77804m mVar = this.f219151j;
        e2Var.f222619p = ((C77578g) mVar).f226168n;
        C87412m.m108592e(mVar, "null cannot be cast to non-null type com.tencent.mm.feature.selectcontact.api.IMMSearchContactDelegateExt");
        e2Var.f225549D = ((C77805n) mVar).mo107751b().get((i - ((C77578g) this.f219151j).f226160f) - 1);
        e2Var.f222608e = this.f219057f;
        return e2Var;
    }
}
