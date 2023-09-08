package com.tencent.p014mm.plugin.offline.p085ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$l */
public class WalletOfflineCoinPurseUI$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Integer f201967d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f201968e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f201969f;

    public WalletOfflineCoinPurseUI$$l(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, Integer num, ImageView imageView, Bitmap bitmap) {
        this.f201967d = num;
        this.f201968e = imageView;
        this.f201969f = bitmap;
    }

    public void run() {
        int intValue = this.f201967d.intValue();
        ImageView imageView = this.f201968e;
        if (imageView instanceof WeImageView) {
            ((WeImageView) imageView).setEnableColorFilter(false);
        }
        this.f201968e.setImageBitmap(BitmapUtil.extractThumbNail(this.f201969f, intValue, intValue, true, false));
    }
}
