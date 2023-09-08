package im0;

import android.content.DialogInterface;
import gt0.C87325b;
import im0.C87754e;
import java.util.HashMap;

public class e$b$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C87325b f254070d;

    /* renamed from: e */
    public final /* synthetic */ C87754e.C87756b f254071e;

    public e$b$$b(C87754e.C87756b bVar, C87325b bVar2) {
        this.f254071e = bVar;
        this.f254070d = bVar2;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("confirm", Boolean.TRUE);
        hashMap.put("cancel", Boolean.FALSE);
        if (this.f254071e.f254055h) {
            hashMap.put("content", this.f254070d.mo107527g());
        }
        C87754e.C87756b bVar = this.f254071e;
        bVar.f254051d.mo109647a(bVar.f254057j, C87754e.this.mo115112m("ok", hashMap));
    }
}
