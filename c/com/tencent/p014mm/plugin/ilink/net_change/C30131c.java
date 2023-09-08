package com.tencent.p014mm.plugin.ilink.net_change;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.ilink.net_change.c */
public final class C30131c<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ String f81465d;

    public C30131c(String str) {
        this.f81465d = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        Log.m105925i("MicroMsg.NetworkChangeSubProcessImpl", "hy: %s invokeAsync result: %s", this.f81465d, String.valueOf((Bundle) obj));
    }
}
