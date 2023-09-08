package lp2;

import android.text.TextUtils;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C101820nt3;
import te3.C49335eu3;

/* renamed from: lp2.a */
public abstract class C46883a<Request extends C101820nt3, Response extends C49335eu3> extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f126082d;

    /* renamed from: e */
    public C11385n f126083e;

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            this.f126083e = nVar;
            int dispatch = dispatch(gVar, this.f126082d, this);
            SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return dispatch;
        } catch (Throwable unused) {
            SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return 99999999;
        }
    }

    public final int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        C47350c cVar = this.f126082d;
        if (cVar != null) {
            int i = cVar.f127058d;
            SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return i;
        }
        Log.m105928w("SnsAd.AbsNetScene", "the scene is not initialized, please call initialize method");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return 0;
    }

    /* renamed from: j1 */
    public abstract void mo72085j1(Request request, Object... objArr);

    /* renamed from: k1 */
    public Response mo72086k1() {
        SnsMethodCalculate.markStartTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        C114799u reqResp = getReqResp();
        if (reqResp instanceof C47350c) {
            try {
                Response response = (C49335eu3) ((C47350c) reqResp).f127056b.f127083a;
                SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
                return response;
            } catch (Throwable unused) {
                Log.m105928w("SnsAd.AbsNetScene", "the response result is not the required!!!!");
            }
        }
        SnsMethodCalculate.markEndTimeMs("getResponse", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return null;
    }

    /* renamed from: l1 */
    public final C117747y mo72087l1(Request request, Response response, String str, int i, Object... objArr) {
        SnsMethodCalculate.markStartTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        if (request == null || response == null || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            return null;
        }
        try {
            mo72085j1(request, objArr);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = request;
            bVar.f127067b = response;
            bVar.f127068c = str;
            bVar.f127069d = i;
            C47350c a = bVar.mo72403a();
            this.f126082d = a;
            if (request == a.f127055a.f127080a) {
                Log.m105924i("SnsAd.AbsNetScene", "the request is same as mRequestAndResponse.getRequestProtoBuf()");
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("initialize", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        return this;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
        try {
            SnsMethodCalculate.markStartTimeMs("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            SnsMethodCalculate.markEndTimeMs("beforeSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
            C11385n nVar = this.f126083e;
            if (nVar != null) {
                nVar.onSceneEnd(i2, i3, str, this);
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.netscene.AbsSnsAdNetScene");
    }
}
