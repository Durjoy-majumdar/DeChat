package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: o43.h */
public class C109948h implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328947d;

    public C109948h(VoipCSMainUI voipCSMainUI) {
        this.f328947d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", "cannot start voip by user choose cancel call  in not wifi network!");
        dialogInterface.dismiss();
        this.f328947d.mo153175J7(8);
    }
}
