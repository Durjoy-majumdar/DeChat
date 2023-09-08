package im0;

import android.content.DialogInterface;
import im0.C87754e;
import java.util.HashMap;

public class e$b$$d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C87754e.C87756b f254073d;

    public e$b$$d(C87754e.C87756b bVar) {
        this.f254073d = bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        HashMap hashMap = new HashMap();
        hashMap.put("confirm", Boolean.FALSE);
        hashMap.put("cancel", Boolean.TRUE);
        C87754e.C87756b bVar = this.f254073d;
        bVar.f254051d.mo109647a(bVar.f254057j, C87754e.this.mo115112m("ok", hashMap));
    }
}
