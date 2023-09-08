package com.tencent.p014mm.plugin.ilink.net_change;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ilink.net_change.e */
public final class C30136e<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ String f81468d;

    public C30136e(String str) {
        this.f81468d = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Log.m105925i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s invokeAsync result: %s", this.f81468d, String.valueOf((Bundle) obj));
    }
}
