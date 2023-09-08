package kd2;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: kd2.d */
public class C76558d implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Activity f224082d;

    public C76558d(Activity activity) {
        this.f224082d = activity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        C76559f.m92105a();
        C76559f.m92106b(this.f224082d, -1);
        this.f224082d.finish();
    }
}
