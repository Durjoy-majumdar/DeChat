package p225rc;

import android.app.Activity;
import android.content.DialogInterface;
import p918s2.C90111a;

/* renamed from: rc.k$$b */
public class k$$b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f258405d;

    /* renamed from: e */
    public final /* synthetic */ String f258406e;

    /* renamed from: f */
    public final /* synthetic */ int f258407f;

    public k$$b(Activity activity, String str, int i) {
        this.f258405d = activity;
        this.f258406e = str;
        this.f258407f = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C90111a.m112741e(this.f258405d, new String[]{this.f258406e}, this.f258407f);
    }
}
