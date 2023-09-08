package or0;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: or0.c */
public final class C11725c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AbsWxaShortLinkLauncher f34306d;

    /* renamed from: e */
    public final /* synthetic */ Activity f34307e;

    /* renamed from: f */
    public final /* synthetic */ String f34308f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f34309g;

    public C11725c(AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        this.f34306d = absWxaShortLinkLauncher;
        this.f34307e = activity;
        this.f34308f = str;
        this.f34309g = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f34306d.mo63359e(this.f34307e, this.f34308f);
        C32226l<WxaShortLinkLaunchErrorCode, C13598b0> lVar = this.f34309g;
        if (lVar != null) {
            lVar.invoke(WxaShortLinkLaunchErrorCode.USER_CANCEL);
        }
    }
}
