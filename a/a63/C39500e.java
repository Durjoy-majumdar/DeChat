package a63;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: a63.e */
public class C39500e implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ boolean f106064d;

    /* renamed from: e */
    public final /* synthetic */ Activity f106065e;

    public C39500e(boolean z, Activity activity) {
        this.f106064d = z;
        this.f106065e = activity;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f106064d) {
            this.f106065e.finish();
        }
    }
}
