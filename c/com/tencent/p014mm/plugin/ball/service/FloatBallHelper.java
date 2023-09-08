package com.tencent.p014mm.plugin.ball.service;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.model.BallReportInfo;
import com.tencent.p014mm.plugin.ball.p1099ui.C105068d0;
import com.tencent.p014mm.plugin.choosemsgfile.p318ui.C85140i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;
import p646pn.C110234e;
import p646pn.C110235f;
import xv0.C112181e;
import xv0.C66445c;

/* renamed from: com.tencent.mm.plugin.ball.service.FloatBallHelper */
public class FloatBallHelper implements C66445c {

    /* renamed from: d */
    public BallInfo f311726d;

    /* renamed from: e */
    public int f311727e;

    /* renamed from: f */
    public boolean f311728f = false;

    /* renamed from: g */
    public C112181e f311729g = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();

    /* renamed from: h */
    public C105068d0 f311730h = new C104951a();

    /* renamed from: i */
    public ResultReceiver f311731i = new ResultReceiverImpl(MMHandler.createFreeHandler(Looper.getMainLooper()), this);

    /* renamed from: j */
    public ResultReceiver f311732j = new ResultReceiverImpl2(MMHandler.createFreeHandler(Looper.getMainLooper()), this);

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl */
    public static class ResultReceiverImpl extends ResultReceiver {

        /* renamed from: d */
        public WeakReference<FloatBallHelper> f311733d;

