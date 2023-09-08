package com.tencent.p014mm.plugin.game.chatroom.view;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.game.commlib.view.FixAspectRatioImageView;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.FixAspectRatioAndTopCropImageView */
public class FixAspectRatioAndTopCropImageView extends FixAspectRatioImageView {
    public FixAspectRatioAndTopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        if (getDrawable() == null) {
            return super.setFrame(i, i2, i3, i4);
        }
        Matrix imageMatrix = getImageMatrix();
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = getDrawable().getIntrinsicWidth();
        int intrinsicHeight = getDrawable().getIntrinsicHeight();
        if (intrinsicWidth * height > intrinsicHeight * width) {
            f2 = (float) height;
            f = (float) intrinsicHeight;
        } else {
            f2 = (float) width;
            f = (float) intrinsicWidth;
        }
        float f3 = f2 / f;
        imageMatrix.setScale(f3, f3);
        setImageMatrix(imageMatrix);
        return super.setFrame(i, i2, i3, i4);
    }

    public FixAspectRatioAndTopCropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
