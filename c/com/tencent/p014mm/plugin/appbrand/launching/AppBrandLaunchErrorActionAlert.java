package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Locale;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchErrorActionAlert */
final class AppBrandLaunchErrorActionAlert extends AppBrandLaunchErrorAction {

    /* renamed from: g */
    public final String f243118g;

    /* renamed from: h */
    public final String f243119h;

    public AppBrandLaunchErrorActionAlert(String str, int i, String str2, String str3) {
        super(str, i);
        this.f243118g = str2;
        this.f243119h = str3;
    }

    /* renamed from: a */
    public void mo115478a(Context context, String str) {
        String str2 = this.f243119h;
        String str3 = this.f243118g;
        Log.m105925i("MicroMsg.AppBrandLaunchErrorAction", "showError(%s) alert title:%s, message:%s", str, str3, str2);
        if (!(context instanceof Activity)) {
            C81956c.m100673a((Context) null, str2, str3, MMApplicationContext.getResources().getString(C0966R.string.a18), "", (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        } else {
            C76879j.m92713G(context, str2, str3, false, (DialogInterface.OnClickListener) null);
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "AppBrandLaunchErrorActionAlert[%s %s]", new Object[]{this.f243118g, this.f243119h});
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f243118g);
        parcel.writeString(this.f243119h);
    }

    public AppBrandLaunchErrorActionAlert(Parcel parcel) {
        super(parcel);
        this.f243118g = parcel.readString();
        this.f243119h = parcel.readString();
    }
}
