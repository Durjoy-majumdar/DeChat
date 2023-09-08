package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import ke3.C88144b;
import te3.C49001ch;
import te3.C52006xq1;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.a */
public final class C42700a {
    /* renamed from: a */
    public static final String m46397a(Context context, int i, C49001ch chVar) {
        C52006xq1 xq12;
        LinkedList<C52006xq1> linkedList;
        if (chVar != null && (chVar.f131713j & i) != 0 && (linkedList = chVar.f131714n) != null) {
            Iterator<C52006xq1> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xq12 = it.next();
                if (xq12.f144874d == i) {
                    break;
                }
            }
        }
        xq12 = null;
        String str = xq12 != null ? xq12.f144876f : null;
        if (!Util.isNullOrNil(str)) {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", str), (Bundle) null);
            if (context != null) {
                if (!(context instanceof Activity)) {
                    context = null;
                }
                if (context != null) {
                    Activity activity = (Activity) context;
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
        if (xq12 != null) {
            return xq12.f144875e;
        }
        return null;
    }
}
