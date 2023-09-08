package ql0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84731d0;
import op0.C89251a;

/* renamed from: ql0.c */
public class C89703c extends C89699b {
    public static final int CTRL_INDEX = 1183;
    public static final String NAME = "createLoadSubPackageTaskForWaiter";

    /* renamed from: y */
    public static String m112169y(String str) {
        return "AwaitTagLoadSubPackage_" + str;
    }

    /* renamed from: v */
    public void mo124021v(C82381f fVar, String str) {
        C84731d0.m104389a(fVar).mo117457h(m112169y(str));
    }

    /* renamed from: x */
    public void mo124020x(C82381f fVar, String str, C89251a.C89255d dVar, String str2, String str3) {
        super.mo124020x(fVar, str, dVar, str2, str3);
        C84731d0.m104389a(fVar).mo117455a0(m112169y(str), dVar);
    }
}
