package wl0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wl0.d */
public class C91024d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C91028g f261149d;

    public C91024d(C91028g gVar) {
        this.f261149d = gVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo cancel by pressing back");
        this.f261149d.mo125080e(13001, "system NFC switch not opened");
    }
}
