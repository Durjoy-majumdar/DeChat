package vd3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileMobilePhoneView;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vd3.u */
public class C14438u implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ProfileMobilePhoneView f40051d;

    public C14438u(ProfileMobilePhoneView profileMobilePhoneView) {
        this.f40051d = profileMobilePhoneView;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(0, this.f40051d.getResources().getString(C0966R.string.bls), C0966R.raw.bottomsheet_icon_transmit);
        e0Var.mo107144g(1, this.f40051d.getResources().getString(C0966R.string.f7936wt), C0966R.raw.bottomsheet_icon_moment);
    }
}
