package ny2;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TeenModeBindStruct;
import com.tencent.p014mm.plugin.teenmode.p111ui.BindGuardianMsgUI;
import gy3.C87412m;
import hp3.C87581a;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: ny2.d */
public final class C11309d<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C89779i0 f33261a;

    /* renamed from: b */
    public final /* synthetic */ BindGuardianMsgUI f33262b;

    public C11309d(C89779i0 i0Var, BindGuardianMsgUI bindGuardianMsgUI) {
        this.f33261a = i0Var;
        this.f33262b = bindGuardianMsgUI;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f33261a.dismiss();
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            TeenModeBindStruct teenModeBindStruct = new TeenModeBindStruct();
            teenModeBindStruct.f10067d = 1;
            teenModeBindStruct.f10068e = 2;
            teenModeBindStruct.f10069f = 2;
            BindGuardianMsgUI bindGuardianMsgUI = this.f33262b;
            int i = BindGuardianMsgUI.f21421p;
            teenModeBindStruct.f10070g = teenModeBindStruct.mo86045b("targetUsername", bindGuardianMsgUI.mo6583I7(), true);
            return Boolean.valueOf(teenModeBindStruct.mo86054n());
        }
        BindGuardianMsgUI bindGuardianMsgUI2 = this.f33262b;
        String str = cVar.f256795c;
        int i2 = BindGuardianMsgUI.f21421p;
        TextView textView = (TextView) bindGuardianMsgUI2.findViewById(C0966R.C0970id.ckx);
        textView.setVisibility(0);
        if (str == null) {
            str = bindGuardianMsgUI2.getString(C0966R.string.f7965xp);
            C87412m.m108593f(str, "getString(com.tencent.mm….app_err_server_busy_tip)");
        }
        textView.setText(str);
        return C13598b0.f38549a;
    }
}
