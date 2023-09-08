package tg3;

import android.content.DialogInterface;
import com.tencent.p014mm.sandbox.updater.AppUpdaterUI;
import qo3.C77398g;

/* renamed from: tg3.i */
public class C90475i implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppUpdaterUI f260028d;

    public C90475i(AppUpdaterUI appUpdaterUI) {
        this.f260028d = appUpdaterUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C77398g gVar = this.f260028d.f249737e;
        if (gVar != null && !gVar.isShowing()) {
            this.f260028d.f249737e.show();
        }
    }
}
