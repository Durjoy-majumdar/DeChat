package a63;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: a63.d */
public class C39499d implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f106062d;

    /* renamed from: e */
    public final /* synthetic */ Activity f106063e;

    public C39499d(boolean z, Activity activity) {
        this.f106062d = z;
        this.f106063e = activity;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (this.f106062d) {
            this.f106063e.finish();
        }
    }
}
