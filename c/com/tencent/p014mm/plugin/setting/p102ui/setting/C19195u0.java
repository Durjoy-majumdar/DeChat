package com.tencent.p014mm.plugin.setting.p102ui.setting;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.u0 */
public final class C19195u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f54006d;

    /* renamed from: e */
    public final /* synthetic */ SettingManageFindMoreDetailUI f54007e;

    /* renamed from: f */
    public final /* synthetic */ boolean f54008f;

    public C19195u0(boolean z, SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, boolean z2) {
        this.f54006d = z;
        this.f54007e = settingManageFindMoreDetailUI;
        this.f54008f = z2;
    }

    public final void run() {
        if (!this.f54006d) {
            this.f54007e.mo24557M7(this.f54008f, 2097152, 50);
        }
    }
}
