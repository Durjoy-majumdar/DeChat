package us2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8477a0;
import qo3.C101218e0;

/* renamed from: us2.j */
public final class C102081j implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f300600a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0.C12907m f300601b;

    /* renamed from: c */
    public final /* synthetic */ C101218e0.C12907m f300602c;

    public C102081j(C8477a0 a0Var, C101218e0.C12907m mVar, C101218e0.C12907m mVar2) {
        this.f300600a = a0Var;
        this.f300601b = mVar;
        this.f300602c = mVar2;
    }

    public final void dismiss() {
        SnsMethodCalculate.markStartTimeMs("dismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$3");
        if (this.f300600a.f27482d) {
            this.f300601b.mo2001a();
        } else {
            this.f300602c.mo2001a();
        }
        SnsMethodCalculate.markEndTimeMs("dismiss", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$3");
    }
}
