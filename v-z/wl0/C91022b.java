package wl0;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import p225rc.C89916g;

/* renamed from: wl0.b */
public class C91022b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91028g f261147d;

    public C91022b(C91028g gVar) {
        this.f261147d = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C91028g gVar = this.f261147d;
        if (gVar.f261159g == null) {
            Log.m105920e("MicroMsg.HCEActivityMgr", "alvinluo jumpNFCSetting mHceActivity is null");
            return;
        }
        C89916g.m112446a(gVar.f261159g).mo124236j(new Intent("android.settings.NFC_SETTINGS"), new C91025e(gVar));
    }
}
