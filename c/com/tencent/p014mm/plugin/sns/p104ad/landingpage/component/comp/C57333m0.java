package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.AdLandingMusicComponent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.m0 */
public final class C57333m0 extends C87413o implements C32226l<Float, String> {

    /* renamed from: d */
    public static final C57333m0 f164238d = new C57333m0();

    public C57333m0() {
        super(1);
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$2");
        float floatValue = ((Number) obj).floatValue();
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$2");
        int i = (int) (floatValue / ((float) 1000));
        StringBuilder sb = new StringBuilder();
        AdLandingMusicComponent.C57324a aVar = AdLandingMusicComponent.f273730T;
        sb.append(aVar.mo80862a(i / 60));
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        sb.append(aVar.mo80862a(i % 60));
        String sb4 = sb.toString();
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$prepareAndPlay$suc$1$1$2");
        return sb4;
    }
}
