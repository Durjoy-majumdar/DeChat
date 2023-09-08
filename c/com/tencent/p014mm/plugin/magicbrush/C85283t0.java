package com.tencent.p014mm.plugin.magicbrush;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoBizPkgManagement;
import com.tencent.p014mm.plugin.magicbrush.demo.bizlogic.MagicBrushDemoPublicServiceBizPkgManagement;
import com.tencent.p014mm.plugin.magicbrush.scldemo.biz.MagicSclDemoPkgManager;
import d42.C58106u;
import d42.C86186n;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f70.C86764b;
import f70.C86776g;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import q42.C89462a;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C90363p0;

@C86522b(dependencies = {C30211n0.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND1})
/* renamed from: com.tencent.mm.plugin.magicbrush.t0 */
public final class C85283t0 extends C86301e implements C58106u {

    /* renamed from: com.tencent.mm.plugin.magicbrush.t0$a */
    public static final class C85284a extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C85284a f248441d = new C85284a();

        public C85284a() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicBrushDemoBizPkgManagement(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.t0$b */
    public static final class C85285b extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C85285b f248442d = new C85285b();

        public C85285b() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicBrushDemoPublicServiceBizPkgManagement(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.t0$c */
    public static final class C85286c extends C87413o implements C32226l<String, C86186n> {

        /* renamed from: d */
        public static final C85286c f248443d = new C85286c();

        public C85286c() {
            super(1);
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "instanceName");
            return new MagicSclDemoPkgManager(str);
        }
    }

    public HashSet<FlutterPlugin> Ni0() {
        C86764b bVar = new C86764b();
        C89462a aVar = new C89462a(bVar);
        return C110826x0.m151014b(bVar, aVar, new C86776g(C90363p0.m113143b(new C13604l(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO, aVar))));
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        super.onCreate(context);
        C30211n0 n0Var = (C30211n0) C86312j.m106911c(C30211n0.class);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRUSH_DEMO, C85284a.f248441d);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRUSH_PUBLIC_SERVICE_DEMO, C85285b.f248442d);
        n0Var.mo57229My(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO, C85286c.f248443d);
    }
}
