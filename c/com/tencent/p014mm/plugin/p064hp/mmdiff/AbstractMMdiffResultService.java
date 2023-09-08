package com.tencent.p014mm.plugin.p064hp.mmdiff;

import android.app.IntentService;
import android.content.Intent;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import w02.C90878b;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.AbstractMMdiffResultService */
public abstract class AbstractMMdiffResultService extends IntentService {
    public AbstractMMdiffResultService() {
        super("TinkerResultService");
    }

    /* renamed from: a */
    public abstract void mo118333a(C90878b bVar);

    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            ShareTinkerLog.m106531e("Tinker.AbstractMMdiffResultService", "AbstractMMdiffResultService received a null intent, ignoring.", new Object[0]);
        } else {
            mo118333a((C90878b) ShareIntentUtil.getSerializableExtra(intent, "result_extra"));
        }
    }
}
