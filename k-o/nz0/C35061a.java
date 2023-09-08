package nz0;

import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import hz0.C46141c;
import hz0.C46153l0;
import wz0.C22945n;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nz0.a */
public class C35061a extends C86301e implements C76982e {
    /* renamed from: A6 */
    public void mo59836A6() {
    }

    /* renamed from: AA */
    public boolean mo59837AA(int i) {
        return C22945n.m26989B(i);
    }

    /* renamed from: NK */
    public int mo59838NK() {
        C46141c Gx0 = C46153l0.Gx0();
        Gx0.getClass();
        Cursor rawQuery = Gx0.f124344d.rawQuery("select count(*) from UserCardInfo where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )", (String[]) null, 2);
        int i = 0;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                i = rawQuery.getInt(0);
            }
            rawQuery.close();
        }
        Log.m105924i("MicroMsg.CardMgrImpl", "getGiftCardCount:" + i);
        return i;
    }

    /* renamed from: P8 */
    public String mo59839P8() {
        return (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, (Object) null);
    }

    /* renamed from: r9 */
    public boolean mo59840r9() {
        return C22945n.m26988A();
    }

    /* renamed from: yc */
    public boolean mo59841yc() {
        return C22945n.m27020t();
    }
}
