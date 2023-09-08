package df2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75572e0;
import nj3.C76879j;
import nj3.C76912y0;
import p695tj.C52345a;
import p695tj.C78033b;

/* renamed from: df2.k */
public class C75393k extends C78033b {

    /* renamed from: d */
    public final /* synthetic */ C75381g f221650d;

    public C75393k(C75381g gVar) {
        this.f221650d = gVar;
    }

    /* renamed from: a */
    public void mo73364a(int i, int i2, String str, C75572e0 e0Var) {
        C78033b bVar = (C78033b) e0Var;
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        String str2 = "";
        objArr[2] = Util.nullAs(str, str2);
        objArr[3] = bVar != null ? Integer.valueOf(bVar.f228777a) : "null";
        Log.m105925i("MicroMsg.ProfileMenuManager", "moveInBlackList errType:%s errCode:%s errMsg:%s ret:%s", objArr);
        if (this.f228777a == 0) {
            this.f221650d.f221634e.mo62933t4();
            C52345a.m58586d(this.f221650d.f221634e);
            C76912y0.makeText((Context) this.f221650d.f221633d, (int) C0966R.string.hn7, 1).show();
            return;
        }
        this.f221650d.f221634e.mo62853E3();
        C52345a.m58584b(this.f221650d.f221634e);
        if (!Util.isNullOrNil(this.f228778b)) {
            str2 = this.f228778b;
        }
        if (!Util.isNullOrNil(this.f228779c)) {
            str = this.f228779c;
        } else if (Util.isNullOrNil(str)) {
            str = this.f221650d.f221633d.getString(C0966R.string.hn6);
        }
        MMActivity mMActivity = this.f221650d.f221633d;
        C76879j.m92754y(mMActivity, str, str2, mMActivity.getString(C0966R.string.lkg), new C75392j(this));
        C75381g.m90400a(this.f221650d);
    }
}
