package io0;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.zip.ZipInputStream;
import p823sg.C90193h;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;
import z04.C119027c;

/* renamed from: io0.h */
public final class C33371h {

    /* renamed from: a */
    public static final C33371h f90436a = new C33371h();

    /* renamed from: b */
    public static final C13601g f90437b = C36568h.m40985a(C9227a.f28965d);

    /* renamed from: io0.h$a */
    public static final class C9227a extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C9227a f28965d = new C9227a();

        public C9227a() {
            super(0);
        }

        public Object invoke() {
            C86009m1 m1Var = new C86009m1(C112760b.m154195C(), "wxacache");
            C86013q1.m106461v(m1Var.mo119971i());
            C86009m1 m1Var2 = new C86009m1(m1Var, "unzip");
            C86013q1.m106461v(m1Var2.mo119971i());
            return m1Var2;
        }
    }

    /* renamed from: a */
    public final C86009m1 mo59110a(C82381f fVar, String str) {
        C87412m.m108594g(fVar, "component");
        C87412m.m108594g(str, "zipPath");
        boolean z = true;
        if (!C112551y.m153819s(str, "wxfile://", true) && !C112551y.m153819s(str, "http", true)) {
            str = fVar.getAppId() + '_' + str;
        }
        Log.m105918d("MicroMsg.AppBrand.AppBrandUnzipLogic", "generateUnzipPath, rawUnzipPath: " + str);
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        if (!(f == null || f.length() == 0)) {
            z = false;
        }
        if (!z) {
            return new C86009m1((C86009m1) ((C36570n) f90437b).getValue(), f);
        }
        Log.m105928w("MicroMsg.AppBrand.AppBrandUnzipLogic", "getUnzipDir, unzipPathName is empty");
        return null;
    }

    /* renamed from: b */
    public final C86009m1 mo59111b(ZipInputStream zipInputStream, C86009m1 m1Var) {
        C87412m.m108594g(zipInputStream, "zipInputStream");
        C87412m.m108594g(m1Var, "unzipDir");
        int j = C81412d0.m99876j(zipInputStream, m1Var.mo119971i());
        Log.m105924i("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, unzipRet: " + j);
        if (j != 0) {
            return null;
        }
        if (C33370f.f90435a.mo59108b(m1Var)) {
            return m1Var;
        }
        Log.m105928w("MicroMsg.AppBrand.AppBrandUnzipLogic", "unzip, record fail");
        return null;
    }
}
