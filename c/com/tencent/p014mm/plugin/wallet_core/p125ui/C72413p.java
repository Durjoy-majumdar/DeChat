package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.content.Intent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.p */
public class C72413p extends C72392k {
    public C72413p(WalletCheckPwdNewUI walletCheckPwdNewUI) {
        super(walletCheckPwdNewUI);
    }

    /* renamed from: b */
    public void mo80735b(String str) {
        Intent intent = new Intent();
        intent.putExtra("encrypt_pwd", str);
        this.f210612a.setResult(-1, intent);
        this.f210612a.finish();
    }

    public void onCreate() {
        String stringExtra = this.f210612a.getIntent().getStringExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f210612a.f210012e.setText(stringExtra);
        }
        String stringExtra2 = this.f210612a.getIntent().getStringExtra("subtitle");
        if (!Util.isNullOrNil(stringExtra2)) {
            this.f210612a.f210013f.setText(stringExtra2);
        }
    }

    public void onDestroy() {
    }
}