        public ResultReceiverImpl(Handler handler, FloatBallHelper floatBallHelper) {
            super(handler);
            this.f311733d = new WeakReference<>(floatBallHelper);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            FloatBallHelper floatBallHelper;
            WeakReference<FloatBallHelper> weakReference = this.f311733d;
            if (weakReference != null && (floatBallHelper = weakReference.get()) != null && i == 2 && bundle != null) {
                boolean z = bundle.getBoolean("can_add_float_ball_when_hide", false);
                if (z) {
                    C112181e eVar = floatBallHelper.f311729g;
                    if (eVar != null ? eVar.mo149124h0(floatBallHelper.f311726d) : false) {
                        Log.m105924i("MicroMsg.FloatBallHelper", "alvinluo autoAddFloatBall onReceiveResult add new after remove floatBall done");
                        floatBallHelper.getReportInfo().f311722n = 1;
                        floatBallHelper.mo149070g0(true, 7);
                        return;
                    }
                }
                if (floatBallHelper.f311726d != null) {
                    Log.m105925i("MicroMsg.FloatBallHelper", "alvinluo autoAddFloatBall onReceiveResult not add, canAdd: %b", Boolean.valueOf(z));
                    floatBallHelper.getReportInfo().f311722n = 2;
                    ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149087E(floatBallHelper.f311726d);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallHelper$ResultReceiverImpl2 */
    public static class ResultReceiverImpl2 extends ResultReceiver {

        /* renamed from: d */
        public WeakReference<FloatBallHelper> f311734d;

        public ResultReceiverImpl2(Handler handler, FloatBallHelper floatBallHelper) {
            super(handler);
            this.f311734d = new WeakReference<>(floatBallHelper);
        }

        public void onReceiveResult(int i, Bundle bundle) {
            FloatBallHelper floatBallHelper = this.f311734d.get();
            if (floatBallHelper != null) {
                if (i != 1) {
                    if (i == 2) {
                        Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(UPDATE_BALL_INFO)", Integer.valueOf(i));
                    } else if (i == 3) {
                        Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(REMOVE_BALL_INFO)", Integer.valueOf(i));
                        floatBallHelper.mo68417j0();
                    } else if (i == 4) {
                        Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(FINISH_WHEN_SWITCH_BALL)", Integer.valueOf(i));
                        floatBallHelper.mo64002k0();
                    } else if (i == 5) {
                        if (bundle != null) {
                            int i2 = bundle.getInt("ActiveCount", 0);
                            floatBallHelper.mo149071i0(i2);
                            Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), activeCount:%s", Integer.valueOf(i), Integer.valueOf(i2));
                            return;
                        }
                        Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(BALL_INFO_COUNT_CHANGED), no resultData", Integer.valueOf(i));
                    }
                } else if (bundle != null) {
                    int i3 = bundle.getInt("type", 0);
                    String string = bundle.getString("key", (String) null);
                    if (i3 != 0) {
                        floatBallHelper.mo114238h0(i3, string);
                        Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), type:%d, key: %s", Integer.valueOf(i), Integer.valueOf(i3), string);
                        return;
                    }
                    Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no type", Integer.valueOf(i));
                } else {
                    Log.m105925i("MicroMsg.FloatBallHelper", "onReceiveResult:%s(ADD_BALL_INFO), no resultData", Integer.valueOf(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.service.FloatBallHelper$a */
    public class C104951a implements C105068d0 {
        public C104951a() {
        }

        /* renamed from: a */
        public void mo137111a(int i, int i2) {
            BallInfo ballInfo;
            Log.m105925i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, reach count limit, callback: %d", Integer.valueOf(i2));
            if (i2 == 1) {
                Log.m105924i("MicroMsg.FloatBallHelper", "floatBallProxyUIResultCallback, show float menu view");
                FloatBallHelper floatBallHelper = FloatBallHelper.this;
                ResultReceiver resultReceiver = floatBallHelper.f311731i;
                C112181e eVar = floatBallHelper.f311729g;
                if (eVar != null) {
                    eVar.mo149093K(resultReceiver);
                }
            } else if (i2 == 2 && i == 1 && (ballInfo = FloatBallHelper.this.f311726d) != null) {
                ballInfo.f311683H.f311722n = 2;
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149087E(FloatBallHelper.this.f311726d);
            }
        }
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        Log.m105924i("MicroMsg.FloatBallHelper", "gamelog.restart,create()");
        this.f311726d = new BallInfo(i, str, (JSONObject) null);
        this.f311727e = i;
        BallInfo d0 = mo68416d0();
        if (d0 != null) {
            Log.m105924i("MicroMsg.FloatBallHelper", "replaceCurrentBallIfNeed, replace current ball");
            this.f311726d = d0;
        }
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149111b(this.f311726d, this.f311732j);
        }
    }

    /* renamed from: C */
    public void mo64001C() {
        C112181e eVar;
        C112181e eVar2 = this.f311729g;
        if (eVar2 != null) {
            eVar2.mo149088F(this.f311726d);
        }
        if (this.f311726d != null) {
            if (mo149066Q() && (eVar = this.f311729g) != null) {
                eVar.mo149147w(this.f311726d);
            }
            if (this.f311728f) {
                ((C110234e) C86312j.m106911c(C110234e.class)).mo161398Zc().mo22761a(this.f311726d.f311683H.f311717f, false, mo35650V());
            }
        }
    }

    /* renamed from: J */
    public BallInfo mo90534J() {
        return this.f311726d;
    }

    /* renamed from: O */
    public void mo68414O() {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149110a0(this.f311726d);
        }
    }

    /* renamed from: Q */
    public final boolean mo149066Q() {
        return mo35650V() && !this.f311728f;
    }

    /* renamed from: S */
    public final boolean mo149067S(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (!"".equals(str) || !"".equals(str2)) {
            return !Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && str.equals(str2);
        }
        return true;
    }

    /* renamed from: V */
    public boolean mo35650V() {
        return this instanceof C85140i;
    }

    /* renamed from: b0 */
    public boolean mo68415b0() {
        return mo35650V();
    }

    /* renamed from: c */
    public void mo90535c(boolean z) {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149113c(z);
        }
    }

    /* renamed from: c0 */
    public final void mo149068c0() {
        this.f311728f = true;
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149139p();
        }
    }

    /* renamed from: d */
    public void mo90536d(boolean z) {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149115d(z);
        }
    }

    /* renamed from: d0 */
    public BallInfo mo68416d0() {
        return mo149069e0();
    }

    /* renamed from: e */
    public void mo90537e(boolean z) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null && ballInfo.f311681F != z) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updateHidden, hidden:%s", Boolean.valueOf(z));
            this.f311726d.f311681F = z;
            mo68414O();
        }
    }

