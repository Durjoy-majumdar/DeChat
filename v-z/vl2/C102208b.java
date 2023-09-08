package vl2;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import ml2.C10931f;

/* renamed from: vl2.b */
public class C102208b implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C94528d.C94529a f300902d;

    /* renamed from: e */
    public final /* synthetic */ C102210d f300903e;

    public C102208b(C102210d dVar, C94528d.C94529a aVar) {
        this.f300903e = dVar;
        this.f300902d = aVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C94528d.C94529a aVar = this.f300902d;
        if (aVar != null) {
            aVar.mo55548a((C94528d) null);
        }
        C10931f.C10933a aVar2 = this.f300903e.f300919t;
        if (aVar2 != null) {
            aVar2.mo361b(1, (Bundle) null);
        }
    }
}
