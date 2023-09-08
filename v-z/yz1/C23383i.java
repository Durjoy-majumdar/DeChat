package yz1;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.C104428a;

/* renamed from: yz1.i */
public class C23383i implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C23385k f67138d;

    public C23383i(C23385k kVar) {
        this.f67138d = kVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C23385k.m27905a(this.f67138d, false, 0, 0, 0);
        C104428a aVar = this.f67138d.f67140d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }
}
