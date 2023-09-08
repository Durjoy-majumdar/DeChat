package wl0;

import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wl0.c */
public class C91023c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C91028g f261148d;

    public C91023c(C91028g gVar) {
        this.f261148d = gVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.HCEActivityMgr", "alvinluo user click cancel button of NFC tips dialog.");
        this.f261148d.mo125080e(13001, "system NFC switch not opened");
    }
}
