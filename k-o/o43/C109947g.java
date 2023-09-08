package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip.model.C106348g0;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: o43.g */
public class C109947g implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328946d;

    public C109947g(VoipCSMainUI voipCSMainUI) {
        this.f328946d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.voipcs.VoipCSMainUI", " start voip by user choose continue call  in not wifi network!");
        C106348g0.m143246g();
        VoipCSMainUI voipCSMainUI = this.f328946d;
        int i2 = VoipCSMainUI.f318238B;
        if (voipCSMainUI.mo153173H7()) {
            this.f328946d.mo153176K7();
        }
    }
}
