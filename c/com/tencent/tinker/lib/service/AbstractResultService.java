package com.tencent.tinker.lib.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import hv3.C87598a;

public abstract class AbstractResultService extends IntentService {
    public AbstractResultService() {
        super("TinkerResultService");
    }

    /* renamed from: b */
    public static void m106523b(Context context, C87598a aVar, String str) {
        if (str != null) {
            try {
                Intent intent = new Intent();
                intent.setClassName(context, str);
                intent.putExtra("result_extra", aVar);
                context.startService(intent);
            } catch (Throwable th) {
                ShareTinkerLog.m106531e("Tinker.AbstractResultService", "run result service fail, exception:" + th, new Object[0]);
            }
        } else {
            throw new TinkerRuntimeException("resultServiceClass is null.");
        }
    }

    /* renamed from: a */
    public abstract void mo118340a(C87598a aVar);

    public void onHandleIntent(Intent intent) {
        if (intent == null) {
            ShareTinkerLog.m106531e("Tinker.AbstractResultService", "AbstractResultService received a null intent, ignoring.", new Object[0]);
        } else {
            mo118340a((C87598a) ShareIntentUtil.getSerializableExtra(intent, "result_extra"));
        }
    }
}
