package com.tencent.p014mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.offline.C69952f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.wallet_core.model.C75105d;
import com.tenpay.ndk.CertUtil;
import di3.C86312j;
import f40.C86709a0;
import id2.C76303b;
import id2.C76305i;
import id2.C76308m;
import id2.C76309n;
import ie3.C76324c;
import java.util.ArrayList;
import kd2.C76559f;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.offline.k */
public class C69959k implements C11385n {

    /* renamed from: d */
    public boolean f201777d = false;

    /* renamed from: e */
    public int f201778e = 0;

    /* renamed from: f */
    public MMHandler f201779f = new MMHandler();

    /* renamed from: g */
    public C69961c f201780g;

    /* renamed from: h */
    public C30330d f201781h = new C30330d((C30329a) null);

    /* renamed from: i */
    public int f201782i = 14400000;

    /* renamed from: j */
    public MTimerHandler f201783j = new MTimerHandler(new C30329a(), false);

    /* renamed from: com.tencent.mm.plugin.offline.k$a */
    public class C30329a implements MTimerHandler.CallBack {
        public C30329a() {
        }

        public boolean onTimerExpired() {
            long j;
            if (!C86709a0.m107522a()) {
                C69959k kVar = C69959k.this;
                kVar.f201783j.startTimer((long) kVar.f201782i);
                return false;
            }
            C69959k.this.mo96266a(5, 5);
            C69959k kVar2 = C69959k.this;
            MTimerHandler mTimerHandler = kVar2.f201783j;
            kVar2.getClass();
            long g = (long) C76559f.m92111g();
            if (g <= 0) {
                j = (long) kVar2.f201782i;
            } else {
                Log.m105924i("MicroMsg.OfflineTokensMgr", "OfflineTokensMgr updateInterval:" + g);
                j = g * 1000;
            }
            mTimerHandler.startTimer(j);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.k$d */
    public class C30330d implements Runnable {
        public C30330d(C30329a aVar) {
        }

        public void run() {
            Log.m105924i("MicroMsg.OfflineTokensMgr", "mUpdateTokenRunnable, do doNetSceneToken");
            if (!C86709a0.m107523b().mo121114l()) {
                Log.m105928w("MicroMsg.OfflineTokensMgr", "account not init.");
            } else {
                C69959k.this.mo96267b(6, 6);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.k$b */
    public class C69960b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f201784d;

        /* renamed from: e */
        public final /* synthetic */ int f201785e;

        public C69960b(int i, int i2) {
            this.f201784d = i;
            this.f201785e = i2;
        }

        public void run() {
            C69959k.this.mo96267b(this.f201784d, this.f201785e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.k$c */
    public interface C69961c {
    }

    public C69959k() {
        try {
            C75105d.m90074e().mo104805i(MMApplicationContext.getContext());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.OfflineTokensMgr", "NO MPERMISSION for READ_PHONE_STATE:%s.", e);
        }
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(385, this);
        String zx02 = C69963m.wx0().zx0(196649);
        long j = 1;
        if (TextUtils.isEmpty(zx02) || !C76559f.m92114j(zx02)) {
            Log.m105924i("MicroMsg.OfflineTokensMgr", "genInitInterval: update_interval is empty or is not number,update token");
        } else {
            String zx03 = C69963m.wx0().zx0(196632);
            Log.m105924i("MicroMsg.OfflineTokensMgr", "genInitInterval: token is not over update interval,lastUpdate is " + zx03);
            long longValue = Long.valueOf(zx02).longValue();
            if (TextUtils.isEmpty(zx03)) {
                Log.m105924i("MicroMsg.OfflineTokensMgr", "genInitInterval lastUpdate is empty, update token");
            } else {
                long longValue2 = Long.valueOf(zx03).longValue();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Log.m105924i("MicroMsg.OfflineTokensMgr", "genInitInterval token is not over update interval,curTime = " + currentTimeMillis + ";");
                j = longValue - (currentTimeMillis - longValue2);
            }
        }
        Log.m105924i("MicroMsg.OfflineTokensMgr", "autoPusher startTimer interval=" + j);
        this.f201783j.startTimer(j * 1000);
    }

    /* renamed from: a */
    public void mo96266a(int i, int i2) {
        if (NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext()) && C76559f.m92115k()) {
            Log.m105924i("MicroMsg.OfflineTokensMgr", "onNotify return false, token is invalid, do doNetSceneToken");
            if (C76559f.m92113i()) {
                Log.m105924i("MicroMsg.OfflineTokensMgr", "offline kinda enable, update offline token in kinda");
                ((C76324c) C86312j.m106911c(C76324c.class)).updateOfflinePayTokenFromScene(i);
                return;
            }
            mo96267b(i, i2);
        }
    }

    /* renamed from: b */
    public void mo96267b(int i, int i2) {
        if (!this.f201777d) {
            if (C76303b.f223503j) {
                Log.m105928w("MicroMsg.OfflineTokensMgr", "is doing setofflinepayment");
                return;
            }
            this.f201777d = true;
            C76309n nVar = new C76309n("" + (System.currentTimeMillis() / 1000), i, i2);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(nVar);
            MMApplicationContext.getContext();
            boolean z = AppForegroundDelegate.INSTANCE.f343454n;
            boolean isNetworkConnected = NetStatusUtil.isNetworkConnected(MMApplicationContext.getContext());
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(14163, 4, Integer.valueOf(z ^ true ? 1 : 0), Integer.valueOf(isNetworkConnected ? 1 : 0), 0, Integer.valueOf(i), Integer.valueOf(C69963m.f201787j ? 1 : 0));
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(135);
            iDKey.SetValue(1);
            iDKey.SetKey(isNetworkConnected ? 36 : 37);
            arrayList.add(iDKey);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(135);
            iDKey2.SetValue(1);
            iDKey2.SetKey(z ? 38 : 39);
            arrayList.add(iDKey2);
            IDKey iDKey3 = new IDKey();
            iDKey3.SetID(135);
            iDKey3.SetValue(1);
            iDKey3.SetKey(C69963m.f201787j ? 40 : 41);
            arrayList.add(iDKey3);
            if (i == 2) {
                IDKey iDKey4 = new IDKey();
                iDKey4.SetID(135);
                iDKey4.SetValue(1);
                iDKey4.SetKey(C69963m.f201787j ? 42 : 43);
                arrayList.add(iDKey4);
                IDKey iDKey5 = new IDKey();
                iDKey5.SetID(135);
                iDKey5.SetValue(1);
                iDKey5.SetKey(z ? 44 : 45);
                arrayList.add(iDKey5);
                IDKey iDKey6 = new IDKey();
                iDKey6.SetID(135);
                iDKey6.SetValue(1);
                iDKey6.SetKey(isNetworkConnected ? 46 : 47);
                arrayList.add(iDKey6);
            } else if (i == 6) {
                IDKey iDKey7 = new IDKey();
                iDKey7.SetID(135);
                iDKey7.SetValue(1);
                iDKey7.SetKey(C69963m.f201787j ? 48 : 49);
                arrayList.add(iDKey7);
                IDKey iDKey8 = new IDKey();
                iDKey8.SetID(135);
                iDKey8.SetValue(1);
                iDKey8.SetKey(z ? 50 : 51);
                arrayList.add(iDKey8);
                IDKey iDKey9 = new IDKey();
                iDKey9.SetID(135);
                iDKey9.SetValue(1);
                iDKey9.SetKey(isNetworkConnected ? 52 : 53);
                arrayList.add(iDKey9);
            } else if (i == 6) {
                IDKey iDKey10 = new IDKey();
                iDKey10.SetID(135);
                iDKey10.SetValue(1);
                iDKey10.SetKey(z ? 54 : 55);
                arrayList.add(iDKey10);
            }
            nVar2.mo160124a(arrayList, true);
        }
    }

    /* renamed from: c */
    public void mo96268c(int i, int i2) {
        if (mo96269d(true) > 2) {
            this.f201779f.postDelayed(new C69960b(i, i2), 3000);
        } else {
            mo96267b(i, i2);
        }
    }

    /* renamed from: d */
    public int mo96269d(boolean z) {
        String zx02 = C69963m.wx0().zx0(196617);
        C75105d.m90074e().getClass();
        int tokenCount = CertUtil.getInstance().getTokenCount(zx02);
        Log.m105919d("MicroMsg.CertUtilWx", "getTokenCount ret: %d", Integer.valueOf(tokenCount));
        Log.m105924i("MicroMsg.OfflineTokensMgr", "offline tokens count:" + tokenCount);
        return tokenCount;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo96270e(boolean r13) {
        /*
            r12 = this;
            boolean r0 = kd2.C76559f.m92115k()
            r1 = 0
            java.lang.String r2 = "MicroMsg.OfflineTokensMgr"
            if (r0 != 0) goto L_0x0010
            java.lang.String r13 = "offline is not create!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            return r1
        L_0x0010:
            r0 = 1
            if (r13 == 0) goto L_0x002a
            boolean r3 = kd2.C76559f.m92113i()
            if (r3 == 0) goto L_0x002a
            java.lang.String r13 = "is forground and enable kinda, check ifneed update token in kinda"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r13)
            java.lang.Class<ie3.c> r13 = ie3.C76324c.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ie3.c r13 = (ie3.C76324c) r13
            r13.checkIfNeedUpdateOfflinePayToken()
            return r0
        L_0x002a:
            int r3 = r12.mo96269d(r0)
            int r4 = com.tencent.p014mm.plugin.offline.C69963m.xx0()
            r5 = 9
            if (r3 >= r4) goto L_0x007b
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r4 = com.tencent.p014mm.plugin.offline.C69963m.xx0()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r1] = r4
            java.lang.String r4 = "getTokenCount < %s, do doNetSceneToken"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r3)
            com.tencent.mm.wallet_core.model.d r3 = com.tencent.p014mm.wallet_core.model.C75105d.m90074e()
            int r3 = r3.mo104802f()
            if (r3 == 0) goto L_0x006b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "getTokenCount occurs error, the error is "
            r13.append(r0)
            r13.append(r3)
            java.lang.String r0 = ", don't  doNetSceneToken"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r13)
            return r1
        L_0x006b:
            java.lang.String r1 = "getTokenCount is success! do doNetSceneToken"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 2
            if (r13 == 0) goto L_0x0077
            r12.mo96268c(r1, r5)
            goto L_0x007a
        L_0x0077:
            r12.mo96268c(r1, r1)
        L_0x007a:
            return r0
        L_0x007b:
            com.tencent.mm.plugin.offline.m r3 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            r4 = 196632(0x30018, float:2.7554E-40)
            java.lang.String r3 = r3.zx0(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x008d
            goto L_0x00a8
        L_0x008d:
            int r4 = kd2.C76559f.m92111g()
            long r6 = (long) r4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            long r3 = r3.longValue()
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r10
            long r8 = r8 - r3
            int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x00a8
            r3 = 1
            goto L_0x00a9
        L_0x00a8:
            r3 = 0
        L_0x00a9:
            if (r3 == 0) goto L_0x00bb
            java.lang.String r1 = "WalletOfflineUtil.isTokenOverUpdateInterval() return false, token is over update_interval, do doNetSceneToken"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 5
            if (r13 == 0) goto L_0x00b7
            r12.mo96267b(r1, r5)
            goto L_0x00ba
        L_0x00b7:
            r12.mo96267b(r1, r1)
        L_0x00ba:
            return r0
        L_0x00bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.C69959k.mo96270e(boolean):boolean");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C69961c cVar;
        if (yVar instanceof C76305i) {
            ArrayList arrayList = new ArrayList();
            boolean z = yVar instanceof C76309n;
            if (z) {
                IDKey iDKey = new IDKey();
                iDKey.SetID(135);
                iDKey.SetValue(1);
                iDKey.SetKey(2);
                arrayList.add(iDKey);
                if (!(i == 0 && i2 == 0)) {
                    IDKey iDKey2 = new IDKey();
                    iDKey2.SetID(135);
                    iDKey2.SetValue(1);
                    iDKey2.SetKey(3);
                    arrayList.add(iDKey2);
                }
                C115669n.INSTANCE.mo160124a(arrayList, true);
            }
            if (i == 0 && i2 == 0) {
                if (z) {
                    this.f201778e = 0;
                    this.f201777d = false;
                    this.f201779f.removeCallbacks(this.f201781h);
                    if (((C76309n) yVar).mo106544l1() && (cVar = this.f201780g) != null) {
                        ((C69952f.C69953a) cVar).mo96261a();
                    }
                } else if (yVar instanceof C76308m) {
                    ((C76308m) yVar).getClass();
                    C69961c cVar2 = this.f201780g;
                    if (cVar2 != null) {
                        ((C69952f.C69953a) cVar2).mo96261a();
                    }
                }
            } else if (z) {
                Log.m105920e("MicroMsg.OfflineTokensMgr", "gettoken is failed!");
                int i3 = this.f201778e + 1;
                this.f201778e = i3;
                this.f201777d = false;
                if (i2 == 411) {
                    Log.m105924i("MicroMsg.OfflineTokensMgr", "errcode is  411, do clearAllOfflineData");
                    C76559f.m92105a();
                } else if (i2 != 268465326 && i3 < 10) {
                    this.f201779f.removeCallbacks(this.f201781h);
                    int i4 = this.f201778e - 1;
                    if (i4 > 6) {
                        i4 = 6;
                    }
                    this.f201779f.postDelayed(this.f201781h, (long) (((int) Math.pow(2.0d, (double) i4)) * 60 * 1000));
                }
            } else {
                boolean z2 = yVar instanceof C76308m;
            }
        }
    }
}
