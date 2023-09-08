package com.tencent.p014mm.plugin.offline;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import id2.C76313t;
import jd2.C33540a;
import yq3.C79143a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.offline.m */
public class C69963m extends C86301e {

    /* renamed from: j */
    public static boolean f201787j = false;

    /* renamed from: n */
    public static volatile int f201788n = 10;

    /* renamed from: o */
    public static boolean f201789o = false;

    /* renamed from: d */
    public C76313t f201790d = null;

    /* renamed from: e */
    public C69952f f201791e = null;

    /* renamed from: f */
    public C69959k f201792f = null;

    /* renamed from: g */
    public C33540a f201793g = null;

    /* renamed from: h */
    public MMHandler f201794h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public WearOfflineLogic f201795i;

    static {
        C79143a.m95769h("OfflineBindCardRegProcess", C69949e.class);
        C79143a.m95769h("OfflineBindCardProcess", C69946d.class);
    }

    public static C69963m wx0() {
        return (C69963m) C86312j.m106911c(C69963m.class);
    }

    public static synchronized int xx0() {
        int i;
        synchronized (C69963m.class) {
            if (!f201789o && MMApplicationContext.isMainProcess() && C86709a0.m107522a()) {
                f201788n = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.BUSINESS_OFFLINE_REGET_TOKEN_NUM_SYNC_INT, 10);
                Log.m105925i("MicroMsg.SubCoreOffline", "init get token count: %s", Integer.valueOf(f201788n));
                f201789o = true;
            }
            i = f201788n;
        }
        return i;
    }

    public C76313t Ax0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f201790d == null) {
            wx0().f201790d = new C76313t();
        }
        return wx0().f201790d;
    }

    public C69959k Bx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f201792f == null) {
            wx0().f201792f = new C69959k();
        }
        return wx0().f201792f;
    }

    public void Cx0(int i, String str) {
        if (str != null) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(i, str);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        this.f201795i = new WearOfflineLogic();
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        WearOfflineLogic wearOfflineLogic = this.f201795i;
        if (wearOfflineLogic != null) {
            wearOfflineLogic.getClass();
            wx0().Ax0().mo106556k(wearOfflineLogic);
            wearOfflineLogic.f201760d.dead();
        }
        this.f201795i = null;
    }

    public C69952f vx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f201791e == null) {
            wx0().f201791e = new C69952f();
        }
        return wx0().f201791e;
    }

    public C33540a yx0() {
        if (C86709a0.m107522a()) {
            if (wx0().f201793g == null) {
                C69963m wx02 = wx0();
                C86709a0.m107528h();
                wx02.f201793g = new C33540a(C86709a0.m107535s().f251811i);
            }
            return wx0().f201793g;
        }
        throw new C86484b();
    }

    public String zx0(int i) {
        C86709a0.m107528h();
        return (String) C86709a0.m107535s().mo121142i().mo119684e(i, (Object) null);
    }
}
