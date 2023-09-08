package com.tencent.p014mm.pluginsdk.model.app;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.pluginsdk.model.app.C44565l;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import p166hy.C46134x;
import qo3.C47883u;

/* renamed from: com.tencent.mm.pluginsdk.model.app.n */
public class C44576n implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C44565l.C44571f f120874a;

    public C44576n(C44565l.C44571f fVar) {
        this.f120874a = fVar;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        boolean z2;
        Class cls = C46134x.class;
        String f = C44565l.m48986f(this.f120874a.f120867c);
        if (f != null) {
            ((C46134x) C86312j.m106911c(cls)).mo71582GV(f);
        }
        try {
            C44565l.C44571f fVar = this.f120874a;
            Context context = fVar.f120866b;
            Intent intent = fVar.f120868d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/pluginsdk/model/app/AppInfoLogic$7$2", "onDialogClick", "(ZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z2 = true;
            String f2 = C44565l.m48986f(this.f120874a.f120867c);
            if (f2 != null) {
                ((C46134x) C86312j.m106911c(cls)).mo71587pQ(f2);
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.AppInfoLogic", e.getMessage());
            z2 = false;
        }
        C44565l.C44571f fVar2 = this.f120874a;
        C44565l.m48981a(fVar2.f120867c, 0, 1, "", z2 ? 1 : 0, fVar2.f120869e);
        C44580q1 q1Var = this.f120874a.f120870f;
        if (q1Var != null) {
            q1Var.mo1579a(z2, false);
        }
    }
}
