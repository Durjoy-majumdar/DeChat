package p406zn;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.packagemanager.MagicAdBrandServicePkgManager;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.packagemanager.MagicBrandServicePkgManager;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: zn.n */
public final class C39406n extends C86301e {

    /* renamed from: zn.n$a */
    public static final class C39407a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C39407a f105873d = new C39407a();

        public C39407a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicAdBrandServicePkgManager(str);
        }
    }

    /* renamed from: zn.n$b */
    public static final class C39408b extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C39408b f105874d = new C39408b();

        public C39408b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicBrandServicePkgManager(str);
        }
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        C30211n0 n0Var = (C30211n0) C86312j.m106911c(C30211n0.class);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, C39407a.f105873d);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE, C39408b.f105874d);
    }
}
