package xz2;

import com.tencent.p014mm.sdk.platformtools.Log;
import qy2.C63349b0;
import uz2.C65489g0;
import uz2.C65492p;

/* renamed from: xz2.u */
public final class C66466u implements C63349b0 {

    /* renamed from: a */
    public final /* synthetic */ C63349b0 f191229a;

    public C66466u(C63349b0 b0Var) {
        this.f191229a = b0Var;
    }

    public final void onFinishAction(int i, String str, C65489g0 g0Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("onFinishAction result:");
        sb.append(i);
        sb.append(", errMsg:");
        sb.append(str);
        sb.append(", resultInfo:");
        String str2 = null;
        if (g0Var != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("resultInfo: action:");
            sb4.append(g0Var.f188443d);
            sb4.append(" ResultSetTextStatus:");
            C65492p pVar = g0Var.f188444e;
            if (pVar != null) {
                str2 = "iconId:" + pVar.f188456e + " iconDesc:" + pVar.f188455d;
            }
            sb4.append(str2);
            str2 = sb4.toString();
        }
        sb.append(str2);
        Log.m105924i("MicroMsg.TextStatus.TextStatusActionService", sb.toString());
        C63349b0 b0Var = this.f191229a;
        if (b0Var != null) {
            b0Var.onFinishAction(i, str, g0Var);
        }
    }
}
