package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.app.Dialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CloseFingerPrintEvent;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import f40.C86709a0;
import nj3.C76879j;
import v53.C78342e0;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.o */
public class C72047o implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ WalletPasswordSettingUI f209001d;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.o$a */
    public class C72048a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CloseFingerPrintEvent f209002d;

        /* renamed from: e */
        public final /* synthetic */ Dialog f209003e;

        public C72048a(CloseFingerPrintEvent closeFingerPrintEvent, Dialog dialog) {
            this.f209002d = closeFingerPrintEvent;
            this.f209003e = dialog;
        }

        public void run() {
            if (this.f209002d.f78760e != null) {
                Dialog dialog = this.f209003e;
                if (dialog != null) {
                    dialog.dismiss();
                }
                if (this.f209002d.f78760e.f78762a == 0) {
                    WalletPasswordSettingUI walletPasswordSettingUI = C72047o.this.f209001d;
                    int i = WalletPasswordSettingUI.f208872G;
                    walletPasswordSettingUI.mo99227O7(false);
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C78342e0((String) null, 19));
                    return;
                }
                WalletPasswordSettingUI.m84421H7(C72047o.this.f209001d, 0);
                WalletPasswordSettingUI walletPasswordSettingUI2 = C72047o.this.f209001d;
                C76879j.m92712F(walletPasswordSettingUI2, walletPasswordSettingUI2.getResources().getString(C0966R.string.eua), "", true);
            }
        }
    }

    public C72047o(WalletPasswordSettingUI walletPasswordSettingUI) {
        this.f209001d = walletPasswordSettingUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Dialog d = C75197d0.m90163d(this.f209001d.getContext(), false, false, (DialogInterface.OnCancelListener) null);
        CloseFingerPrintEvent closeFingerPrintEvent = new CloseFingerPrintEvent();
        closeFingerPrintEvent.callback = new C72048a(closeFingerPrintEvent, d);
        closeFingerPrintEvent.asyncPublish(this.f209001d.getMainLooper());
    }
}
