package p467co;

import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f70.C86764b;
import gy3.C87412m;
import p150eo.C86596j;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p493do.C86380f;

/* renamed from: co.a */
public final class C80110a extends C80112c {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C80110a(C86764b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "mbPlugin");
    }

    /* renamed from: F */
    public void mo110351F(String str, MagicSclBrandReporter.PreloadScene preloadScene) {
        C87412m.m108594g(str, "frameSetId");
        C87412m.m108594g(preloadScene, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
        C86596j jVar = this.f234604j;
        magicSclBrandReporter.mo112793d(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, preloadScene, jVar != null ? jVar.f251539s : false);
    }

    /* renamed from: G */
    public void mo110352G(String str, MagicSclBrandReporter.PreloadScene preloadScene) {
        C87412m.m108594g(str, "frameSetId");
        C87412m.m108594g(preloadScene, "preloadScene");
        MagicSclBrandReporter magicSclBrandReporter = MagicSclBrandReporter.f237836a;
        C86596j jVar = this.f234604j;
        magicSclBrandReporter.mo112794e(str, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE, preloadScene, jVar != null ? jVar.f251539s : false);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        super.onDetachedFromEngine(flutterPluginBinding);
        ((C86380f) C86312j.m106911c(C86380f.class)).mo120804O4(1);
        this.f234604j = null;
    }
}
