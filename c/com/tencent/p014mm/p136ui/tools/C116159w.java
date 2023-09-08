package com.tencent.p014mm.p136ui.tools;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.w */
public class C116159w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CropImageNewUI f348614d;

    public C116159w(CropImageNewUI cropImageNewUI) {
        this.f348614d = cropImageNewUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        CropImageView cropImageView = this.f348614d.f348468h;
        Bitmap bitmap = cropImageView.f348494e;
        if (bitmap == null) {
            Log.m105928w("MicroMsg.CropImageView", "rotate not done! cause: btmp is null!");
        } else {
            float[] fArr = {(float) (bitmap.getWidth() / 2), (float) (cropImageView.f348494e.getHeight() / 2)};
            cropImageView.getImageMatrix().mapPoints(fArr);
            cropImageView.getImageMatrix().postRotate(90.0f, fArr[0], fArr[1]);
            cropImageView.setImageBitmap(cropImageView.f348494e);
            cropImageView.invalidate();
            cropImageView.f348512z++;
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/tools/CropImageNewUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
