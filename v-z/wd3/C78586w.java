package wd3;

import android.graphics.Bitmap;
import android.widget.PopupWindow;

/* renamed from: wd3.w */
public class C78586w implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f230211d;

    public C78586w(Bitmap bitmap) {
        this.f230211d = bitmap;
    }

    public void onDismiss() {
        Bitmap bitmap = this.f230211d;
        if (bitmap != null) {
            bitmap.isRecycled();
        }
    }
}
