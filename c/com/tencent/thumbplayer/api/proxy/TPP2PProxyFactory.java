package com.tencent.thumbplayer.api.proxy;

import android.content.Context;
import com.tencent.thumbplayer.datatransport.TPPreloadProxyImpl;

public class TPP2PProxyFactory {
    public static ITPPreloadProxy createPreloadManager(Context context, int i) {
        return new TPPreloadProxyImpl(context, i);
    }
}
