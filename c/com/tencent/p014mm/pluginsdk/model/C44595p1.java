package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.service.C116024c;
import ke3.C88144b;

/* renamed from: com.tencent.mm.pluginsdk.model.p1 */
public class C44595p1 {
    /* renamed from: a */
    public static void m49048a(Context context, int i) {
        Log.m105924i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkXWebNow, type:" + i);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.tencent.mm.sandbox.updater.UpdaterService");
        intent.putExtra("intent_extra_download_type", i);
        C116024c.m163164d(intent, "support", true, C88144b.m109786e("support"));
    }
}
