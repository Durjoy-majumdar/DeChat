package o43;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.voip_cs.p845ui.VoipCSMainUI;

/* renamed from: o43.c */
public class C109943c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ VoipCSMainUI f328942d;

    public C109943c(VoipCSMainUI voipCSMainUI) {
        this.f328942d = voipCSMainUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f328942d.mo153175J7(0);
    }
}
