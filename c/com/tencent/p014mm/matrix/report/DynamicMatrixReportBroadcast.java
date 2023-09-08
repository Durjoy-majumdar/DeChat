package com.tencent.p014mm.matrix.report;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import org.json.JSONObject;
import p269xe.C91185g;
import p723vf.C118672d;
import r70.C89888c;

/* renamed from: com.tencent.mm.matrix.report.DynamicMatrixReportBroadcast */
public class DynamicMatrixReportBroadcast extends BroadcastReceiver {

    /* renamed from: a */
    public static DynamicMatrixReportBroadcast f237878a;

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            C118672d.m167352b("Matrix.DynamicMatrixReportBroadcast", "MatrixReportBroadcast intent == null", new Object[0]);
            return;
        }
        String stringExtra = IntentUtil.getStringExtra(intent, "tag");
        String stringExtra2 = IntentUtil.getStringExtra(intent, "key");
        int intExtra = IntentUtil.getIntExtra(intent, "type", 0);
        String stringExtra3 = IntentUtil.getStringExtra(intent, "value");
        String stringExtra4 = IntentUtil.getStringExtra(intent, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C91185g gVar = new C91185g();
        gVar.f261444b = stringExtra;
        gVar.f261445c = stringExtra2;
        gVar.f261443a = intExtra;
        try {
            gVar.f261446d = new JSONObject(stringExtra3);
            C89888c cVar = C80981c.INSTANCE.f237852d;
            if (cVar != null) {
                cVar.mo124179e(gVar, stringExtra4);
            }
        } catch (Throwable th) {
            Log.m105920e("Matrix.DynamicMatrixReportBroadcast", "parse json error : " + th.getMessage());
        }
    }
}
