package bg0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import lp3.C46888b;
import ob0.C89132b;
import te3.C64248b0;

/* renamed from: bg0.a */
public class C54456a implements C87581a<Void, C89132b.C89134c<C64248b0>> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f152716a;

    /* renamed from: b */
    public final /* synthetic */ C54457b f152717b;

    public C54456a(C54457b bVar, C46888b bVar2) {
        this.f152717b = bVar;
        this.f152716a = bVar2;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        Log.m105925i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C64248b0 b0Var = (C64248b0) cVar.f256796d;
            Log.m105925i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish, retcode: %s, retmsg: %s", Integer.valueOf(b0Var.f182197d), b0Var.f182198e);
            int i = b0Var.f182197d;
            if (i == 0) {
                Log.m105925i("MicroMsg.AAQueryListInteractor", "on AAQueryList finish get success, return record size: %s", Integer.valueOf(b0Var.f182199f.size()));
                this.f152717b.f152718q += b0Var.f182199f.size();
                C54457b bVar = this.f152717b;
                String str = b0Var.f182201h;
                bVar.f152719r = str;
                bVar.f152720s = b0Var.f182202i;
                bVar.f152721t = b0Var.f182203j;
                bVar.f152722u = b0Var.f182204n;
                if (Util.isNullOrNil(str) || Util.isNullOrNil(this.f152717b.f152722u)) {
                    this.f152717b.f152723v = false;
                } else {
                    this.f152717b.f152723v = true;
                }
                C54457b bVar2 = this.f152717b;
                Log.m105919d("MicroMsg.AAQueryListInteractor", "bill_id: %s, trans_id %s", bVar2.f152719r, bVar2.f152722u);
                this.f152716a.mo72093c(b0Var.f182199f, b0Var.f182200g, Boolean.valueOf(this.f152717b.f152723v));
                C115669n.INSTANCE.idkeyStat(407, 30, 1, false);
                return null;
            } else if (i <= 0 || !Util.isNullOrNil(b0Var.f182198e)) {
                this.f152716a.mo72091a(Boolean.FALSE);
                C115669n.INSTANCE.idkeyStat(407, 32, 1, false);
                return null;
            } else {
                this.f152716a.mo72091a(b0Var.f182198e);
                C115669n.INSTANCE.idkeyStat(407, 32, 1, false);
                return null;
            }
        } else {
            this.f152716a.mo72091a(Boolean.FALSE);
            C115669n.INSTANCE.idkeyStat(407, 31, 1, false);
            return null;
        }
    }
}
