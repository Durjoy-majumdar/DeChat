package i13;

import android.content.DialogInterface;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72784f0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72788g0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import i13.C76259g;
import java.util.ArrayList;
import java.util.List;
import pd0.C35456c;
import pd0.C35457d;

/* renamed from: i13.m */
public final class C76269m implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223456d;

    public C76269m(C76259g gVar) {
        this.f223456d = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Log.m105918d("MicroMsg.TransVoiceDialog", "onDismiss.");
        C76259g gVar = this.f223456d;
        if (gVar.f223417W) {
            gVar.f223417W = false;
            if (!Util.isNullOrNil(gVar.f223418X)) {
                C76259g gVar2 = this.f223456d;
                C76259g.C76262c cVar = gVar2.f223440y0;
                if (cVar != null) {
                    C72788g0 g0Var = (C72788g0) cVar;
                    g0Var.f212149a.postDelayed(new C72784f0(g0Var, gVar2.f223418X), 200);
                }
                C76259g gVar3 = this.f223456d;
                String str = gVar3.f223418X;
                Object[] objArr = new Object[1];
                List<String> list = gVar3.f223420Z;
                objArr[0] = list != null ? Integer.valueOf(list.size()) : null;
                Log.m105925i("MicroMsg.TransVoiceDialog", "cgiReport size = %s", objArr);
                Log.m105925i("MicroMsg.TransVoiceDialog", "cgiReport: abTestFlag = [%s]", 0);
                C35457d dVar = gVar3.f223419Y;
                List<String> list2 = gVar3.f223420Z;
                String valueOf = String.valueOf(0);
                dVar.getClass();
                C86709a0.m107525e().postToWorker(new C35456c(dVar, new ArrayList(list2), str, valueOf, 10));
                List<String> list3 = gVar3.f223420Z;
                if (list3 != null) {
                    list3.clear();
                }
            }
        }
    }
}
