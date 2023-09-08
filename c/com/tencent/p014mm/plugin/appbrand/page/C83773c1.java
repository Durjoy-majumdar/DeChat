package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.appcache.C81298o0;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1727m;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/page/c1;", "Lcom/tencent/mm/plugin/appbrand/jsapi/m;", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.page.c1 */
public final class C83773c1 implements C1727m {

    /* renamed from: d */
    public final ICommLibReader f244523d;

    /* renamed from: e */
    public final C81298o0 f244524e;

    /* renamed from: f */
    public final C13601g f244525f = C36568h.m40985a(new C83774a(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.page.c1$a */
    public static final class C83774a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C83773c1 f244526d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83774a(C83773c1 c1Var) {
            super(0);
            this.f244526d = c1Var;
        }

        public Object invoke() {
            boolean z;
            ICommLibReader iCommLibReader = this.f244526d.f244523d;
            C87412m.m108594g(iCommLibReader, "<this>");
            String[] strArr = {"lazyCodeLoading", "lazyCodeLoading2"};
            int i = 0;
            while (true) {
                z = true;
                if (i >= 2) {
                    z = false;
                    break;
                }
                String Yk0 = iCommLibReader.Yk0(strArr[i]);
                if (!(Yk0 == null || Yk0.length() == 0)) {
                    break;
                }
                i++;
            }
            if (!z) {
                Log.m105924i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return false, lib.version=[" + this.f244526d.f244523d.mo113367M() + ']');
                return Boolean.FALSE;
            } else if (this.f244526d.f244524e.mo113501d("common.app.js")) {
                Log.m105924i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by common.app.js");
                return Boolean.TRUE;
            } else {
                for (ModulePkgInfo next : this.f244526d.f244524e.mo113497a()) {
                    if (next.independent) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(next.name);
                        String str = next.name;
                        C87412m.m108593f(str, "m.name");
                        String str2 = "/";
                        if (C112551y.m153808h(str, str2, false, 2, (Object) null)) {
                            str2 = "";
                        }
                        sb.append(str2);
                        sb.append("common.app.js");
                        String sb4 = sb.toString();
                        if (this.f244526d.f244524e.mo113501d(sb4)) {
                            Log.m105924i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return true, by independent " + sb4);
                            return Boolean.TRUE;
                        }
                    }
                }
                Log.m105924i("Luggage.WXA.FULL.AppBrandPageScriptInjectConfig", "useLazyCodeLoadingMode return false");
                return Boolean.FALSE;
            }
        }
    }

    public C83773c1(ICommLibReader iCommLibReader, C81298o0 o0Var) {
        C87412m.m108594g(iCommLibReader, "libFileProvider");
        C87412m.m108594g(o0Var, "wxaPkgFileProvider");
        this.f244523d = iCommLibReader;
        this.f244524e = o0Var;
    }

    /* renamed from: a */
    public final boolean mo116114a() {
        return ((Boolean) ((C36570n) this.f244525f).getValue()).booleanValue();
    }
}
