package p655px;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.normsg.C115632c;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import jm2.C117361f;
import tc2.C118418g;
import uc2.C52525a;
import uc2.C52526b;
import yc2.C38991o;
import zt3.C119157j;

@C86522b(dependencies = {C115632c.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: px.j */
public class C35714j extends C86301e {

    /* renamed from: px.j$a */
    public class C35715a implements Runnable {
        public void run() {
            C38991o oVar = new C38991o();
            try {
                if (!C86709a0.m107528h().f251735l) {
                    Log.m105920e("TrustRequestManager", "MMKernel was not ready, skip requesting.");
                    return;
                }
                C118418g gVar = C118418g.INSTANCE;
                int i = -1;
                if (!gVar.Tl0()) {
                    byte[] DM = gVar.mo175791DM(1);
                    Object[] objArr = new Object[1];
                    if (DM != null) {
                        i = DM.length;
                    }
                    objArr[0] = Integer.valueOf(i);
                    Log.m105919d("TrustRequestManager", "[debug] doScene type:[init] dlen:[%d]", objArr);
                    if (DM != null && DM.length != 0) {
                        oVar.mo61867a();
                        if (!C86709a0.m107524d().mo123461g(C86709a0.m107522a() ? new C52526b(false, DM) : new C52526b(true, DM), 0)) {
                            Log.m105920e("TrustRequestManager", "[debug] doScene faild");
                            oVar.mo61868b();
                            return;
                        }
                        return;
                    }
                    return;
                }
                byte[] DM2 = gVar.mo175791DM(2);
                Object[] objArr2 = new Object[1];
                if (DM2 != null) {
                    i = DM2.length;
                }
                objArr2[0] = Integer.valueOf(i);
                Log.m105919d("TrustRequestManager", "[debug] doScene type:[refesh] dlen:[%d]", objArr2);
                if (DM2 != null && DM2.length != 0) {
                    oVar.mo61867a();
                    if (!C86709a0.m107524d().mo123461g(C86709a0.m107522a() ? new C52525a(false, DM2) : new C52525a(true, DM2), Util.getIntRandom(600000, 0))) {
                        Log.m105920e("TrustRequestManager", "[debug] doScene faild");
                        oVar.mo61868b();
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("TrustRequestManager", th, "MMKernel was not ready, skip requesting.", new Object[0]);
            }
        }
    }

    public static void vx0() {
        C117361f fVar = C117361f.INSTANCE;
        if (fVar.mo182032dZ(3, 86400000) || (!C118418g.INSTANCE.Tl0() && fVar.mo182032dZ(10, 21600000))) {
            Log.m105924i("MicroMsg.PSIR", "[+] req task posted.");
            if (!ChannelUtil.shouldShowGprsAlert || !ChannelUtil.isShowingGprsAlert || !MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("gprs_alert", true)) {
                ((C119157j) C119157j.f356862d).mo183876g(new C35715a(), "SIRWorker");
                return;
            }
            Log.m105924i("MicroMsg.PSIR", "CTA alert is not checked Return here.");
        }
    }

    public void onCreate(Context context) {
    }
}
