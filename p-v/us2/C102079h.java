package us2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C8477a0;
import qo3.C101218e0;

/* renamed from: us2.h */
public final class C102079h implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ boolean f300592a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0.C12907m f300593b;

    /* renamed from: c */
    public final /* synthetic */ C8477a0 f300594c;

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f300595d;

    public C102079h(boolean z, C101218e0.C12907m mVar, C8477a0 a0Var, C101218e0 e0Var) {
        this.f300592a = z;
        this.f300593b = mVar;
        this.f300594c = a0Var;
        this.f300595d = e0Var;
    }

    /* renamed from: a */
    public final void mo2001a() {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$1");
        if (!this.f300592a) {
            this.f300593b.mo2001a();
        } else {
            this.f300594c.f27482d = false;
            this.f300595d.mo140680z();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.RequestGeoLocationHelper$showLBSAuthDialog$1");
    }
}
