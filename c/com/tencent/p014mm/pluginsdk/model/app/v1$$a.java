package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.model.app.v1$$a */
public final /* synthetic */ class v1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82538d;

    public /* synthetic */ v1$$a(String str) {
        this.f82538d = str;
    }

    public final void run() {
        String str = this.f82538d;
        List<String> remove = C72702v1.f211543b.remove(str);
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(remove != null ? remove.size() : -1);
        Log.m105919d("MicroMsg.OpenSDKTokenUtils", "clearTokenByPackageName packageName: %s, size: %s", objArr);
        if (remove != null && !remove.isEmpty()) {
            for (String remove2 : remove) {
                C72702v1.f211542a.remove(remove2);
            }
        }
    }
}
