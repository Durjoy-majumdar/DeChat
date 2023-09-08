package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import qo3.C77398g;
import rx3.C13598b0;
import te3.C77941hj;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.h */
public final class C72148h extends C87413o implements C32226l<byte[], Object> {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f209279d;

    /* renamed from: e */
    public final /* synthetic */ String f209280e;

    /* renamed from: f */
    public final /* synthetic */ RealnameVerifySelectGuardianUI f209281f;

    /* renamed from: g */
    public final /* synthetic */ C77941hj f209282g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72148h(C68070l.C68072b bVar, String str, RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, C77941hj hjVar) {
        super(1);
        this.f209279d = bVar;
        this.f209280e = str;
        this.f209281f = realnameVerifySelectGuardianUI;
        this.f209282g = hjVar;
    }

    public Object invoke(Object obj) {
        Pair<Integer, Long> y0 = C80996q.C1279a.m1369a().mo112828y0(this.f209279d, "", "", this.f209280e, "", (byte[]) obj, false);
        Log.m105924i("MicroMsg.RealnameVerifySelectGuardianUI", "sent appmsg, result: " + y0.first);
        this.f209281f.setResult(-1);
        this.f209281f.finish();
        Integer num = (Integer) y0.first;
        if (num != null && num.intValue() == 0) {
            return ((C119157j) C119157j.f356862d).mo183895z(new C72146g(this.f209282g));
        }
        int i = RealnameVerifySelectGuardianUI.f209043E;
        AppCompatActivity context = this.f209281f.getContext();
        C87412m.m108593f(context, "context");
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        iVar.mo107550c(C0966R.string.kkj);
        iVar.mo107551d(C0966R.string.a18);
        iVar.mo107548a().show();
        return C13598b0.f38549a;
    }
}
