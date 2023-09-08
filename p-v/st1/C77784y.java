package st1;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.OpenFingerPrintAuthEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ot3.C21889m;
import tt1.C78088b;
import tt1.C78089c;
import tt1.C78092f;
import vt1.C78475c;
import xb3.C15635h;

/* renamed from: st1.y */
public class C77784y extends C77752a {

    /* renamed from: st1.y$a */
    public class C77785a implements C78088b {

        /* renamed from: a */
        public final /* synthetic */ C78475c f226638a;

        public C77785a(C77784y yVar, C78475c cVar) {
            this.f226638a = cVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            this.f226638a.mo23733a(cVar.f228884a, -1, -1, -1);
        }
    }

    /* renamed from: st1.y$b */
    public class C77786b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ int f226639d;

        /* renamed from: e */
        public final /* synthetic */ C78475c f226640e;

        public C77786b(int i, C78475c cVar) {
            this.f226639d = i;
            this.f226640e = cVar;
        }

        public boolean onTimerExpired() {
            Log.m105925i("MicroMsg.SoterAuthMgrImp", "timeout: %s", Integer.valueOf(this.f226639d));
            C77784y.this.f226572d.cancel();
            this.f226640e.mo23733a(2000, -1, -1, -1);
            return false;
        }
    }

    /* renamed from: st1.y$c */
    public class C77787c implements C78088b {

        /* renamed from: a */
        public final /* synthetic */ MTimerHandler f226642a;

        /* renamed from: b */
        public final /* synthetic */ C78475c f226643b;

        public C77787c(C77784y yVar, MTimerHandler mTimerHandler, C78475c cVar) {
            this.f226642a = mTimerHandler;
            this.f226643b = cVar;
        }

        /* renamed from: a */
        public void mo107892a(C78089c cVar) {
            this.f226642a.stopTimer();
            this.f226643b.mo23733a(cVar.f228884a, -1, -1, -1);
        }
    }

    /* renamed from: BE */
    public boolean mo107904BE() {
        return false;
    }

    public boolean Fk0() {
        return this.f226572d.mo108087zy(MMApplicationContext.getContext());
    }

    /* renamed from: H0 */
    public boolean mo107879H0() {
        return this.f226572d.mo108071H0();
    }

    public void Il0(Context context) {
        Log.m105924i("MicroMsg.SoterAuthMgrImp", "hy: start startRigesterSysFP");
    }

    /* renamed from: Vr */
    public boolean mo107907Vr() {
        return this.f226572d.mo108079gv();
    }

    /* renamed from: ZF */
    public void mo107908ZF(OpenFingerPrintAuthEvent openFingerPrintAuthEvent, int i) {
        Log.m105924i("MicroMsg.SoterAuthMgrImp", "hy: soter onOpenFingerprintAuthSuccess");
        openFingerPrintAuthEvent.f193785e.f193794f = sw0();
        OpenFingerPrintAuthEvent.C67749b bVar = openFingerPrintAuthEvent.f193785e;
        bVar.f193789a = Util.isNullOrNil(bVar.f193794f) ? 1 : 0;
        OpenFingerPrintAuthEvent.C67749b bVar2 = openFingerPrintAuthEvent.f193785e;
        bVar2.f193795g = 2;
        bVar2.f193791c = "";
        bVar2.f193792d = "";
        Runnable runnable = openFingerPrintAuthEvent.f193784d.f193788c;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: d6 */
    public boolean mo107884d6() {
        return this.f226572d.mo108073J4();
    }

    /* renamed from: dx */
    public void mo107909dx() {
        Log.m105924i("MicroMsg.SoterAuthMgrImp", "hy: soter init fp. Do nothing?? Prepare ASK??");
        this.f226572d.prepare();
    }

    /* renamed from: hq */
    public int mo107910hq(C78475c cVar, int i) {
        Log.m105925i("MicroMsg.SoterAuthMgrImp", "start face auth: %s", Integer.valueOf(i));
        MTimerHandler mTimerHandler = new MTimerHandler(new C77786b(i, cVar), false);
        mTimerHandler.startTimer((long) i);
        this.f226572d.Dq0(MMApplicationContext.getContext(), new C78092f(C77761h0.IML.f226590d, 1), new C77787c(this, mTimerHandler, cVar));
        return 0;
    }

    public boolean isRoot() {
        return false;
    }

    public boolean iw0() {
        boolean Qk = this.f226572d.mo108074Qk();
        Log.m105925i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFingerPrint:%s", Boolean.valueOf(Qk));
        return Qk;
    }

    /* renamed from: l3 */
    public boolean mo107913l3() {
        boolean n3 = this.f226572d.mo108081n3();
        Log.m105925i("MicroMsg.SoterAuthMgrImp", "isDeviceHasFaceID:%s", Boolean.valueOf(n3));
        return n3;
    }

    /* renamed from: qV */
    public boolean mo107914qV() {
        boolean xx = this.f226572d.mo108086xx();
        Log.m105925i("MicroMsg.SoterAuthMgrImp", "py: hasAuthKey: %b", Boolean.valueOf(xx));
        if (!xx && this.f226572d.gw0() && ((this.f226572d.mo73371F7() && this.f226572d.mo108074Qk()) || (this.f226572d.Km0() && this.f226572d.mo108081n3()))) {
            C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, "1", "key invalid when pay");
        }
        return xx;
    }

    public String sw0() {
        C21889m mVar = C77761h0.IML.f226593g;
        if (mVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("json", mVar.f61899j);
                jSONObject.put("signature", mVar.f61900k);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.SoterAuthMgrImp", "hy: error when convert to json: %s", e.toString());
                Log.printErrStackTrace("MicroMsg.SoterAuthMgrImp", e, "", new Object[0]);
                return "";
            }
        } else {
            Log.m105920e("MicroMsg.SoterAuthMgrImp", "hy: signature result is null");
            return "";
        }
    }

    /* renamed from: t0 */
    public Map<String, String> mo107915t0() {
        return this.f226572d.mo108085t0();
    }

    public int type() {
        return 2;
    }

    /* renamed from: uN */
    public int mo107917uN(C78475c cVar, int i, boolean z) {
        if (z) {
            Log.m105924i("MicroMsg.SoterAuthMgrImp", "hy: req restart after fail, but no need");
            return 0;
        }
        this.f226572d.mo108082n4(MMApplicationContext.getContext(), new C78092f(C77761h0.IML.f226590d, 1), new C77785a(this, cVar));
        return 0;
    }

    public void userCancel() {
        this.f226572d.cancel();
    }

    public Map<String, String> vc0() {
        return mo107915t0();
    }

    /* renamed from: vu */
    public boolean mo107920vu(boolean z, boolean z2, Bundle bundle) {
        Log.m105925i("MicroMsg.SoterAuthMgrImp", "hy: post pay. is fingerprint pay: %b, is pay ok: %b, extInfo: %s", Boolean.valueOf(z), Boolean.valueOf(z2), bundle);
        this.f226572d.mo108072Hz(z, z2, C77761h0.IML.f226592f, bundle);
        return false;
    }

    /* renamed from: ys */
    public boolean mo107921ys() {
        return this.f226572d.mo108076Wy(MMApplicationContext.getContext());
    }
}
