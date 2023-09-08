package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;

/* renamed from: o43.f */
public class C109946f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328945d;

    public C109946f(VoipCSMainUI voipCSMainUI) {
        this.f328945d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f328945d.mo153175J7(9);
    }
}
