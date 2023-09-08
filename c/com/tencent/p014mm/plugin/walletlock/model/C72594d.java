package com.tencent.p014mm.plugin.walletlock.model;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.autogen.events.StartWalletLockUIEvent;
import com.tencent.p014mm.plugin.walletlock.fingerprint.p897ui.FingerprintWalletLockUI;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.walletlock.model.d */
public class C72594d extends IStaticListener<StartWalletLockUIEvent> {
    public boolean callback(IEvent iEvent) {
        StartWalletLockUIEvent startWalletLockUIEvent = (StartWalletLockUIEvent) iEvent;
        if (startWalletLockUIEvent != null) {
            Intent intent = startWalletLockUIEvent.f193942d.f193945b;
            int intExtra = intent.getIntExtra("key_wallet_lock_type", -1);
            if (startWalletLockUIEvent.f193942d.f193944a != null) {
                Log.m105925i("MicroMsg.StartWalletLockUIListener", "alvinluo startWalletLockUI type: %d", Integer.valueOf(intExtra));
                if (intExtra == 2) {
                    intent.setClass(startWalletLockUIEvent.f193942d.f193944a, FingerprintWalletLockUI.class);
                } else if (intExtra == 1) {
                    intent.setClass(startWalletLockUIEvent.f193942d.f193944a, GestureGuardLogicUI.class);
                }
                StartWalletLockUIEvent.C67793a aVar = startWalletLockUIEvent.f193942d;
                Activity activity = aVar.f193944a;
                int i = aVar.f193946c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                aVar2.mo10233c(intent);
                C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/walletlock/model/StartWalletLockUIListener", "callback", "(Lcom/tencent/mm/autogen/events/StartWalletLockUIEvent;)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                startWalletLockUIEvent.f193943e.f193947a = true;
            } else {
                startWalletLockUIEvent.f193943e.f193947a = false;
            }
            Log.m105925i("MicroMsg.StartWalletLockUIListener", "alvinluo isSuccess: %b", Boolean.valueOf(startWalletLockUIEvent.f193943e.f193947a));
        }
        return false;
    }
}
