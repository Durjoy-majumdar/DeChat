package wd3;

import android.content.DialogInterface;
import android.graphics.Bitmap;

/* renamed from: wd3.x */
public class C78587x implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f230212d;

    public C78587x(Bitmap bitmap) {
        this.f230212d = bitmap;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Bitmap bitmap = this.f230212d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
    }
}
