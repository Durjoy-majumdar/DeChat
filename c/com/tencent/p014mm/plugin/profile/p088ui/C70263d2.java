package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import cw0.C116541b;

/* renamed from: com.tencent.mm.plugin.profile.ui.d2 */
public class C70263d2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NormalUserFooterPreference.C70154c f203017d;

    public C70263d2(NormalUserFooterPreference.C70154c cVar) {
        this.f203017d = cVar;
    }

    public void run() {
        if (!NormalUserFooterPreference.this.f202653d1.isFinishing()) {
            NormalUserFooterPreference normalUserFooterPreference = NormalUserFooterPreference.this;
            C116541b.m164352b(normalUserFooterPreference.f202653d1, normalUserFooterPreference.f202624J.getUsername(), true);
            C116541b.m164360j(NormalUserFooterPreference.this.f202653d1);
        }
    }
}
