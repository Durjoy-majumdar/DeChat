package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallRoundUrlHeadImage */
public class IPCallRoundUrlHeadImage extends CdnImageView {
    public IPCallRoundUrlHeadImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setImageBitmapCompleted(Bitmap bitmap) {
        if (bitmap != null) {
            setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.5f));
        }
    }

    public IPCallRoundUrlHeadImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
