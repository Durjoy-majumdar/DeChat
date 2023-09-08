package com.tencent.p014mm.network;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import ee0.C31566b;

/* renamed from: com.tencent.mm.network.m0 */
public final class C114786m0 {

    /* renamed from: a */
    public C31566b f344173a = null;

    /* renamed from: b */
    public boolean f344174b = false;

    /* renamed from: a */
    public static boolean m161568a(Context context) {
        return context != null && NetStatusUtil.isWifi(context);
    }
}
