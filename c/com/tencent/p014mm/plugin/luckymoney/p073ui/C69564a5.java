package com.tencent.p014mm.plugin.luckymoney.p073ui;

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

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a5 */
public final class C69564a5 extends C87413o implements C32226l<byte[], Object> {

    /* renamed from: d */
    public final /* synthetic */ C68070l.C68072b f200862d;

    /* renamed from: e */
    public final /* synthetic */ String f200863e;

    /* renamed from: f */
    public final /* synthetic */ LuckyMoneySpareActivityFirst f200864f;

    /* renamed from: g */
    public final /* synthetic */ C77941hj f200865g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69564a5(C68070l.C68072b bVar, String str, LuckyMoneySpareActivityFirst luckyMoneySpareActivityFirst, C77941hj hjVar) {
        super(1);
        this.f200862d = bVar;
        this.f200863e = str;
        this.f200864f = luckyMoneySpareActivityFirst;
        this.f200865g = hjVar;
    }

    public Object invoke(Object obj) {
        Pair<Integer, Long> y0 = C80996q.C1279a.m1369a().mo112828y0(this.f200862d, "", "", this.f200863e, "", (byte[]) obj, false);
        Log.m105924i("MicroMsg.LuckyMoneySpareActivityFirst", "sent appmsg, result: " + y0.first);
        this.f200864f.setResult(-1);
        this.f200864f.finish();
        Integer num = (Integer) y0.first;
        if (num != null && num.intValue() == 0) {
            return ((C119157j) C119157j.f356862d).mo183895z(new C69735z4(this.f200865g));
        }
        int i = LuckyMoneySpareActivityFirst.f200800E;
        AppCompatActivity context = this.f200864f.getContext();
        C87412m.m108593f(context, "context");
        C77398g.C77402i iVar = new C77398g.C77402i(context);
        iVar.mo107550c(C0966R.string.kkj);
        iVar.mo107551d(C0966R.string.a18);
        iVar.mo107548a().show();
        return C13598b0.f38549a;
    }
}
