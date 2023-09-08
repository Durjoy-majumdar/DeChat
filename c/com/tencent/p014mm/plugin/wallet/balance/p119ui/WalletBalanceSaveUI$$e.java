package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$e */
public class WalletBalanceSaveUI$$e implements C102720b.C78973a {

    /* renamed from: d */
    public final /* synthetic */ ImageView f207857d;

    /* renamed from: e */
    public final /* synthetic */ WalletBalanceSaveUI f207858e;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceSaveUI$$e$a */
    public class C71693a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f207859d;

        public C71693a(Bitmap bitmap) {
            this.f207859d = bitmap;
        }

        public void run() {
            ImageView imageView;
            WalletBalanceSaveUI$$e walletBalanceSaveUI$$e = WalletBalanceSaveUI$$e.this;
            if (walletBalanceSaveUI$$e.f207858e.f207834f != null && (imageView = walletBalanceSaveUI$$e.f207857d) != null && imageView.getTag() != null && WalletBalanceSaveUI$$e.this.f207857d.getTag().equals(WalletBalanceSaveUI$$e.this.f207858e.f207834f.field_bindSerial)) {
                WalletBalanceSaveUI$$e.this.f207857d.setImageBitmap(this.f207859d);
            }
        }
    }

    public WalletBalanceSaveUI$$e(WalletBalanceSaveUI walletBalanceSaveUI, ImageView imageView) {
        this.f207858e = walletBalanceSaveUI;
        this.f207857d = imageView;
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        MMHandlerThread.postToMainThread(new C71693a(bitmap));
    }
}
