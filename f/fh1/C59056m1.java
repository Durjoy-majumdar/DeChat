package fh1;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C58468e0;
import gy3.C8479f0;
import java.util.HashMap;

/* renamed from: fh1.m1 */
public final class C59056m1 implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C59018f2 f168972d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<String> f168973e;

    public C59056m1(C59018f2 f2Var, C8479f0<String> f0Var) {
        this.f168972d = f2Var;
        this.f168973e = f0Var;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        HashMap<String, Bitmap> hashMap = C59018f2.f168857P;
        Log.m105924i("Finder.LivePromoteBannerController", "dismiss half dialog");
        C59018f2 f2Var = this.f168972d;
        f2Var.f168874L = null;
        f2Var.f168887w = true;
        f2Var.mo84250R3();
        ((C58468e0) C86312j.m106911c(C58468e0.class)).mo70773V3((String) this.f168973e.f27484d);
        FinderLiveService.f159376d.mo77608K();
    }
}
