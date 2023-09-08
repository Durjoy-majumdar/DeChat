package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;

/* renamed from: o43.d */
public class C109944d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328943d;

    public C109944d(VoipCSMainUI voipCSMainUI) {
        this.f328943d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f328943d.mo153175J7(0);
    }
}
