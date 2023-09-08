package ny2;

import com.tencent.p014mm.autogen.mmdata.rpt.TeenModeBindStruct;
import com.tencent.p014mm.contact.C40294d;
import com.tencent.p014mm.plugin.teenmode.p111ui.BindGuardianUI;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C45628s0;
import gy3.C87412m;
import hp3.C87581a;
import o40.C61926c;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: ny2.g */
public final class C11312g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f33265a;

    /* renamed from: b */
    public final /* synthetic */ BindGuardianUI f33266b;

    public C11312g(C89779i0 i0Var, BindGuardianUI bindGuardianUI) {
        this.f33265a = i0Var;
        this.f33266b = bindGuardianUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f33265a.dismiss();
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            C72996z1 z1Var = this.f33266b.f21447f;
            C87412m.m108591d(z1Var);
            C72996z1 k = C45628s0.m50782k(z1Var.getUsername());
            int type = k.getType();
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C40294d.f108318T1;
            k.setType(type & -1073741825);
            C45628s0.m50763a0(k);
            TeenModeBindStruct teenModeBindStruct = new TeenModeBindStruct();
            teenModeBindStruct.f10067d = 2;
            teenModeBindStruct.f10068e = 1;
            teenModeBindStruct.f10069f = 1;
            C72996z1 z1Var2 = this.f33266b.f21447f;
            C87412m.m108591d(z1Var2);
            teenModeBindStruct.f10070g = teenModeBindStruct.mo86045b("targetUsername", z1Var2.getUsername(), true);
            teenModeBindStruct.mo86054n();
            C61926c.m72666K(200, C11311f.f33264d);
        } else {
            BindGuardianUI.m5439H7(this.f33266b, cVar.f256795c);
        }
        return C13598b0.f38549a;
    }
}
