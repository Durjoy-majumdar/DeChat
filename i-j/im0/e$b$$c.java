package im0;

import android.content.DialogInterface;
import im0.C87754e;
import java.util.HashMap;

public class e$b$$c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87754e.C87756b f254072d;

    public e$b$$c(C87754e.C87756b bVar) {
        this.f254072d = bVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("confirm", Boolean.FALSE);
        hashMap.put("cancel", Boolean.TRUE);
        dialogInterface.dismiss();
        C87754e.C87756b bVar = this.f254072d;
        bVar.f254051d.mo109647a(bVar.f254057j, C87754e.this.mo115112m("ok", hashMap));
    }
}
