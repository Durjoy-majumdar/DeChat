package com.tencent.p014mm.p136ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.x1 */
public class C6811x1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingImageBGView f24367d;

    public C6811x1(ChattingImageBGView chattingImageBGView) {
        this.f24367d = chattingImageBGView;
    }

    public void run() {
        Bitmap bitmap = this.f24367d.f24303d;
        if (bitmap == null) {
            Log.m105928w("MicroMsg.ChattingImageBGView", "want to reset matrix, but bmp is null");
            return;
        }
        if (bitmap.getWidth() == 0) {
            Log.m105928w("MicroMsg.ChattingImageBGView", "want to reset matrix, but measured width error");
        }
        Matrix matrix = new Matrix();
        float measuredWidth = ((float) this.f24367d.getMeasuredWidth()) / ((float) this.f24367d.f24303d.getWidth());
        float measuredHeight = ((float) this.f24367d.getMeasuredHeight()) / ((float) this.f24367d.f24303d.getHeight());
        Log.m105919d("MicroMsg.ChattingImageBGView", "scaleW[%f], scaleH[%f] measured width[%d] measured height[%d]", Float.valueOf(measuredWidth), Float.valueOf(measuredHeight), Integer.valueOf(this.f24367d.getMeasuredWidth()), Integer.valueOf(this.f24367d.getMeasuredHeight()));
        if (measuredWidth > measuredHeight) {
            matrix.setScale(measuredWidth, measuredWidth);
        } else {
            matrix.setScale(measuredHeight, measuredHeight);
            matrix.postTranslate((((float) this.f24367d.getMeasuredWidth()) - (((float) this.f24367d.f24303d.getWidth()) * measuredHeight)) / 2.0f, 0.0f);
        }
        this.f24367d.setImageMatrix(matrix);
    }
}
