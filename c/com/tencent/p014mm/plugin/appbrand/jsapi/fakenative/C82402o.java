package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import gs0.C32515a;
import gs0.C87324b;
import gy3.C87412m;
import hp3.C87581a;
import kr0.C88267e;
import rx3.C13598b0;
import x20.C15618a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.o */
public final class C82402o<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ AppBrandRuntimeWC f241469a;

    /* renamed from: b */
    public final /* synthetic */ C88267e f241470b;

    /* renamed from: c */
    public final /* synthetic */ int f241471c;

    /* renamed from: d */
    public final /* synthetic */ C82399k f241472d;

    public C82402o(AppBrandRuntimeWC appBrandRuntimeWC, C88267e eVar, int i, C82399k kVar) {
        this.f241469a = appBrandRuntimeWC;
        this.f241470b = eVar;
        this.f241471c = i;
        this.f241472d = kVar;
    }

    public Object call(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C87324b.C32517a aVar = C87324b.f253068f;
        AppBrandInitConfigWC M1 = this.f241469a.mo113210l1();
        C87412m.m108593f(M1, "runtime.initConfig");
        StringBuilder sb = new StringBuilder();
        sb.append(M1.f239362d);
        sb.append('_');
        sb.append(M1.f239365g);
        sb.append('_');
        sb.append(M1.f234802F);
        sb.append('_');
        sb.append(C85875k4.m106211z() ? "dark" : "normal");
        sb.append('_');
        sb.append(Util.nowMilliSecond());
        sb.append(".png");
        String sb4 = sb.toString();
        String str = M1.f239362d;
        C87412m.m108593f(str, "config.appId");
        C86009m1 m1Var = new C86009m1(aVar.mo58670b(str), sb4);
        C86009m1 l = m1Var.mo119974l();
        if (l != null) {
            l.mo119987x();
        }
        String m1Var2 = m1Var.toString();
        C87412m.m108593f(m1Var2, "VFSFile(generateDir(conf…le?.mkdirs() }.toString()");
        C88267e eVar = this.f241470b;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f241469a;
        int i = this.f241471c;
        C82399k kVar = this.f241472d;
        C87412m.m108591d(bitmap);
        BitmapUtil.saveBitmapToImage(bitmap, 100, Bitmap.CompressFormat.PNG, m1Var2, true);
        Log.m105924i("MicroMsg.AppBrand.JsApiSaveRuntimeSnapshot", "saveBitmap ok, appId=" + eVar.getAppId() + ", path=" + m1Var2);
        C32515a aVar2 = new C32515a();
        aVar2.field_appId = appBrandRuntimeWC.f238147j;
        aVar2.field_versionType = appBrandRuntimeWC.f238149o.f239365g;
        aVar2.field_appVersion = appBrandRuntimeWC.mo121252j1();
        aVar2.field_isDarkMode = C85875k4.m106211z();
        aVar2.field_screenshotFilePath = m1Var2;
        C15618a.m14626b(aVar2, C29512m.f80391d, new C1682n(eVar, i, kVar, m1Var2));
        return C13598b0.f38549a;
    }
}
