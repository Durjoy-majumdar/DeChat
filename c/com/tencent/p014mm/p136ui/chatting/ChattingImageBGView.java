package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.ChattingImageBGView */
public class ChattingImageBGView extends ImageView {

    /* renamed from: d */
    public Bitmap f24303d;

    /* renamed from: e */
    public int f24304e = 0;

    public ChattingImageBGView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.f24304e != (i5 = i3 - i)) {
            this.f24304e = i5;
            Log.m105919d("MicroMsg.ChattingImageBGView", "on layout changed, %d, %d, %d, %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            post(new C6811x1(this));
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f24303d = bitmap;
        super.setImageBitmap(bitmap);
        post(new C6811x1(this));
    }

    public ChattingImageBGView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
