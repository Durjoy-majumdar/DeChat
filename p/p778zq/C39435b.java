package p778zq;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.fcm.WCFirebaseMessagingService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import java.util.LinkedList;
import kj2.C117407d;
import tc1.C37012b;
import tc1.C90389a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: zq.b */
public class C39435b extends C86301e {

    /* renamed from: d */
    public static boolean f105930d = true;

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        if (f105930d) {
            vx0();
        }
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        Log.m105924i("MicroMsg.FCM.FCMFeatureService", "fcmUnRegisterEventListener callback loadFCM=" + f105930d);
        if (f105930d) {
            wx0();
        }
    }

    public void onCreate(Context context) {
        Log.m105924i("MicroMsg.FCM.FCMFeatureService", "register listener at " + MMApplicationContext.getProcessName());
        if (!C90389a.m113188b(MMApplicationContext.getContext())) {
            f105930d = false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean vx0() {
        /*
            r14 = this;
            boolean r0 = f40.C86709a0.m107522a()
            r1 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "MicroMsg.FCM.FCMFeatureService"
            java.lang.String r2 = "accout not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            return r1
        L_0x000f:
            tc1.b r0 = tc1.C37012b.m41119a()
            if (r0 == 0) goto L_0x00d6
            java.lang.String r2 = "MicroMsg.FCM.FcmRegister"
            r3 = 1
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x004b }
            int r4 = r4.intValue()     // Catch:{ all -> 0x004b }
            r5 = 14
            if (r4 >= r5) goto L_0x002c
            java.lang.String r4 = "device not support FCM reason = version < 14"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)     // Catch:{ all -> 0x004b }
            goto L_0x0053
        L_0x002c:
            android.content.Context r4 = r0.f98129d     // Catch:{ all -> 0x004b }
            int r4 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r4)     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0049
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004b }
            r5.<init>()     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "device not support FCM reason = "
            r5.append(r6)     // Catch:{ all -> 0x004b }
            r5.append(r4)     // Catch:{ all -> 0x004b }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x004b }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)     // Catch:{ all -> 0x004b }
            goto L_0x0053
        L_0x0049:
            r4 = 1
            goto L_0x0054
        L_0x004b:
            r4 = move-exception
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0091
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Google Play Services is available, "
            r4.append(r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            boolean r4 = r0.mo60936d()
            if (r4 == 0) goto L_0x008b
            com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.m155204a()
            java.lang.String r1 = r1.mo169410b()
            if (r1 != 0) goto L_0x0087
            java.lang.String r4 = "token is null, not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
        L_0x0087:
            r0.mo60934b(r1)
            goto L_0x00d5
        L_0x008b:
            java.lang.String r4 = "init fcm sdk failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
            goto L_0x0096
        L_0x0091:
            java.lang.String r4 = "Google Play Services Unavailable"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
        L_0x0096:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11250(0x2bf2, float:1.5765E-41)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "2,"
            r5.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.kvStat(r4, r5)
            kj2.d r6 = kj2.C117407d.INSTANCE
            r7 = 901(0x385, double:4.45E-321)
            r9 = 0
            r11 = 1
            r13 = 0
            r6.idkeyStat(r7, r9, r11, r13)
            android.content.Context r2 = r0.f98129d
            java.lang.Class<tc1.b> r4 = tc1.C37012b.class
            java.lang.String r4 = r4.getSimpleName()
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r4, r1)
            java.lang.String r4 = "isRegToSvr"
            boolean r1 = r2.getBoolean(r4, r1)
            if (r1 == 0) goto L_0x00d5
            r0.mo60937e()
        L_0x00d5:
            return r3
        L_0x00d6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p778zq.C39435b.vx0():boolean");
    }

    public final boolean wx0() {
        Class<C37012b> cls = C37012b.class;
        C37012b a = C37012b.m41119a();
        if (a == null) {
            return false;
        }
        Log.m105924i("MicroMsg.FCM.FcmRegister", "FCM onLogout. isRegToSvr:" + a.f98129d.getSharedPreferences(cls.getSimpleName(), 0).getBoolean("isRegToSvr", false));
        ((LinkedList) WCFirebaseMessagingService.f248200n).clear();
        if (a.f98129d.getSharedPreferences(cls.getSimpleName(), 0).getBoolean("isRegToSvr", false)) {
            a.mo60937e();
            return true;
        }
        C117407d.INSTANCE.idkeyStat(901, 20, 1, false);
        return true;
    }
}
