package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C11184p0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x */
public class C95281x implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C95283y f276538d;

    public C95281x(C95283y yVar) {
        this.f276538d = yVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$3");
        if (menuItem != null) {
            try {
                if (menuItem.getItemId() == 1) {
                    C95283y yVar = this.f276538d;
                    String l = yVar.mo131854m().mo140745l();
                    long j = this.f276538d.f276542B.f300101Z.f264476a;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
                    yVar.mo131827h0(l, j, 1);
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
                    C95283y.m121328b0(this.f276538d);
                }
            } catch (Throwable th) {
                Log.m105920e("ADAppointment.AdLandingPageAppointmentBtnComp", "onMMMenuItemSelected exp=" + th.toString());
            }
        }
        Context context = this.f276538d.f276579d;
        if (context instanceof SnsAdNativeLandingPagesUI) {
            C95198o2.m121133e((SnsAdNativeLandingPagesUI) context);
        }
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp$3");
    }
}
