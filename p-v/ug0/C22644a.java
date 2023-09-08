package ug0;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.account.security.p023ui.MySafeDeviceDetailUI;
import di3.C86312j;
import f40.C86709a0;
import kg3.C76577a;
import l31.C61212e;
import nj3.C76879j;
import rg0.C12997b;
import rx3.C13604l;
import rx3.C36570n;
import sx3.C90364q0;

/* renamed from: ug0.a */
public final class C22644a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MySafeDeviceDetailUI f65131d;

    /* renamed from: ug0.a$a */
    public static final class C22645a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C12997b f65132d;

        public C22645a(C12997b bVar) {
            this.f65132d = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f65132d);
        }
    }

    public C22644a(MySafeDeviceDetailUI mySafeDeviceDetailUI) {
        this.f65131d = mySafeDeviceDetailUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MySafeDeviceDetailUI mySafeDeviceDetailUI = this.f65131d;
        int i2 = MySafeDeviceDetailUI.f49167j;
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("view_clk", dialogInterface, C90364q0.m113147f(new C13604l("view_id", "delete_device_confirm_alert_confirm_btn"), new C13604l("is_login", Integer.valueOf(mySafeDeviceDetailUI.mo22057I7() ? 1 : 0)), new C13604l("is_main_device", Integer.valueOf(this.f65131d.mo22056H7() ? 1 : 0))), 28198);
        C12997b bVar = new C12997b((String) ((C36570n) this.f65131d.f49169e).getValue());
        C86709a0.m107524d().mo123460f(bVar);
        MySafeDeviceDetailUI mySafeDeviceDetailUI2 = this.f65131d;
        mySafeDeviceDetailUI2.f49173i = C76879j.m92723Q(mySafeDeviceDetailUI2.getContext(), "", C76577a.m92166q(this.f65131d.getContext(), C0966R.string.nbk), true, true, new C22645a(bVar));
    }
}
