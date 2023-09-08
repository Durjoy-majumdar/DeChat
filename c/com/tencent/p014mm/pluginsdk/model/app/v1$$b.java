package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.tencent.mm.pluginsdk.model.app.v1$$b */
public final /* synthetic */ class v1$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82539d;

    /* renamed from: e */
    public final /* synthetic */ String f82540e;

    public /* synthetic */ v1$$b(String str, String str2) {
        this.f82539d = str;
        this.f82540e = str2;
    }

    public final void run() {
        String str = this.f82539d;
        String str2 = this.f82540e;
        HashMap<String, List<String>> hashMap = C72702v1.f211543b;
        List list = hashMap.get(str2);
        Object[] objArr = new Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = Integer.valueOf(list != null ? list.size() : -1);
        Log.m105919d("MicroMsg.OpenSDKTokenUtils", "saveTokenByPackageName token: %s, packageName: %s, size: %s", objArr);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(str);
        hashMap.put(str2, list);
    }
}
