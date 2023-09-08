package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;

/* renamed from: o43.b */
public class C109942b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328941d;

    public C109942b(VoipCSMainUI voipCSMainUI) {
        this.f328941d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f328941d.mo153175J7(0);
    }
}
