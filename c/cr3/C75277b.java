package cr3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.tenpay.model.ITenpaySave;
import f40.C86709a0;
import fr3.C75791m;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;

/* renamed from: cr3.b */
public class C75277b implements C11385n {

    /* renamed from: g */
    public static ITenpaySave.RetryPayInfo f221411g;

    /* renamed from: d */
    public int f221412d = 0;

    /* renamed from: e */
    public C75791m f221413e;

    /* renamed from: f */
    public C11385n f221414f;

    public C75277b(C11385n nVar) {
        this.f221414f = nVar;
    }

    /* renamed from: a */
    public boolean mo105611a(C75791m mVar) {
        ITenpaySave.RetryPayInfo retryPayInfo = f221411g;
        int i = (retryPayInfo == null || !retryPayInfo.mo104874b()) ? 0 : f221411g.f221138d;
        ITenpaySave.RetryPayInfo retryPayInfo2 = f221411g;
        int i2 = (retryPayInfo2 == null || !retryPayInfo2.mo104874b()) ? 0 : f221411g.f221139e;
        int i3 = this.f221412d + 1;
        this.f221412d = i3;
        if (i3 > i2) {
            return false;
        }
        this.f221413e = mVar;
        mVar.setHasRetried(true);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        this.f221413e.resetForRetry();
        int i4 = this.f221412d;
        mVar.updateConfig(i4, i4 >= i2 ? 1 : 0);
        Log.m105925i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", Integer.valueOf(i), Integer.valueOf(i2));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123461g(mVar, i * 1000);
        return true;
    }

    /* renamed from: b */
    public void mo105612b(int i, int i2, String str, JSONObject jSONObject) {
        Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback errCode = " + i2 + "errType = " + i);
        if (this.f221413e != null && jSONObject != null && i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mScene !=null");
            this.f221413e.onGYNetEnd(i2, str, jSONObject);
            this.f221414f.onSceneEnd(i, i2, str, this.f221413e);
        } else if (this.f221414f != null) {
            Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback mRealCallback !=null");
            this.f221414f.onSceneEnd(i, i2, str, this.f221413e);
        }
        Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "doRealCallback reset");
        this.f221412d = 0;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = false;
        Log.m105919d("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (yVar instanceof C75791m) {
            if (yVar instanceof ITenpaySave) {
                ITenpaySave.RetryPayInfo retryPayInfo = ((ITenpaySave) yVar).getRetryPayInfo();
                if (retryPayInfo.mo104874b()) {
                    f221411g = retryPayInfo;
                }
            }
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            C75791m mVar = (C75791m) yVar;
            if (!mVar.ishasCGiRetried()) {
                return;
            }
            if (this.f221413e.checkPaySuccess()) {
                Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess ok");
                mo105612b(i, i2, str, mVar.f222388j);
                return;
            }
            if (this.f221413e.canPayRetry()) {
                ITenpaySave.RetryPayInfo retryPayInfo2 = f221411g;
                if (this.f221412d < ((retryPayInfo2 == null || !retryPayInfo2.mo104874b()) ? 0 : f221411g.f221139e)) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Boolean.valueOf(this.f221413e.canPayRetry());
                    ITenpaySave.RetryPayInfo retryPayInfo3 = f221411g;
                    if (this.f221412d < ((retryPayInfo3 == null || !retryPayInfo3.mo104874b()) ? 0 : f221411g.f221139e)) {
                        z = true;
                    }
                    objArr[1] = Boolean.valueOf(z);
                    Log.m105925i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try isServerDelayQuery true svrcanRetry %s localCanRetry %s", objArr);
                    if (!mo105611a(this.f221413e)) {
                        mo105612b(i, i2, f221411g.f221140f, mVar.f222388j);
                        return;
                    }
                    return;
                }
            }
            if (mVar.checkRecSrvResp()) {
                Log.m105924i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "try svr no resp");
                if (!mo105611a(this.f221413e)) {
                    mo105612b(i, i2, f221411g.f221140f, mVar.f222388j);
                    return;
                }
                return;
            }
            String str2 = f221411g.f221140f;
            Log.m105925i("MicroMsg.DelayQueryOrderSaveOrFetchHelper", "PaySuccess error %s", str2);
            mo105612b(i, i2, str2, mVar.f222388j);
        }
    }
}
