package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionStartActivity */
final class AppBrandLaunchErrorActionStartActivity extends AppBrandLaunchErrorAction {

    /* renamed from: g */
    public final String f243120g;

    /* renamed from: h */
    public final String f243121h;

    /* renamed from: i */
    public final Intent f243122i;

    public AppBrandLaunchErrorActionStartActivity(String str, int i, String str2, String str3, Intent intent) {
        super(str, i);
        this.f243120g = str2;
        this.f243121h = str3;
        this.f243122i = intent;
    }

    /* renamed from: a */
    public void mo115478a(Context context, String str) {
        Log.m105925i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) startActivity %s -> %s", str, context.getClass().getName(), this.f243121h);
        Intent intent = this.f243122i;
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        } else {
            intent.setFlags(intent.getFlags() & -268435457);
        }
        C88144b.m109791i(context, this.f243120g, this.f243121h, intent, (Bundle) null);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "AppBrandLaunchErrorActionStartActivity[%s.%s|%s]", new Object[]{this.f243120g, this.f243121h, this.f243122i});
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f243120g);
        parcel.writeString(this.f243121h);
        parcel.writeParcelable(this.f243122i, 0);
    }

    public AppBrandLaunchErrorActionStartActivity(Parcel parcel) {
        super(parcel);
        this.f243120g = parcel.readString();
        this.f243121h = parcel.readString();
        this.f243122i = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
    }
}
