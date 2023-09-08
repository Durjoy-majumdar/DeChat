package com.tencent.p014mm.plugin.topstory.p113ui.webview;

import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import ht1.C60216z4;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.topstory.ui.webview.e$$b */
public final /* synthetic */ class e$$b implements C60216z4.C8821a {

    /* renamed from: a */
    public final /* synthetic */ HashMap f21619a;

    public /* synthetic */ e$$b(HashMap hashMap) {
        this.f21619a = hashMap;
    }

    /* renamed from: a */
    public final void mo6382a(Object obj) {
        HashMap hashMap = this.f21619a;
        Log.m105925i("MicroMsg.TopStory.TopStoryWebViewJSApi", "retMsg:%s", obj.toString());
        if (obj.getClass() == Pair.class) {
            Pair pair = (Pair) obj;
            int intValue = ((Integer) pair.first).intValue();
            String str = (String) pair.second;
            if (intValue == 0) {
                hashMap.put("err_msg", "openFinderView:ok");
                hashMap.put("feed_read_info", str);
                return;
            }
            hashMap.put("err_msg", "openFinderViewfail,retCode:" + intValue);
        }
    }
}
