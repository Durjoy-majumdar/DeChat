package com.tencent.p014mm.plugin.p064hp.mmdiff;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import w02.C90878b;
import w02.C90884g;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService */
public class MMDiffPatchResultService extends AbstractMMdiffResultService {

    /* renamed from: e */
    public static C90884g f248323e;

    /* renamed from: f */
    public static C90884g f248324f;

    /* renamed from: d */
    public boolean f248325d = true;

    /* renamed from: b */
    public static void m105113b(Context context, C90878b bVar, boolean z) {
        try {
            Intent intent = new Intent();
            intent.setClass(context, MMDiffPatchResultService.class);
            intent.putExtra("result_extra", bVar);
            intent.putExtra("needKillProccess", z);
            context.startService(intent);
        } catch (Throwable th) {
            ShareTinkerLog.m106531e("Tinker.MMDiffPatchResultService.HdiffApk", "run result service fail, exception:" + th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo118333a(C90878b bVar) {
        C90884g gVar;
        C90884g gVar2;
        if (bVar == null) {
            Log.m105920e("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService received null result!!!!");
            return;
        }
        Log.m105925i("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService receive result: %s, needKillProccess = %s", bVar.toString(), Boolean.valueOf(this.f248325d));
        Log.m105925i("Tinker.MMDiffPatchResultService.HdiffApk", "isAuto = %s, autoResultCallBack = %s, maunalResultCallBack = %s.", Boolean.valueOf(bVar.f260857f), f248324f, f248323e);
        if (bVar.f260857f && (gVar2 = f248324f) != null) {
            gVar2.mo123270a(bVar);
        }
        if (!bVar.f260857f && (gVar = f248323e) != null) {
            gVar.mo123270a(bVar);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            ShareTinkerLog.m106531e("Tinker.MMDiffPatchResultService.HdiffApk", "AbstractResultService received a null intent, ignoring.", new Object[0]);
            return;
        }
        this.f248325d = intent.getBooleanExtra("needKillProccess", true);
        mo118333a((C90878b) ShareIntentUtil.getSerializableExtra(intent, "result_extra"));
    }
}
