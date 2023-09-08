package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b */
public class WalletLqtSaveFetchUI$$b implements C102720b.C78973a {

    /* renamed from: d */
    public final /* synthetic */ WalletLqtSaveFetchUI f208226d;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI$$b$a */
    public class C71766a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f208227d;

        public C71766a(Bitmap bitmap) {
            this.f208227d = bitmap;
        }

        public void run() {
            ImageView imageView;
            WalletLqtSaveFetchUI walletLqtSaveFetchUI = WalletLqtSaveFetchUI$$b.this.f208226d;
            if (walletLqtSaveFetchUI.f208177V != null && (imageView = walletLqtSaveFetchUI.f208207p) != null && imageView.getTag() != null && WalletLqtSaveFetchUI$$b.this.f208226d.f208207p.getTag().equals(WalletLqtSaveFetchUI$$b.this.f208226d.f208177V.field_bindSerial)) {
                WalletLqtSaveFetchUI$$b.this.f208226d.f208207p.setImageBitmap(this.f208227d);
            }
        }
    }

    public WalletLqtSaveFetchUI$$b(WalletLqtSaveFetchUI walletLqtSaveFetchUI) {
        this.f208226d = walletLqtSaveFetchUI;
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        MMHandlerThread.postToMainThread(new C71766a(bitmap));
    }
}
