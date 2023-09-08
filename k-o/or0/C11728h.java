package or0;

import android.app.Activity;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: or0.h */
public final class C11728h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AbsWxaShortLinkLauncher f34318d;

    /* renamed from: e */
    public final /* synthetic */ Activity f34319e;

    /* renamed from: f */
    public final /* synthetic */ String f34320f;

    /* renamed from: g */
    public final /* synthetic */ C32226l<WxaShortLinkLaunchErrorCode, C13598b0> f34321g;

    public C11728h(AbsWxaShortLinkLauncher absWxaShortLinkLauncher, Activity activity, String str, C32226l<? super WxaShortLinkLaunchErrorCode, C13598b0> lVar) {
        this.f34318d = absWxaShortLinkLauncher;
        this.f34319e = activity;
        this.f34320f = str;
        this.f34321g = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f34318d.mo63359e(this.f34319e, this.f34320f);
        C32226l<WxaShortLinkLaunchErrorCode, C13598b0> lVar = this.f34321g;
        if (lVar != null) {
            lVar.invoke(WxaShortLinkLaunchErrorCode.USER_CANCEL);
        }
    }
}
