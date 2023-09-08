package cr3;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fr3.C75779a;
import fr3.C75780b;
import fr3.C75781c;
import fr3.C75782d;
import fr3.C75783e;
import fr3.C75784f;
import fr3.C75785g;
import fr3.C75786h;
import fr3.C75787i;
import fr3.C75788j;
import fr3.C75789k;
import fr3.C75791m;
import java.util.HashMap;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p281yz.C79173v;

/* renamed from: cr3.a */
public class C75276a implements C11385n {

    /* renamed from: d */
    public C75791m f221407d;

    /* renamed from: e */
    public C75784f f221408e;

    /* renamed from: f */
    public int f221409f = 0;

    /* renamed from: g */
    public C11385n f221410g;

    public C75276a(C11385n nVar) {
        this.f221410g = nVar;
    }

    /* renamed from: a */
    public final void mo105609a(C75791m mVar) {
        C75784f fVar;
        Class cls = C79173v.class;
        this.f221407d = mVar;
        mVar.setHasRetried(true);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        int i = ((C79173v) C86312j.m106911c(cls)).Ex0().f192965r;
        if (i <= 0) {
            i = 10000;
        }
        this.f221409f++;
        HashMap hashMap = (HashMap) this.f221407d.f222382d;
        String str = (String) hashMap.get("req_key");
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.DelayQueryOrderHelper", "no reqKey");
            fVar = new C75784f(hashMap);
        } else {
            Log.m105925i("MicroMsg.DelayQueryOrderHelper", "payorder reqKey: %s", str);
            Log.m105924i("MicroMsg.DelayQueryOrderHelper", "delayquery go new split cgi");
            fVar = str.startsWith("sns_aa_") ? new C75779a(hashMap) : str.startsWith("sns_tf_") ? new C75788j(hashMap) : str.startsWith("sns_ff_") ? new C75781c(hashMap) : str.startsWith("ts_") ? new C75782d(hashMap) : str.startsWith("sns_") ? new C75786h(hashMap) : str.startsWith("offline_") ? new C75783e(hashMap) : str.startsWith("up_") ? new C75789k(hashMap) : str.startsWith("seb_ff_") ? new C75785g(hashMap) : str.startsWith("tax_") ? new C75787i(hashMap) : str.startsWith("dc_") ? new C75780b(hashMap) : new C75784f(hashMap);
        }
        this.f221408e = fVar;
        int i2 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192966s;
        C75784f fVar2 = this.f221408e;
        int i3 = this.f221409f;
        int i4 = i3 >= i2 ? 1 : 0;
        fVar2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("is_last_query", i4 + "");
        hashMap2.put("curr_query_count", i3 + "");
        fVar2.addRequestData(hashMap2);
        Log.m105925i("MicroMsg.DelayQueryOrderHelper", "doLoopDelayScene,delay = %s queryOrderCount %s", Integer.valueOf(i), Integer.valueOf(i2));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123461g(this.f221408e, i);
    }

    /* renamed from: b */
    public void mo105610b(int i, int i2, String str, JSONObject jSONObject, C75784f fVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        Log.m105924i("MicroMsg.DelayQueryOrderHelper", "doRealCallback errCode = " + i4 + "errType = " + i3);
        if (this.f221407d != null && jSONObject2 != null && i3 == 0 && i4 == 0) {
            Log.m105924i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mScene !=null");
            this.f221407d.onGYNetEnd(i4, str2, jSONObject2);
            this.f221410g.onSceneEnd(i3, i4, str2, this.f221407d);
            int i5 = this.f221409f;
            if (i5 == 1) {
                C115669n.INSTANCE.mo175913w(965, 4, 1);
            } else if (i5 == 2) {
                C115669n.INSTANCE.mo175913w(965, 5, 1);
            } else if (i5 == 3) {
                C115669n.INSTANCE.mo175913w(965, 6, 1);
            }
        } else if (this.f221410g != null) {
            Log.m105924i("MicroMsg.DelayQueryOrderHelper", "doRealCallback mRealCallback !=null");
            this.f221410g.onSceneEnd(i3, i4, str2, this.f221407d);
            int i6 = this.f221409f;
            if (i6 == 1) {
                C115669n.INSTANCE.mo175913w(965, 7, 1);
            } else if (i6 == 2) {
                C115669n.INSTANCE.mo175913w(965, 8, 1);
            } else if (i6 == 3) {
                C115669n.INSTANCE.mo175913w(965, 9, 1);
            }
            if (!fVar.checkRecSrvResp()) {
                int i7 = this.f221409f;
                if (i7 == 1) {
                    C115669n.INSTANCE.mo175913w(965, 15, 1);
                } else if (i7 == 2) {
                    C115669n.INSTANCE.mo175913w(965, 16, 1);
                } else if (i7 == 3) {
                    C115669n.INSTANCE.mo175913w(965, 17, 1);
                }
            }
        }
        Log.m105924i("MicroMsg.DelayQueryOrderHelper", "doRealCallback reset");
        this.f221409f = 0;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C117747y yVar2 = yVar;
        Class cls = C79173v.class;
        Log.m105919d("MicroMsg.DelayQueryOrderHelper", "errType: %d, errCode: %d, errMsg: %s scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar2);
        if ((yVar2 instanceof C75784f) && this.f221408e.equals(yVar2)) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            C75784f fVar = (C75784f) yVar2;
            Log.m105919d("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder errType: %d, errCode: %d, errMsg: %s scene %s  errmsgtype %s", Integer.valueOf(i), Integer.valueOf(i2), str, fVar, Integer.valueOf(fVar.f222381e));
            if (fVar.f222381e == 1) {
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step A");
                mo105610b(i, i2, str, fVar.f222380d, fVar);
            } else if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step B");
                if (fVar.f222381e == 2) {
                    C75791m mVar = this.f221407d;
                    mo105610b(mVar.f222385g, mVar.f222386h, mVar.f222387i, mVar.f222388j, fVar);
                    return;
                }
                mo105610b(i, i2, str, fVar.f222380d, fVar);
            } else if (fVar.checkRecSrvResp() || this.f221409f >= ((C79173v) C86312j.m106911c(cls)).Ex0().f192966s) {
                C75791m mVar2 = this.f221407d;
                int i3 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192966s;
                Object[] objArr = new Object[2];
                objArr[0] = Boolean.valueOf(mVar2.f222383e == 1);
                objArr[1] = Integer.valueOf(this.f221409f);
                Log.m105925i("MicroMsg.DelayQueryOrderHelper", " isServerDelayQuery %s mDelayQueryTime %s ", objArr);
                if (this.f221409f < i3) {
                    Log.m105924i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D doLoopDelayScene");
                    mo105609a(this.f221407d);
                    return;
                }
                Log.m105925i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step D fail, retmsg_type: %s", Integer.valueOf(fVar.f222381e));
                int i4 = fVar.f222381e;
                if (i4 == 1) {
                    mo105610b(i, i2, str, fVar.f222380d, fVar);
                } else if (i4 == 2) {
                    C75791m mVar3 = this.f221407d;
                    mo105610b(mVar3.f222385g, mVar3.f222386h, mVar3.f222387i, mVar3.f222388j, fVar);
                } else {
                    String str2 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192967t;
                    if (!Util.isNullOrNil(this.f221407d.f222387i)) {
                        str2 = this.f221407d.f222387i;
                    }
                    String str3 = str2;
                    Log.m105925i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str3);
                    C75791m mVar4 = this.f221407d;
                    mo105610b(mVar4.f222385g, mVar4.f222386h, str3, mVar4.f222388j, fVar);
                }
            } else {
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "handlerLoopQueryOrder step C");
                Log.m105925i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", ((C79173v) C86312j.m106911c(cls)).Ex0().f192967t);
                C115669n.INSTANCE.mo175913w(965, 0, 1);
                mo105609a(this.f221407d);
            }
        } else if ((yVar2 instanceof C75791m) && this.f221407d.equals(yVar2)) {
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123470p(385, this);
            C75791m mVar5 = (C75791m) yVar2;
            if (!mVar5.ishasCGiRetried()) {
                return;
            }
            if (this.f221407d.checkPaySuccess()) {
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "PaySuccess ok");
                mo105610b(i, i2, str, mVar5.f222388j, this.f221408e);
                return;
            }
            if (this.f221407d.f222383e == 1) {
                Log.m105924i("MicroMsg.DelayQueryOrderHelper", "try isServerDelayQuery true");
                mo105609a(this.f221407d);
                return;
            }
            String str4 = ((C79173v) C86312j.m106911c(cls)).Ex0().f192967t;
            Log.m105925i("MicroMsg.DelayQueryOrderHelper", "PaySuccess error %s", str4);
            mo105610b(i, i2, str4, mVar5.f222388j, this.f221408e);
        }
    }
}
