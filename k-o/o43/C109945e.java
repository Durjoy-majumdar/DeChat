package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;

/* renamed from: o43.e */
public class C109945e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328944d;

    public C109945e(VoipCSMainUI voipCSMainUI) {
        this.f328944d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f328944d.mo153175J7(0);
    }
}
