package tc1;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1713l4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: tc1.b */
public class C37012b implements C11385n {

    /* renamed from: f */
    public static C37012b f98127f;

    /* renamed from: g */
    public static volatile boolean f98128g;

    /* renamed from: d */
    public final Context f98129d;

    /* renamed from: e */
    public int f98130e;

    public C37012b(Context context) {
        this.f98129d = context;
    }

    /* renamed from: a */
    public static C37012b m41119a() {
        C37012b bVar = f98127f;
        if (bVar != null) {
            return bVar;
        }
        synchronized (C37012b.class) {
            C37012b bVar2 = f98127f;
            if (bVar2 != null) {
                return bVar2;
            }
            Context context = MMApplicationContext.getContext();
            if (context == null) {
                Log.m105920e("MicroMsg.FCM.FcmRegister", "FCM appcontext null");
                return null;
            }
            C37012b bVar3 = new C37012b(context);
            f98127f = bVar3;
            return bVar3;
        }
    }

    /* renamed from: b */
    public void mo60934b(String str) {
        Log.m105925i("MicroMsg.FCM.FcmRegister", "register token to svr: %s", str);
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(901, 11, 1, false);
        if (Util.isNullOrNil(str)) {
            dVar.idkeyStat(901, 13, 1, false);
            Log.m105920e("MicroMsg.FCM.FcmRegister", "token is null, fail reg");
        } else if (this.f98130e == C86718e.m107549h()) {
            dVar.idkeyStat(901, 12, 1, false);
            Log.m105928w("MicroMsg.FCM.FcmRegister", "have registered yet.");
        } else {
            C37013c cVar = new C37013c(str);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123455a(216, this);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(cVar);
            dVar.idkeyStat(901, 14, 1, false);
        }
    }

    /* renamed from: c */
    public final void mo60935c(Context context, boolean z) {
        SharedPreferences sharedPreferences = this.f98129d.getSharedPreferences(C37012b.class.getSimpleName(), 0);
        Log.m105924i("MicroMsg.FCM.FcmRegister", "Saving regSvrResult: " + z);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("isRegToSvr", z);
        edit.commit();
        if (z) {
            this.f98130e = C86718e.m107549h();
        } else {
            this.f98130e = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.FCM.FcmRegister", r0, "init fcm sdk fail", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo60936d() {
        /*
            r5 = this;
            boolean r0 = f98128g
            r1 = 1
            if (r0 != 0) goto L_0x0041
            monitor-enter(r5)
            boolean r0 = f98128g     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003c
            android.content.Context r0 = r5.f98129d     // Catch:{ all -> 0x002f }
            com.google.firebase.FirebaseApp.m155198b(r0)     // Catch:{ all -> 0x002f }
            h9.a r0 = p545h9.C32739a.f89115b     // Catch:{ all -> 0x002f }
            java.lang.Class<h9.a> r0 = p545h9.C32739a.class
            monitor-enter(r0)     // Catch:{ all -> 0x002f }
            h9.a r2 = p545h9.C32739a.f89115b     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x0023
            h9.a r2 = new h9.a     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.FirebaseInstanceId r3 = com.google.firebase.iid.FirebaseInstanceId.m155204a()     // Catch:{ all -> 0x002c }
            r2.<init>(r3)     // Catch:{ all -> 0x002c }
            p545h9.C32739a.f89115b = r2     // Catch:{ all -> 0x002c }
        L_0x0023:
            h9.a r2 = p545h9.C32739a.f89115b     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            r2.mo58787a(r1)     // Catch:{ all -> 0x002f }
            f98128g = r1     // Catch:{ all -> 0x002f }
            goto L_0x003c
        L_0x002c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            java.lang.String r1 = "MicroMsg.FCM.FcmRegister"
            java.lang.String r2 = "init fcm sdk fail"
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x003e }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            return r3
        L_0x003c:
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003e }
            throw r0
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tc1.C37012b.mo60936d():boolean");
    }

    /* renamed from: e */
    public final void mo60937e() {
        C117407d dVar = C117407d.INSTANCE;
        dVar.idkeyStat(901, 18, 1, false);
        String b = mo60936d() ? FirebaseInstanceId.m155204a().mo169410b() : null;
        if (Util.isNullOrNil(b)) {
            dVar.idkeyStat(901, 19, 1, false);
            Log.m105928w("MicroMsg.FCM.FcmRegister", "unreg fail, token is null");
            return;
        }
        mo60935c(this.f98129d, false);
        C37014d dVar2 = new C37014d(b);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1713l4.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(dVar2);
        dVar.idkeyStat(901, 21, 1, false);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar != null) {
            boolean z = false;
            if (yVar instanceof C37013c) {
                C86709a0.m107528h();
                C37013c cVar = (C37013c) yVar;
                C86709a0.m107529k().f251779b.mo123455a(216, this);
                if (i == 0 && i2 == 0) {
                    z = true;
                    Log.m105924i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg success.");
                    C117407d.INSTANCE.idkeyStat(901, 16, 1, false);
                } else {
                    Log.m105924i("MicroMsg.FCM.FcmRegister", "NetSceneFcmReg faild.");
                    C117407d.INSTANCE.idkeyStat(901, 17, 1, false);
                }
                mo60935c(this.f98129d, z);
            } else if (yVar instanceof C37014d) {
                C86709a0.m107528h();
                C37014d dVar = (C37014d) yVar;
                C86709a0.m107529k().f251779b.mo123455a(C1713l4.CTRL_INDEX, this);
                if (i == 0 && i2 == 0) {
                    Log.m105924i("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg success.");
                    C117407d.INSTANCE.idkeyStat(901, 23, 1, false);
                } else {
                    Log.m105920e("MicroMsg.FCM.FcmRegister", "NetSceneFcmUnreg faild.");
                    C117407d.INSTANCE.idkeyStat(901, 24, 1, false);
                }
                mo60935c(this.f98129d, false);
            }
        }
    }
}
