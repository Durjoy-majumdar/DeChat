package gq0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107879e0;

/* renamed from: gq0.i */
public final class C107889i implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C107869a f323047d;

    public C107889i(C107869a aVar) {
        this.f323047d = aVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onDismiss");
        C107879e0.C107882c cVar = this.f323047d.f323017n;
        if (cVar != null) {
            cVar.mo25343a();
        }
        this.f323047d.f323014h.mo158305c();
    }
}
