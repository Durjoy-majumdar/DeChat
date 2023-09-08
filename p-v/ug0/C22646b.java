package ug0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.security.p023ui.MySafeDeviceDetailUI;
import di3.C86312j;
import l31.C61212e;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: ug0.b */
public final class C22646b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MySafeDeviceDetailUI f65133d;

    public C22646b(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f65133d = mySafeDeviceDetailUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f65133d;
        int i2 = MySafeDeviceDetailUI.f49167j;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", dialogInterface, C90364q0.m113147f(new C13604l("view_id", "delete_device_confirm_alert_cancel_btn"), new C13604l("is_login", Integer.valueOf(mySafeDeviceDetailUI.mo22057I7() ? 1 : 0)), new C13604l("is_main_device", Integer.valueOf(this.f65133d.mo22056H7() ? 1 : 0))), 28198);
    }
}
