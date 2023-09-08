package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.s$$a */
public final /* synthetic */ class s$$a implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final /* synthetic */ LaunchParcel f243812a;

    /* renamed from: b */
    public final /* synthetic */ String f243813b;

    public /* synthetic */ s$$a(LaunchParcel launchParcel, String str) {
        this.f243812a = launchParcel;
        this.f243813b = str;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        LaunchParcel launchParcel = this.f243812a;
        Log.m105925i("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s), send PendingIntent finished", launchParcel.f243730d, this.f243813b, launchParcel.f243738o);
    }
}
