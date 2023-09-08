package wd3;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wd3.y */
public class C15154y implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f41278d;

    public C15154y(Bitmap bitmap) {
        this.f41278d = bitmap;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Bitmap bitmap = this.f41278d;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("MicroMsg.MMConfirmDialog", "bitmap recycle %s", this.f41278d.toString());
            this.f41278d.recycle();
        }
    }
}
