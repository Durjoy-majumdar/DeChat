package y12;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.kidswatch.p066ui.reg.KidsWatchRegMobileVerifyUI;
import f40.C86709a0;
import w12.C65924c;

/* renamed from: y12.c */
public final class C112368c implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C65924c f336431d;

    /* renamed from: e */
    public final /* synthetic */ KidsWatchRegMobileVerifyUI f336432e;

    public C112368c(C65924c cVar, KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
        this.f336431d = cVar;
        this.f336432e = kidsWatchRegMobileVerifyUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f336431d);
        C86709a0.m107524d().mo123470p(5888, this.f336432e);
    }
}
