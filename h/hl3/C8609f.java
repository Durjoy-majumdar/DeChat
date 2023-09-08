package hl3;

import android.content.DialogInterface;

/* renamed from: hl3.f */
public class C8609f implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f27713d;

    public C8609f(C8606e eVar, Runnable runnable) {
        this.f27713d = runnable;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f27713d.run();
    }
}
