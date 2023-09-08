package p600lu;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import eb0.C31458e4;
import f40.C86709a0;
import ob0.C117747y;
import ob0.C35142u;
import r62.C36258g;

/* renamed from: lu.d */
public final class C34363d implements C35142u {
    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (C86709a0.m107522a()) {
            C36258g gVar = (C36258g) C86312j.m106911c(C36258g.class);
            gVar.getClass();
            MTimerHandler mTimerHandler = C36258g.f96554o;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                C36258g.f96554o.startTimer(86400000);
            }
            if (i == 0 && i2 == 0) {
                try {
                    C31458e4 e4Var = (C31458e4) yVar;
                    gVar.f96557d = true;
                    gVar.f96559f = e4Var.f84181g;
                    int i3 = e4Var.f84182h;
                    gVar.f96560g = i3;
                    gVar.f96558e = e4Var.f84180f;
                    long j = (long) e4Var.f84183i;
                    if (j >= 60) {
                        if (j <= 86400) {
                            gVar.f96562i = j;
                            Log.m105925i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", Integer.valueOf(i3), Integer.valueOf(gVar.f96559f), Integer.valueOf(gVar.f96558e), Integer.valueOf(e4Var.f84183i));
                            gVar.wx0(gVar.f96558e, 3);
                        }
                    }
                    gVar.f96562i = 28800;
                    Log.m105925i("MicroMsg.SimcardService", "CheckMobileSIMTypeResp type[%d], productType[%d], businessFlag[%d] expiredTime[%d]", Integer.valueOf(i3), Integer.valueOf(gVar.f96559f), Integer.valueOf(gVar.f96558e), Integer.valueOf(e4Var.f84183i));
                    gVar.wx0(gVar.f96558e, 3);
                } catch (Throwable th) {
                    Log.printErrStackTrace("MicroMsg.SimcardService", th, "[-] CheckMobileSimType error.", new Object[0]);
                }
            } else {
                gVar.f96562i = 60;
                Log.m105920e("MicroMsg.SimcardService", "CheckMobileSimType error:(" + i + "," + i2 + ")");
                gVar.wx0(gVar.f96558e, 2);
            }
        }
    }
}
