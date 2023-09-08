package q53;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import m53.C10757d;

/* renamed from: q53.m */
public final class C12093m implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C12041a f35180d;

    public C12093m(C12041a aVar) {
        this.f35180d = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Log.m105918d("MicroMsg.BuyGoodsBottomDialog", "setCancelCallback");
        C12041a aVar = this.f35180d;
        C10757d.C10758a aVar2 = aVar.f35073m;
        if (aVar2 != null) {
            aVar2.mo9998a(aVar, Boolean.TRUE);
        }
    }
}
