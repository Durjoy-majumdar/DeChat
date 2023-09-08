package com.tencent.recovery.p477wx.service;

import a70.C79471a;
import af3.C79525e;
import af3.C79531f;
import af3.C79532g;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import bf3.C79700b;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.sdk.platformtools.Log;
import p329d3.C86165a;
import te3.C90432q93;

/* renamed from: com.tencent.recovery.wx.service.WXRecoveryUploadService */
public class WXRecoveryUploadService extends IntentService {
    private static final String EXTRA_FETCH_BASE_ID = "extra_fetch_base_id";
    private static final String EXTRA_PATCH_URL = "extra_patch_url";
    private static final String RECOVERY_TAG = "MicroMsg.recovery.service";

    public WXRecoveryUploadService() {
        super("WXRecoveryUploadService");
    }

    public static void fetchTinkerPatch(Context context, String str) {
        Intent intent = new Intent();
        intent.setClass(context, WXRecoveryUploadService.class);
        intent.putExtra(EXTRA_FETCH_BASE_ID, str);
        try {
            context.startService(intent);
        } catch (Throwable th) {
            Log.m105929w(RECOVERY_TAG, "start service fail", th);
        }
    }

    public IBinder onBind(Intent intent) {
        Log.m105924i(RECOVERY_TAG, "onBind");
        onHandleIntent(intent);
        return null;
    }

    public void onHandleIntent(Intent intent) {
        Intent intent2 = intent;
        if (intent2.getIntExtra("extra_crash_count", -1) == -1) {
            String stringExtra = intent2.getStringExtra(EXTRA_FETCH_BASE_ID);
            if (!TextUtils.isEmpty(stringExtra)) {
                Log.m105924i(RECOVERY_TAG, "fetchTinkerPatchByBaseId");
                Log.m105924i(RECOVERY_TAG, "baseId = " + stringExtra);
                Context applicationContext = getApplicationContext();
                C860391 r5 = new C86165a<Integer>() {
                    public void accept(Integer num) {
                        Log.m105924i(WXRecoveryUploadService.RECOVERY_TAG, "fetchTinkerPatchByBaseId callback, status = " + num);
                    }
                };
                C85671c.m105784b("MicroMsg.recovery.operator", "#fetchTinkerPatchForTest");
                C79531f fVar = new C79531f(applicationContext, stringExtra, r5);
                C90432q93 q932 = new C90432q93();
                q932.f259754d = stringExtra;
                q932.f259755e = C79471a.m96436a();
                q932.f259756f = C79700b.m96818b();
                q932.f259761n = 1;
                C79525e.m96546a(applicationContext, q932, fVar, false);
                Log.m105924i(RECOVERY_TAG, "fetchTinkerPatchByBaseId done");
                return;
            }
            return;
        }
        C85672d.C85674b bVar = new C85672d.C85674b(getApplication(), "recovery_statistic");
        bVar.mo119256e();
        int i = bVar.getInt("crash_count", 0);
        boolean z = bVar.getBoolean("launch_recovery", false);
        bVar.getBoolean("launch_recovery_real", false);
        boolean z2 = bVar.getBoolean("recover_from_crash", false);
        int i2 = bVar.getInt("recovery_status", -1);
        int i3 = bVar.getInt("recovery_from", 0);
        int i4 = bVar.getInt("recover_internal_status", 0);
        int i5 = bVar.getInt("recover_launch_mode", 0);
        long j = bVar.getLong("recover_running_time", 0);
        bVar.getBoolean("recover_is_discard", false);
        bVar.mo119258g("crash_count", (long) i);
        bVar.putBoolean("launch_recovery", z);
        bVar.putBoolean("launch_recovery_real", true);
        bVar.putBoolean("recover_from_crash", z2);
        bVar.putInt("recovery_status", i2);
        bVar.putInt("recovery_from", i3);
        bVar.putInt("recover_internal_status", i4);
        bVar.putInt("recover_launch_mode", i5);
        bVar.putLong("recover_running_time", j);
        bVar.putBoolean("recover_is_discard", false);
        bVar.putString("recover_app_ver", bVar.getString("recover_app_ver", ""));
        bVar.mo119242c();
        fetchTinkerPatch(intent);
    }

    private void fetchTinkerPatch(Intent intent) {
        int[] iArr = {0};
        try {
            C79532g gVar = new C79532g(iArr);
            String stringExtra = intent.getStringExtra(EXTRA_PATCH_URL);
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getDataString();
            }
            String str = stringExtra;
            if (TextUtils.isEmpty(str)) {
                C85671c.m105784b(RECOVERY_TAG, "#fetchTinkerPatch, fetch patch url with cgi");
                C79525e.m96548c(getApplicationContext(), gVar);
            } else {
                C85671c.m105784b(RECOVERY_TAG, "#fetchTinkerPatch, download patch with given url, url = " + str);
                C79525e.m96547b(getApplicationContext(), str, 0, (String) null, gVar, true);
            }
        } catch (Throwable th) {
            C85671c.m105785c(RECOVERY_TAG, "fetch error", th);
            iArr[0] = 10;
        }
        C85671c.m105784b(RECOVERY_TAG, "#fetchTinkerPatch done, status = " + iArr[0]);
        C85672d.C85674b bVar = new C85672d.C85674b(getApplication(), "recovery_statistic");
        bVar.mo119256e();
        int i = bVar.getInt("crash_count", 0);
        boolean z = bVar.getBoolean("launch_recovery", false);
        boolean z2 = bVar.getBoolean("launch_recovery_real", false);
        boolean z3 = bVar.getBoolean("recover_from_crash", false);
        bVar.getInt("recovery_status", -1);
        int i2 = bVar.getInt("recovery_from", 0);
        int i3 = bVar.getInt("recover_internal_status", 0);
        int i4 = bVar.getInt("recover_launch_mode", 0);
        long j = bVar.getLong("recover_running_time", 0);
        bVar.getBoolean("recover_is_discard", false);
        String string = bVar.getString("recover_app_ver", "");
        int i5 = iArr[0];
        String str2 = string;
        bVar.mo119258g("crash_count", (long) i);
        bVar.putBoolean("launch_recovery", z);
        bVar.putBoolean("launch_recovery_real", z2);
        bVar.putBoolean("recover_from_crash", z3);
        bVar.mo119258g("recovery_status", (long) i5);
        bVar.mo119258g("recovery_from", (long) i2);
        bVar.mo119258g("recover_internal_status", (long) i3);
        bVar.mo119258g("recover_launch_mode", (long) i4);
        bVar.mo119258g("recover_running_time", j);
        bVar.putBoolean("recover_is_discard", false);
        bVar.putString("recover_app_ver", str2);
        bVar.mo119242c();
    }
}