    /* renamed from: e0 */
    public BallInfo mo149069e0() {
        BallInfo ballInfo = this.f311726d;
        BallInfo ballInfo2 = null;
        if (ballInfo != null) {
            String e = ballInfo.mo149041e();
            Log.m105927v("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV ballInfoKey: %s", e);
            String decodeString = MultiProcessMMKV.getMMKV(((C110235f) C86312j.m106911c(C110235f.class)).mo161394CM("float_ball_storage")).decodeString(e);
            if (!Util.isNullOrNil(decodeString)) {
                try {
                    ballInfo2 = BallInfo.m140723c(new JSONObject(decodeString));
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.FloatBallHelper", e2, "getCurrentBallFromMMKV:%s", this.f311726d);
                }
                Log.m105925i("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, data:%s, ballInfo:%s", decodeString, ballInfo2);
                return ballInfo2;
            }
            Log.m105928w("MicroMsg.FloatBallHelper", "getCurrentBallFromMMKV, no saved data");
        }
        return null;
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return this instanceof C85140i;
    }

    /* renamed from: g0 */
    public void mo149070g0(boolean z, int i) {
    }

    public BallReportInfo getReportInfo() {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null) {
            return ballInfo.f311683H;
        }
        throw new IllegalStateException("call FloatBallHelper#onCreate first");
    }

    /* renamed from: h0 */
    public void mo114238h0(int i, String str) {
    }

    /* renamed from: i0 */
    public void mo149071i0(int i) {
    }

    /* renamed from: j0 */
    public void mo68417j0() {
    }

    /* renamed from: k */
    public void mo68418k() {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149108Z(this.f311726d);
        }
    }

    /* renamed from: k0 */
    public void mo64002k0() {
    }

    /* renamed from: l */
    public void mo90539l() {
        mo68414O();
    }

    /* renamed from: l0 */
    public final void mo149072l0() {
        C112181e eVar;
        Object[] objArr = new Object[4];
        boolean z = false;
        objArr[0] = Boolean.valueOf(mo68415b0());
        objArr[1] = Boolean.valueOf(this.f311726d.f311686d == 20);
        objArr[2] = Integer.valueOf(this.f311726d.f311687e);
        objArr[3] = Integer.valueOf(this.f311727e);
        Log.m105925i("MicroMsg.FloatBallHelper", "alvinluo removeMessageBallIfNeed enable: %b, isFromMessageFloatBall: %b, ballInfo.contentType: %d, originFloatBallType: %d", objArr);
        if (mo35650V() && mo68415b0()) {
            if (this.f311726d.f311686d == 20) {
                z = true;
            }
            if (z && (eVar = this.f311729g) != null) {
                eVar.mo149135n(this.f311727e);
            }
        }
    }

    /* renamed from: m0 */
    public final void mo149073m0() {
        BallInfo ballInfo;
        if (mo35650V()) {
            Log.m105919d("MicroMsg.FloatBallHelper", "getCurrentMessageBallInner enableMessageFloatBall: %b", Boolean.valueOf(mo35650V()));
            BallInfo ballInfo2 = null;
            if (mo35650V() && (ballInfo = this.f311726d) != null) {
                String decodeString = MultiProcessMMKV.getMMKV(((C110235f) C86312j.m106911c(C110235f.class)).mo161394CM("float_ball_storage")).decodeString(String.format("%s#%s", new Object[]{20, ballInfo.f311688f}));
                Log.m105919d("MicroMsg.FloatBallHelper", "getCurrentMessageBallInner enableMessageFloatBall data: %s", decodeString);
                if (!Util.isNullOrNil(decodeString)) {
                    try {
                        ballInfo2 = BallInfo.m140723c(new JSONObject(decodeString));
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.FloatBallHelper", e, "getCurrentBallFromMMKV:%s", this.f311726d);
                    }
                }
            }
            if (ballInfo2 != null) {
                BallReportInfo ballReportInfo = this.f311726d.f311683H;
                this.f311726d = ballInfo2;
                synchronized (ballInfo2) {
                    ballInfo2.mo149051q(ballReportInfo);
                }
                Log.m105925i("MicroMsg.FloatBallHelper", "replaceMessageBallIfNeed, replace current message ball reportInfo: %s", this.f311726d.f311683H);
            }
        }
    }

    /* renamed from: n0 */
    public void mo149074n0(String str, byte[] bArr) {
        if (this.f311726d != null) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updateByteArrayExtra, %s", str);
            BallInfo ballInfo = this.f311726d;
            synchronized (ballInfo) {
                if (!Util.isNullOrNil(str)) {
                    ballInfo.mo149039d();
                    ballInfo.f311678C.putByteArray(str, bArr);
                }
            }
            mo68414O();
        }
    }

    /* renamed from: o */
    public void mo64003o() {
        this.f311728f = false;
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149150z(this.f311726d);
        }
        if (this.f311726d != null) {
            mo149073m0();
            mo149072l0();
        }
    }

    /* renamed from: o0 */
    public void mo149075o0(String str) {
        if (this.f311726d != null && !Util.isNullOrNil(str) && !mo149067S(this.f311726d.f311700u, str)) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updateDesc, desc:%s", str);
            this.f311726d.f311700u = str;
            mo68414O();
        }
    }

    /* renamed from: p0 */
    public void mo149076p0(String str) {
        if (this.f311726d != null && !Util.isNullOrNil(str) && !mo149067S(this.f311726d.f311695p, str)) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updateIcon, icon:%s", str);
            this.f311726d.f311695p = str;
            mo68414O();
        }
    }

    /* renamed from: q0 */
    public void mo67998q0(String str) {
        if (this.f311726d != null && !Util.isNullOrNil(str)) {
            if (str.length() > 50) {
                str = str.substring(0, 50);
            }
            if (!mo149067S(this.f311726d.f311699t, str)) {
                Log.m105925i("MicroMsg.FloatBallHelper", "updateName, name:%s", str);
                this.f311726d.f311699t = str;
                mo68414O();
            }
        }
    }

    /* renamed from: r0 */
    public void mo149077r0(boolean z) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null && ballInfo.f311680E != z) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updatePassive, passive:%s", Boolean.valueOf(z));
            this.f311726d.f311680E = z;
            mo68414O();
        }
    }

    /* renamed from: s */
    public void mo90540s(BallInfo.BallButtonInfo ballButtonInfo) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null) {
            ballInfo.f311693n.mo149054a(ballButtonInfo);
            C112181e eVar = this.f311729g;
            if (eVar != null) {
                eVar.mo149109a(this.f311726d);
            }
        }
    }

    /* renamed from: s0 */
    public void mo149078s0(int i) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null && ballInfo.f311679D != i) {
            Log.m105925i("MicroMsg.FloatBallHelper", "updateState, state:%s", Integer.valueOf(i));
            this.f311726d.f311679D = i;
            mo68414O();
        }
    }

    /* renamed from: t0 */
    public void mo149079t0(String str, String str2) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo == null) {
            return;
        }
        if (!ballInfo.mo149047j(str) || !mo149067S(this.f311726d.mo149045h(str, str2), str2)) {
            Log.printInfoStack("MicroMsg.FloatBallHelper", "updateStringExtra, %s:%s", str, str2);
            this.f311726d.mo149049o(str, str2);
            mo68414O();
        }
    }

    /* renamed from: u */
    public void mo68419u() {
        C112181e eVar = this.f311729g;
        if (eVar != null) {
            eVar.mo149095M(this.f311726d);
        }
    }

    /* renamed from: u0 */
    public void mo149080u0(boolean z) {
        C112181e eVar;
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null && (eVar = this.f311729g) != null) {
            eVar.mo149103V(ballInfo, z);
        }
    }

    /* renamed from: w */
    public boolean mo90541w() {
        C112181e eVar = this.f311729g;
        return (eVar == null || eVar.mo149134m0(this.f311726d) == null) ? false : true;
    }

    /* renamed from: x */
    public void mo90542x(BallInfo.C55569c cVar) {
        BallInfo ballInfo = this.f311726d;
        if (ballInfo != null) {
            BallInfo.C55569c cVar2 = ballInfo.f311694o;
            cVar2.getClass();
            cVar2.f158210a = cVar.f158210a;
            cVar2.f158211b = cVar.f158211b;
            C112181e eVar = this.f311729g;
            if (eVar != null) {
                eVar.mo149085C(this.f311726d);
            }
        }
    }
}
