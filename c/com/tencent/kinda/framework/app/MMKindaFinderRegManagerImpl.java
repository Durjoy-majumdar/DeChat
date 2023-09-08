package com.tencent.kinda.framework.app;

import android.app.Activity;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KindaFinderRegManager;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ht1.C60200t1;

public class MMKindaFinderRegManagerImpl implements KindaFinderRegManager {
    private final String TAG = "MicorMsg.MMFinderRegManagerImpl";

    public void startFinderFeeds(String str, String str2) {
        Log.m105925i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile feedid：%s，nonceid：%s", str, str2);
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof UIPageFragmentActivity)) {
            Log.m105921e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
            return;
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83794l6(topOrUIPageFragmentActivity, str, str2, true, 16, C72517z.m84853a(1));
    }

    public void startFinderProfile(String str) {
        Log.m105925i("MicorMsg.MMFinderRegManagerImpl", "startFinderProfile username：%s", str);
        Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
        if (!(topOrUIPageFragmentActivity instanceof UIPageFragmentActivity)) {
            Log.m105921e("MicorMsg.MMFinderRegManagerImpl", "startFaceImpl failed due to incompatible context(%s)", topOrUIPageFragmentActivity.getClass().getName());
            return;
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83758E5(topOrUIPageFragmentActivity, str, 16, C72517z.m84853a(1));
    }
}
