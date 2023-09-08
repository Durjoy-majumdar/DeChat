package ug0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.security.p023ui.MySafeDeviceListUI;
import f40.C86709a0;
import rg0.C12998c;

/* renamed from: ug0.e */
public class C14185e implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C12998c f39630d;

    public C14185e(MySafeDeviceListUI mySafeDeviceListUI, C12998c cVar) {
        this.f39630d = cVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f39630d);
    }
}
