package com.tencent.p014mm.plugin.sns.cover.preview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverNoFadeImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Bitmap;", "bm", "Lrx3/b0;", "setImageBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sns-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverNoFadeImageView */
public final class SnsCoverNoFadeImageView extends AppCompatImageView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverNoFadeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Bitmap bitmap = null;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        if (bitmap != null) {
            if ((((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth()) > (((float) i2) * 1.0f) / ((float) i)) {
                setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        float height = (getWidth() <= 0 || getHeight() <= 0) ? 1.7777778f : (((float) getHeight()) * 1.0f) / ((float) getWidth());
        if (bitmap != null) {
            if ((((float) bitmap.getHeight()) * 1.0f) / ((float) bitmap.getWidth()) >= height) {
                setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else if (bitmap.getHeight() >= bitmap.getWidth()) {
                setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else {
                super.setImageBitmap((Bitmap) null);
                return;
            }
        }
        super.setImageBitmap(bitmap);
    }
}
