package com.tencent.kinda.framework.app;

import android.app.Activity;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.KJumpRemindInfo;
import com.tencent.kinda.gen.KRedirectUrl;
import com.tencent.kinda.gen.KindaJumpRemindManager;
import com.tencent.kinda.gen.VoidBoolStringCallback;
import com.tencent.p014mm.wallet_core.model.C75124l;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import te3.C77942hl2;
import te3.C78024zp3;

public class KindaJumpRemindManagerImpl implements KindaJumpRemindManager {
    /* access modifiers changed from: private */
    public JumpRemind jumpRemind = new JumpRemind();

    public void jumpRemindImpl(KJumpRemindInfo kJumpRemindInfo, int i, int i2, final VoidBoolStringCallback voidBoolStringCallback, final VoidBoolStringCallback voidBoolStringCallback2) {
        C77942hl2 hl22 = new C77942hl2();
        hl22.f227571d = kJumpRemindInfo.mJumpType;
        hl22.f227572e = kJumpRemindInfo.mIsPopUpWindows;
        hl22.f227573f = kJumpRemindInfo.mWording;
        hl22.f227574g = kJumpRemindInfo.mLeftButtonWording;
        hl22.f227575h = kJumpRemindInfo.mRightButtonWording;
        C78024zp3 zp32 = new C78024zp3();
        KRedirectUrl kRedirectUrl = kJumpRemindInfo.mUrl;
        zp32.f228746d = kRedirectUrl.mType;
        zp32.f228747e = kRedirectUrl.mAppid;
        zp32.f228748f = kRedirectUrl.mAppVersion;
        zp32.f228749g = kRedirectUrl.mPath;
        zp32.f228750h = kRedirectUrl.mBtnName;
        hl22.f227576i = zp32;
        hl22.f227577j = kJumpRemindInfo.mTitle;
        JumpRemind d = JumpRemind.m90059d(hl22);
        this.jumpRemind = d;
        d.f220984m = true;
        d.mo104779a();
        this.jumpRemind.mo104784h((Activity) KindaContext.get(), new C75124l() {
            public void onCancel() {
                if (KindaJumpRemindManagerImpl.this.jumpRemind.mo104780b()) {
                    VoidBoolStringCallback voidBoolStringCallback = voidBoolStringCallback2;
                    if (voidBoolStringCallback != null) {
                        voidBoolStringCallback.call(false, (String) null);
                    }
                } else {
                    VoidBoolStringCallback voidBoolStringCallback2 = voidBoolStringCallback;
                    if (voidBoolStringCallback2 != null) {
                        voidBoolStringCallback2.call(false, (String) null);
                    }
                }
                JumpRemind access$000 = KindaJumpRemindManagerImpl.this.jumpRemind;
                access$000.f220982k.dead();
                access$000.f220983l.dead();
            }

            public void onEnter() {
            }

            public void onUrlCancel() {
                if (KindaJumpRemindManagerImpl.this.jumpRemind.mo104780b()) {
                    VoidBoolStringCallback voidBoolStringCallback = voidBoolStringCallback2;
                    if (voidBoolStringCallback != null) {
                        voidBoolStringCallback.call(false, (String) null);
                    }
                } else {
                    VoidBoolStringCallback voidBoolStringCallback2 = voidBoolStringCallback;
                    if (voidBoolStringCallback2 != null) {
                        voidBoolStringCallback2.call(false, (String) null);
                    }
                }
                JumpRemind access$000 = KindaJumpRemindManagerImpl.this.jumpRemind;
                access$000.f220982k.dead();
                access$000.f220983l.dead();
            }

            public void onUrlOk() {
                if (KindaJumpRemindManagerImpl.this.jumpRemind.mo104780b()) {
                    VoidBoolStringCallback voidBoolStringCallback = voidBoolStringCallback2;
                    if (voidBoolStringCallback != null) {
                        voidBoolStringCallback.call(true, (String) null);
                    }
                } else {
                    VoidBoolStringCallback voidBoolStringCallback2 = voidBoolStringCallback;
                    if (voidBoolStringCallback2 != null) {
                        voidBoolStringCallback2.call(true, (String) null);
                    }
                }
                JumpRemind access$000 = KindaJumpRemindManagerImpl.this.jumpRemind;
                access$000.f220982k.dead();
                access$000.f220983l.dead();
            }
        });
    }

    public void onDestroyJumpRemindManager() {
        JumpRemind jumpRemind2 = this.jumpRemind;
        if (jumpRemind2 != null) {
            jumpRemind2.f220982k.dead();
            jumpRemind2.f220983l.dead();
        }
    }
}
