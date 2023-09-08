package com.tencent.p014mm.plugin.setting.p102ui.setting;

import java.util.concurrent.Future;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.w0 */
public final class C71163w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SettingMessageRingtoneUI f205963d;

    public C71163w0(SettingMessageRingtoneUI settingMessageRingtoneUI) {
        this.f205963d = settingMessageRingtoneUI;
    }

    public final void run() {
        Future<?> future = this.f205963d.f205635d;
        if (future != null) {
            future.cancel(true);
        }
        C89779i0 i0Var = this.f205963d.f205639h;
        if (i0Var != null) {
            i0Var.hide();
        }
    }
}
