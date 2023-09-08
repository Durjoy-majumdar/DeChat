package us2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8477a0;
import qo3.C101218e0;

/* renamed from: us2.i */
public final class C102080i implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ boolean f300596a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0.C12907m f300597b;

    /* renamed from: c */
    public final /* synthetic */ C8477a0 f300598c;

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f300599d;

    public C102080i(boolean z, C101218e0.C12907m mVar, C8477a0 a0Var, C101218e0 e0Var) {
        this.f300596a = z;
        this.f300597b = mVar;
        this.f300598c = a0Var;
        this.f300599d = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$2");
        if (!this.f300596a) {
            this.f300597b.mo2001a();
        } else {
            this.f300598c.f27482d = true;
            this.f300599d.mo140680z();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$2");
    }
}
