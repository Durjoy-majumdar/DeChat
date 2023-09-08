package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.u3 */
public class C71159u3 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ SettingsUI f205957d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.u3$a */
    public class C71160a implements Runnable {
        public C71160a() {
        }

        public void run() {
            C86709a0.m107524d().mo123470p(281, C71159u3.this.f205957d.f205820g);
            C71159u3.this.f205957d.f205820g = null;
        }
    }

    public C71159u3(SettingsUI settingsUI) {
        this.f205957d = settingsUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        MMHandlerThread.postToMainThread(new C71160a());
    }
}
